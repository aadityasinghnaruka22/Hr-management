package com.ebit.hr.serviceimpl;

import java.util.List;

import com.ebit.hr.model.EmpDetail;

public interface E_D_Service {
	
	EmpDetail getOne(int id);
	List<EmpDetail> getAll();
	void add(EmpDetail p);
	void update(int id , EmpDetail p);
	void delete(int id);
	void deleteAll();

}
