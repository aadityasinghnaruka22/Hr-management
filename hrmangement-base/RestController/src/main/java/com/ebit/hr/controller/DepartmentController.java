package com.ebit.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebit.hr.exception.UserNotFoundException;
import com.ebit.hr.model.Department;
import com.ebit.hr.service.DepartmentService;


@RestController
public class DepartmentController {
	@Autowired
	DepartmentService deptService;
	
	@GetMapping("/department/{id}")
	public Department getOne(@PathVariable int id) {
		if(deptService.getOne(id)==null) {
			throw new UserNotFoundException("dept_id :"+id+ " Does not exsist");
			
		}
		else {
			return deptService.getOne(id);
		}
	}
	
	@GetMapping("/department")
	public List<Department> getAll(){
		
		return deptService.getAll();
	}
	
	@PostMapping("/department")
	public String add(@RequestBody Department dept) 
	{
		deptService.add(dept);
		return "added successfully";
	}
	
	
	@PutMapping("/department/{id}")
	public String update(@PathVariable int id, @RequestBody Department dept)
	{
		if(deptService.getOne(id)==null) {
			throw new UserNotFoundException("This is user not available in DataBase  : "+id);
		}
		else {
			deptService.update(id,dept);
		return "Update Successfully";
		}
	}
	
	@DeleteMapping("/department/{id}")
	public String delete(@PathVariable int id) {
		if(deptService.getOne(id)==null) {
			
			throw new UserNotFoundException("dept_id :"+id+ " Does not exsist");
			
		}else {
			deptService.delete(id);
			return "deleted successfully";
		}
	}
	
	@DeleteMapping("/department")
	public String deleteAll() {
		deptService.deleteAll();
		return "All records Deleted";
	}	
}
