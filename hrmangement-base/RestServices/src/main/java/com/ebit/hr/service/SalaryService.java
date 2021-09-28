package com.ebit.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebit.hr.model.EmpSalary;
import com.ebit.hr.repo.SalaryRepo;
import com.ebit.hr.serviceimpl.S_Service;

@Service
public class SalaryService implements S_Service {
	
	@Autowired
	SalaryRepo salaryRepo;

	@Override
	public EmpSalary getOne(int id) {
		return salaryRepo.findById(id);
	}

	@Override
	public List<EmpSalary> getAll() {
		return salaryRepo.findAll();
	}

	@Override
	public void add(EmpSalary empSalary) {
		salaryRepo.save(empSalary);
	}

	@Override
	public void update(int id, EmpSalary emp) {
		
		EmpSalary emp1 = salaryRepo.findById(id);
		
		
		emp1.setDept_id(emp.getDept_id());
		emp1.setEmp_basic(emp.getEmp_basic());
		emp1.setEmp_bonus(emp.getEmp_bonus());
		emp1.setEmp_da(emp.getEmp_da());
		emp1.setEmp_gross(emp.getEmp_gross());
		emp1.setEmp_hra(emp.getEmp_hra());
		emp1.setEmp_id(emp.getEmp_id());
		emp1.setEmp_ma(emp.getEmp_ma());
		emp1.setEmp_pf(emp.getEmp_pf());
		emp1.setEmp_pt(emp.getEmp_pt());
		emp1.setEmp_salary_embursment_date(emp.getEmp_salary_embursment_date());
		emp1.setEmp_salary_month(emp.getEmp_salary_month());
		emp1.setEmp_salary_year(emp.getEmp_salary_year());
		emp1.setEmp_ta(emp.getEmp_ta());
		emp1.setEmp_total_salary(emp.getEmp_total_salary());
		emp1.setGrade_id(emp.getGrade_id());
		
		salaryRepo.save(emp1);
	}

	@Override
	public void delete(int id) {
		salaryRepo.deleteById(id);
	}

	@Override
	public void deleteAll() {
		salaryRepo.deleteAll();
	}

	
}
