package com.ebit.hr.serviceimpl;

import java.util.List;

import com.ebit.hr.model.EmpSalary;


public interface S_Service {
	
	EmpSalary getOne(int id);
	List<EmpSalary> getAll();
	void add(EmpSalary p);
	void update(int id , EmpSalary p);
	void delete(int id);
	void deleteAll();

}
