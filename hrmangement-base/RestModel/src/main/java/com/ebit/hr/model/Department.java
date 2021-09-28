package com.ebit.hr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_data")
	@SequenceGenerator(name = "department_data", sequenceName = "DEPT_SEQ", schema = "PACE", allocationSize = 1)
	private int dept_id;
	
	@Column(name ="DEPARTMENT_NAME")
	@NotNull(message = "Name is mandatory")
	private String dept_name;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int dept_id, @NotNull(message = "Name is mandatory") String dept_name) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + "]";
	}	
}
