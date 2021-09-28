package com.ebit.hr.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ebit.hr.model.Department;


@Repository
public interface DepatmentRepo extends JpaRepository<Department, Integer> {
	
	Department findById(int id);
	
}
