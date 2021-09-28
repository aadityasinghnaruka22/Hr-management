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
import com.ebit.hr.model.EmpSalary;
import com.ebit.hr.service.SalaryService;

@RestController
public class SalaryController {
	
	@Autowired
	SalaryService salaryService;
	
	@PostMapping("/salary")
	public String add(@RequestBody EmpSalary empSalary) 
	{
		salaryService.add(empSalary);
		return "added successfully";
	}
	
	@GetMapping("/salary")
	public List<EmpSalary> getAll(){
		
		return salaryService.getAll();
	}
	
	@GetMapping("salary/{id}")
	public EmpSalary getOne(@PathVariable int id)
	{
		if(salaryService.getOne(id)==null)
		{
			throw new UserNotFoundException("empid :"+id+ " Does not exsist");
		}
		else
		{
			return salaryService.getOne(id);
		}
	}
	
	@PutMapping("/salary/{id}")
	public String update(@PathVariable int id, @RequestBody EmpSalary emp)
	{
		if(salaryService.getOne(id)==null) {
			throw new UserNotFoundException("This is user not available in DataBase  : "+id);
		}
		else {
			salaryService.update(id,emp);
		return "Update Successfully";
		}
	}
	
	@DeleteMapping("/salary/{id}")
	public String delete(@PathVariable int id) {
		if(salaryService.getOne(id)==null) {
			throw new UserNotFoundException("That id of "+id+" user does't not exist");
		}
		salaryService.delete(id);
		return "Delete Successfully";
	}
	
	@DeleteMapping("/salary")
	public String deleteAll() {
		salaryService.deleteAll();
		return "All User Records Successfully Deleted";
	}
}