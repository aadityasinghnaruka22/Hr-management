package com.ebit.hr.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class EmpSalary {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_salary")
	@SequenceGenerator(name = "emp_salary", sequenceName = "EMP_SALARY_SEQ", schema = "PACE", allocationSize = 1)
	private int salary_id;
	
	private int emp_id;
	
	@NotNull(message = "emp_salary_month cannot be null")
	private String emp_salary_month;
	
	@NotNull(message = "emp_salary_year cannot be null")
	private String emp_salary_year;
	
	@NotNull(message = "emp_salary_embursment_date cannot be null")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date emp_salary_embursment_date;
	
	private int dept_id;
	private int grade_id;
	
	@NotNull(message = "emp_basic cannot be null")
	private double emp_basic;
	
	@NotNull(message = "emp_da cannot be null")
	private double emp_da;
	
	@NotNull(message = "emp_ta cannot be null")
	private double emp_ta;
	
	@NotNull(message = "emp_hra cannot be null")
	private double emp_hra;
	
	@NotNull(message = "emp_ma cannot be null")
	private double emp_ma;
	
	@NotNull(message = "emp_bonus cannot be null")
	private double emp_bonus;
	
	@NotNull(message = "emp_pf cannot be null")
	private double emp_pf;
	
	@NotNull(message = "emp_pt cannot be null")
	private double emp_pt;
	
	@NotNull(message = "emp_gross cannot be null")
	private double emp_gross;
	
	@NotNull(message = "emp_total_salary cannot be null")
	private double emp_total_salary;

	public EmpSalary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpSalary(int salary_id, int emp_id,
			@NotNull(message = "emp_salary_month cannot be null") String emp_salary_month,
			@NotNull(message = "emp_salary_year cannot be null") String emp_salary_year,
			@NotNull(message = "emp_salary_embursment_date cannot be null") Date emp_salary_embursment_date,
			int dept_id, int grade_id, @NotNull(message = "emp_basic cannot be null") double emp_basic,
			@NotNull(message = "emp_da cannot be null") double emp_da,
			@NotNull(message = "emp_ta cannot be null") double emp_ta,
			@NotNull(message = "emp_hra cannot be null") double emp_hra,
			@NotNull(message = "emp_ma cannot be null") double emp_ma,
			@NotNull(message = "emp_bonus cannot be null") double emp_bonus,
			@NotNull(message = "emp_pf cannot be null") double emp_pf,
			@NotNull(message = "emp_pt cannot be null") double emp_pt,
			@NotNull(message = "emp_gross cannot be null") double emp_gross,
			@NotNull(message = "emp_total_salary cannot be null") double emp_total_salary) {
		super();
		this.salary_id = salary_id;
		this.emp_id = emp_id;
		this.emp_salary_month = emp_salary_month;
		this.emp_salary_year = emp_salary_year;
		this.emp_salary_embursment_date = emp_salary_embursment_date;
		this.dept_id = dept_id;
		this.grade_id = grade_id;
		this.emp_basic = emp_basic;
		this.emp_da = emp_da;
		this.emp_ta = emp_ta;
		this.emp_hra = emp_hra;
		this.emp_ma = emp_ma;
		this.emp_bonus = emp_bonus;
		this.emp_pf = emp_pf;
		this.emp_pt = emp_pt;
		this.emp_gross = emp_gross;
		this.emp_total_salary = emp_total_salary;
	}

	public int getSalary_id() {
		return salary_id;
	}

	public void setSalary_id(int salary_id) {
		this.salary_id = salary_id;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_salary_month() {
		return emp_salary_month;
	}

	public void setEmp_salary_month(String emp_salary_month) {
		this.emp_salary_month = emp_salary_month;
	}

	public String getEmp_salary_year() {
		return emp_salary_year;
	}

	public void setEmp_salary_year(String emp_salary_year) {
		this.emp_salary_year = emp_salary_year;
	}

	public Date getEmp_salary_embursment_date() {
		return emp_salary_embursment_date;
	}

	public void setEmp_salary_embursment_date(Date emp_salary_embursment_date) {
		this.emp_salary_embursment_date = emp_salary_embursment_date;
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

	public double getEmp_basic() {
		return emp_basic;
	}

	public void setEmp_basic(double emp_basic) {
		this.emp_basic = emp_basic;
	}

	public double getEmp_da() {
		return emp_da;
	}

	public void setEmp_da(double emp_da) {
		this.emp_da = emp_da;
	}

	public double getEmp_ta() {
		return emp_ta;
	}

	public void setEmp_ta(double emp_ta) {
		this.emp_ta = emp_ta;
	}

	public double getEmp_hra() {
		return emp_hra;
	}

	public void setEmp_hra(double emp_hra) {
		this.emp_hra = emp_hra;
	}

	public double getEmp_ma() {
		return emp_ma;
	}

	public void setEmp_ma(double emp_ma) {
		this.emp_ma = emp_ma;
	}

	public double getEmp_bonus() {
		return emp_bonus;
	}

	public void setEmp_bonus(double emp_bonus) {
		this.emp_bonus = emp_bonus;
	}

	public double getEmp_pf() {
		return emp_pf;
	}

	public void setEmp_pf(double emp_pf) {
		this.emp_pf = emp_pf;
	}

	public double getEmp_pt() {
		return emp_pt;
	}

	public void setEmp_pt(double emp_pt) {
		this.emp_pt = emp_pt;
	}

	public double getEmp_gross() {
		return emp_gross;
	}

	public void setEmp_gross(double emp_gross) {
		this.emp_gross = emp_gross;
	}

	public double getEmp_total_salary() {
		return emp_total_salary;
	}

	public void setEmp_total_salary(double emp_total_salary) {
		this.emp_total_salary = emp_total_salary;
	}

	@Override
	public String toString() {
		return "EmpSalary [salary_id=" + salary_id + ", emp_id=" + emp_id + ", emp_salary_month=" + emp_salary_month
				+ ", emp_salary_year=" + emp_salary_year + ", emp_salary_embursment_date=" + emp_salary_embursment_date
				+ ", dept_id=" + dept_id + ", grade_id=" + grade_id + ", emp_basic=" + emp_basic + ", emp_da=" + emp_da
				+ ", emp_ta=" + emp_ta + ", emp_hra=" + emp_hra + ", emp_ma=" + emp_ma + ", emp_bonus=" + emp_bonus
				+ ", emp_pf=" + emp_pf + ", emp_pt=" + emp_pt + ", emp_gross=" + emp_gross + ", emp_total_salary="
				+ emp_total_salary + "]";
	}

}
