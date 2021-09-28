package com.ebit.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebit.hr.model.EmpGrade;

public interface EmpGradeRepo extends JpaRepository<EmpGrade, Integer>{

	EmpGrade findById(int id);
}
