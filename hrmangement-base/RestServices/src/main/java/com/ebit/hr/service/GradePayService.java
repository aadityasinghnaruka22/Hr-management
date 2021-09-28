package com.ebit.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebit.hr.model.GradePay;
import com.ebit.hr.repo.GradePayRepository;
import com.ebit.hr.serviceimpl.G_P_Service;

@Service
public class GradePayService implements G_P_Service
{

	@Autowired
	GradePayRepository repo;
	
	@Override
	public GradePay getOne(int id) {
		return repo.findById(id);
	}

	@Override
	public List<GradePay> getAll() {
		
		return repo.findAll();
	}

	@Override
	public void add(GradePay p) {
		
		repo.save(p);
	}

	@Override
	public void update(int id, GradePay p) {
		
		GradePay e = repo.findById(id);
		
		e.setGrade_name(p.getGrade_name());
		e.setGrade_basic(p.getGrade_basic());
		e.setGrade_bonus(p.getGrade_bonus());
		e.setGrade_da(p.getGrade_da());
		e.setGrade_hra(p.getGrade_hra());
		e.setGrade_ma(p.getGrade_ma());
		e.setGrade_pf(p.getGrade_pf());
		e.setGrade_pt(p.getGrade_pt());
		e.setGrade_short_name(p.getGrade_short_name());
		e.setGrade_ta(p.getGrade_ta());
		
		repo.save(e);
	}

	@Override
	public void delete(int id) {
		
		repo.deleteById(id);
	}

	@Override
	public void deleteAll() {
		repo.deleteAll();		
	}

}
