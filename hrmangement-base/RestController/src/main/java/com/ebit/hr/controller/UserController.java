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
import com.ebit.hr.model.User;
import com.ebit.hr.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public String add(@RequestBody User user) 
	{
		userService.add(user);
		return "added successfully";
	}
	
	@GetMapping("/user")
	public List<User> getAll(){
		
		return userService.getAll();
	}

	@GetMapping("user/{id}")
	public User getOne(@PathVariable int id)
	{
		if(userService.getOne(id)==null)
		{
			throw new UserNotFoundException("empid :"+id+ " Does not exsist");
		}
		else
		{
			return userService.getOne(id);
		}
	}
	
	@PutMapping("/user/{id}")
	public String update(@PathVariable int id, @RequestBody User user)
	{
		if(userService.getOne(id)==null) {
			throw new UserNotFoundException("This is user not available in DataBase  : "+id);
		}
		else {
		userService.update(id,user);
		return "Update Successfully";
		}
	}
	
	@DeleteMapping("/user/{id}")
	public String delete(@PathVariable int id) {
		if(userService.getOne(id)==null) {
			throw new UserNotFoundException("That id of "+id+" user does't not exist");
		}
		userService.delete(id);
		return "Delete Successfully";
	}
	
	@DeleteMapping("/user")
	public String deleteAll() {
		userService.deleteAll();
		return "All User Records Successfully Deleted";
	}
}
