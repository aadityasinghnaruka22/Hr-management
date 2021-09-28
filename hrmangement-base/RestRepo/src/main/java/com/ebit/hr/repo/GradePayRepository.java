package com.ebit.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebit.hr.model.GradePay;

public interface GradePayRepository extends JpaRepository<GradePay, Integer> {

	GradePay findById(int id);
}
