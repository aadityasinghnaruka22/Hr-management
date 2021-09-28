package com.ebit.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebit.hr.model.EmpSalary;

public interface SalaryRepo extends JpaRepository<EmpSalary, Integer> {

	EmpSalary findById(int id);
}
