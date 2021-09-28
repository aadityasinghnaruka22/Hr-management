package com.ebit.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ebit.hr.model.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	User findById(int id);
}
