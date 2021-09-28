package com.ebit.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebit.hr.model.EmpDetail;
import com.ebit.hr.repo.EmpDetailRepo;
import com.ebit.hr.serviceimpl.E_D_Service;



@Service
public class EmpDetailService implements E_D_Service {
	
	@Autowired
	private EmpDetailRepo empDetailRepo;

	@Override
	public EmpDetail getOne(int id) {
		return empDetailRepo.findById(id);
	}

	@Override
	public List<EmpDetail> getAll() {
		return empDetailRepo.findAll();
	}

	@Override
	public void add(EmpDetail emp) {
		empDetailRepo.save(emp);
	}

	@Override
	public void update(int id, EmpDetail emp) {
		
		EmpDetail emp1 = empDetailRepo.findById(id);
		
		emp1.setEmpid(emp.getEmpid());
		emp1.setEmptitle(emp.getEmptitle());
		emp1.setEmpname(emp.getEmpname());
		emp1.setEmpdob(emp.getEmpdob());
		emp1.setEmpdoj(emp.getEmpdoj());
		emp1.setEmpaddress(emp.getEmpaddress());
		emp1.setEmpcity(emp.getEmpcity());
		emp1.setEmppincode(emp.getEmppincode());
		emp1.setEmp_mobile_no(emp.getEmp_mobile_no());
		emp1.setEmp_state(emp.getEmp_state());
		emp1.setEmp_mail_id(emp.getEmp_mail_id());
		emp1.setEmp_pan_no(emp.getEmp_pan_no());
		emp1.setEmp_pancard(emp.getEmp_pancard());	
		
		empDetailRepo.save(emp1);
	}

	@Override
	public void delete(int id) {
		empDetailRepo.deleteById(id);
	}

	@Override
	public void deleteAll() {
		empDetailRepo.deleteAll();
	}
	
	
}
