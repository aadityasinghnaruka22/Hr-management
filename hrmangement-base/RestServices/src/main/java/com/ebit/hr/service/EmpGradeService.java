package com.ebit.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebit.hr.model.EmpGrade;
import com.ebit.hr.repo.EmpGradeRepo;
import com.ebit.hr.serviceimpl.E_G_Service;

@Service
public class EmpGradeService implements E_G_Service {
	
	@Autowired
	private EmpGradeRepo empGradeRepo;

	@Override
	public EmpGrade getOne(int id) {
		return empGradeRepo.findById(id);
	}

	@Override
	public List<EmpGrade> getAll() {
		return empGradeRepo.findAll();
	}

	@Override
	public void add(EmpGrade empGrade) {
		
		empGradeRepo.save(empGrade);
	}

	@Override
	public void update(int id, EmpGrade empGrade) {
		
		EmpGrade emp = empGradeRepo.findById(id);
		
		emp.setDept_id(empGrade.getDept_id());
		emp.setEmp_id(empGrade.getEmp_id());
		emp.setGrade_id(empGrade.getGrade_id());
		emp.setEmp_from_date(empGrade.getEmp_from_date());
		emp.setEmp_to_date(empGrade.getEmp_to_date());
		
		empGradeRepo.save(emp);
	}

	@Override
	public void delete(int id) {
		
		empGradeRepo.deleteById(id);		
	}

	@Override
	public void deleteAll() {
		
		empGradeRepo.deleteAll();
	}
	
	

}
