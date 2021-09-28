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
import com.ebit.hr.model.EmpGrade;
import com.ebit.hr.service.EmpGradeService;

@RestController
public class EmpGradeController {
	
	@Autowired
	private EmpGradeService empGradeService;
	
	@PostMapping("/empgrade")
	public String add(@RequestBody EmpGrade emp) 
	{
		empGradeService.add(emp);
		return "added successfully";
	}
	
	@GetMapping("/empgrade")
	public List<EmpGrade> getAll(){
		
		return empGradeService.getAll();
	}
	
	@GetMapping("/empgrade/{id}")
	public EmpGrade getOne(@PathVariable int id)
	{
		if(empGradeService.getOne(id)==null)
		{
			throw new UserNotFoundException("empid :"+id+ " Does not exsist");
		}
		else
		{
			return empGradeService.getOne(id);
		}
	}
	
	@PutMapping("/empgrade/{id}")
	public String update(@PathVariable int id, @RequestBody EmpGrade user)
	{
		if(empGradeService.getOne(id)==null) {
			throw new UserNotFoundException("This is user not available in DataBase  : "+id);
		}
		else {
			empGradeService.update(id,user);
		return "Update Successfully";
		}
	}
	

	@DeleteMapping("/empgrade/{id}")
	public String delete(@PathVariable int id) {
		if(empGradeService.getOne(id)==null) {
			throw new UserNotFoundException("That id of "+id+" user does't not exist");
		}
		empGradeService.delete(id);
		return "Delete Successfully";
	}
	
	@DeleteMapping("/empgrade")
	public String deleteAll() {
		empGradeService.deleteAll();
		return "All User Records Successfully Deleted";
	}	
	
}
