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
import com.ebit.hr.model.GradePay;
import com.ebit.hr.service.GradePayService;

@RestController
public class GradePayController {
	
	@Autowired
	private GradePayService service;
	
	@GetMapping("/gradepay/{id}")
	public GradePay getOne(@PathVariable int id)
	{
		if(service.getOne(id)==null)
		{
			throw new UserNotFoundException("id:"+ id + " doesn't exist.");
		}
		else {
		return service.getOne(id);
		}
	}
	
	@GetMapping("/gradepay")
	public List<GradePay> getAll()
	{
		return service.getAll();
	}
	
	@PostMapping("/gradepay")
	public String add(@RequestBody GradePay p)
	{
		service.add(p);
		return "added successfully";
	}
	
	@PutMapping("/gradepay/{id}")
	public String update(@PathVariable int id, @RequestBody GradePay p)
	{
		if(service.getOne(id)==null)
		{
			throw new UserNotFoundException("id:"+ id + " doesn't exist.");
		}
		else
		{
		service.update(id,p);
		return "Updated Successfully";
		}
	}
	
	@DeleteMapping("/gradepay/{id}")
	public String delete(@PathVariable int id)
	{
		if(service.getOne(id)==null)
		{
			throw new UserNotFoundException("id:"+ id + " doesn't exist.");
		}
		else
		{
		service.delete(id);
		return "Deleted sucessfully";
		}
	}
	
	@DeleteMapping("/gradepay")
	public String deleteAll()
	{
		service.deleteAll();
		return "Blank";
	}
	
}
