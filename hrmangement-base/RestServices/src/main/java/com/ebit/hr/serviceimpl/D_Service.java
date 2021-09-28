package com.ebit.hr.serviceimpl;

import java.util.List;

import com.ebit.hr.model.Department;

public interface D_Service {

	Department getOne(int id);
	List<Department> getAll();
	void add(Department p);
	void update(int id , Department p);
	void delete(int id);
	void deleteAll();
}
