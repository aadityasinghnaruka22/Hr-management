package com.ebit.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebit.hr.model.EmpDetail;

public interface EmpDetailRepo extends JpaRepository<EmpDetail, Integer> {

	EmpDetail findById(int id);
}
