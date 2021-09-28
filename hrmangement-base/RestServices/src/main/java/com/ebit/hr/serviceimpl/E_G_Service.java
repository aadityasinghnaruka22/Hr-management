package com.ebit.hr.serviceimpl;

import java.util.List;

import com.ebit.hr.model.EmpGrade;

public interface E_G_Service {

	EmpGrade getOne(int id);
	List<EmpGrade> getAll();
	void add(EmpGrade empGrade);
	void update(int id, EmpGrade empGrade);
	void delete(int id);
	void deleteAll();
}
