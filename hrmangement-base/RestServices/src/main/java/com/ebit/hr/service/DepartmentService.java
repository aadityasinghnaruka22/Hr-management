package com.ebit.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebit.hr.model.Department;
import com.ebit.hr.repo.DepatmentRepo;
import com.ebit.hr.serviceimpl.D_Service;

@Service
public class DepartmentService implements D_Service {

	@Autowired
	DepatmentRepo depatmentRepo;

	@Override
	public Department getOne(int id) {
		return depatmentRepo.findById(id);
	}

	@Override
	public List<Department> getAll() {
		return depatmentRepo.findAll();
	}

	@Override
	public void add(Department dept) {
		depatmentRepo.save(dept);
	}

	@Override
	public void update(int id, Department dept) {
		
		Department department1 = depatmentRepo.findById(id);
		department1.setDept_name(dept.getDept_name());
		depatmentRepo.save(department1);
	}

	@Override
	public void delete(int id) {
		depatmentRepo.deleteById(id);
	}

	@Override
	public void deleteAll() {
		depatmentRepo.deleteAll();
	}
}
