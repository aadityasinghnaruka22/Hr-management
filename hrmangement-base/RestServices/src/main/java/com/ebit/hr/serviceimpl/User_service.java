package com.ebit.hr.serviceimpl;

import java.util.List;

import com.ebit.hr.model.User;

public interface User_service {
	
	User getOne(int id);
	List<User> getAll();
	void add(User user);
	void update(int id , User user);
	void delete(int id);
	void deleteAll();

}
