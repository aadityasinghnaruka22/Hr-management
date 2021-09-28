package com.ebit.hr.serviceimpl;

import java.util.List;

import com.ebit.hr.model.GradePay;

public interface G_P_Service {
	
	GradePay getOne(int id);
	List<GradePay> getAll();
	void add(GradePay p);
	void update(int id , GradePay p);
	void delete(int id);
	void deleteAll();
}
