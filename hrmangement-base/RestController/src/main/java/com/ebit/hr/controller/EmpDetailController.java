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
import com.ebit.hr.model.EmpDetail;
import com.ebit.hr.service.EmpDetailService;
 
@RestController
public class EmpDetailController {

	@Autowired
	private EmpDetailService empDetailService;
	
	@PostMapping("/employee")
	public String add(@RequestBody EmpDetail emp) {
		
		empDetailService.add(emp);
		return "added successfully";
	}
	
	@GetMapping("/employee")
	public List<EmpDetail> getAll(){
		
		return empDetailService.getAll();
	}
	
	
	
	@GetMapping("employee/{id}")
	public EmpDetail getOne(@PathVariable int id)
	{
		if(empDetailService.getOne(id)==null)
		{
			throw new UserNotFoundException("empid :"+id+ " Does not exsist");
		}
		else
		{
			return empDetailService.getOne(id);
		}
	}
	
	@PutMapping("/employee/{id}")
	public String update(@PathVariable int id, @RequestBody EmpDetail emp)
	{
		if(empDetailService.getOne(id)==null) {
			throw new UserNotFoundException("This is user not available in DataBase  : "+id);
		}
		else {
			empDetailService.update(id,emp);
		return "Update Successfully";
		}
	}
	
	
	@DeleteMapping("/employee/{id}")
	public String delete(@PathVariable int id) {
		if(empDetailService.getOne(id)==null) {
			throw new UserNotFoundException("That id of "+id+" user does't not exist");
		}
		empDetailService.delete(id);
		return "Delete Successfully";
	}
	
	@DeleteMapping("/employee")
	public String deleteAll() {
		empDetailService.deleteAll();
		return "All User Records Successfully Deleted";
	}
}
