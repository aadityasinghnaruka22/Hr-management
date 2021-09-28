package com.ebit.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebit.hr.model.User;
import com.ebit.hr.repo.UserRepository;
import com.ebit.hr.serviceimpl.User_service;

@Service
public class UserService implements User_service {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User getOne(int id) {
		return userRepository.findById(id);
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public void add(User user) {
		userRepository.save(user);
	}

	@Override
	public void update(int id, User user) {
		
		User user1 = userRepository.findById(id);
		
		user1.setUsername(user.getUsername());
		user1.setEmailid(user.getEmailid());
		user1.setPassword(user.getPassword());
		user1.setUsertype(user.getUsertype());

		userRepository.save(user1);
	}

	@Override
	public void delete(int id) {
		userRepository.deleteById(id);
	}

	@Override
	public void deleteAll() {
		userRepository.deleteAll();
	}

}
