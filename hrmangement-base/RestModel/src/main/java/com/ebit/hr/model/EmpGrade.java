package com.ebit.hr.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class EmpGrade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_grade")
	@SequenceGenerator(name = "emp_grade", sequenceName = "EMP_GRADE_SEQ", schema = "PACE", allocationSize = 1)
	private int id;

	private int emp_id;
	
	private int dept_id;
	
	private int grade_id;
	@JsonFormat(pattern="yyyy-MM-dd")
	
	private Date emp_from_date;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date emp_to_date;
	
	public EmpGrade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpGrade(int id, int emp_id, int dept_id, int grade_id, Date emp_from_date, Date emp_to_date) {
		super();
		this.id = id;
		this.emp_id = emp_id;
		this.dept_id = dept_id;
		this.grade_id = grade_id;
		this.emp_from_date = emp_from_date;
		this.emp_to_date = emp_to_date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public int getGrade_id() {
		return grade_id;
	}
	public void setGrade_id(int grade_id) {
		this.grade_id = grade_id;
	}
	public Date getEmp_from_date() {
		return emp_from_date;
	}
	public void setEmp_from_date(Date emp_from_date) {
		this.emp_from_date = emp_from_date;
	}
	public Date getEmp_to_date() {
		return emp_to_date;
	}
	public void setEmp_to_date(Date emp_to_date) {
		this.emp_to_date = emp_to_date;
	}
	@Override
	public String toString() {
		return "EmpGrade [id=" + id + ", emp_id=" + emp_id + ", dept_id=" + dept_id + ", grade_id=" + grade_id
				+ ", emp_from_date=" + emp_from_date + ", emp_to_date=" + emp_to_date + "]";
	}	
}
