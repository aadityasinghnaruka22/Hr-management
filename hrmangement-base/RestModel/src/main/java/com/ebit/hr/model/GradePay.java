package com.ebit.hr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class GradePay {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "grade_pay")
	@SequenceGenerator(name = "grade_pay", sequenceName = "GRADE_PAY_SEQ", schema = "PACE", allocationSize = 1)
	private int grade_id;
	
	@NotNull(message = "Grade name null is not accepted")
	private String grade_name;
	
	@NotNull(message = "Grade short name null is not accepted")
	private String grade_short_name;

	@NotNull(message = "Grade basic null is not accepted")
	private double grade_basic;

	@NotNull(message = "Grade ta null is not accepted")
	private double grade_ta;

	@NotNull(message = "Grade da null is not accepted")
	private double grade_da;

	@NotNull(message = "Grade hra null is not accepted")
	private double grade_hra;

	@NotNull(message = "Grade ma null is not accepted")
	private double grade_ma;

	@NotNull(message = "Grade bonus null is not accepted")
	private double grade_bonus;

	@NotNull(message = "Grade pf null is not accepted")
	private double grade_pf;

	@NotNull(message = "Grade pt null is not accepted")
	private double grade_pt;

	public GradePay() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GradePay(int grade_id, @NotNull(message = "Grade name null is not accepted") String grade_name,
			@NotNull(message = "Grade short name null is not accepted") String grade_short_name,
			@NotNull(message = "Grade basic null is not accepted") double grade_basic,
			@NotNull(message = "Grade ta null is not accepted") double grade_ta,
			@NotNull(message = "Grade da null is not accepted") double grade_da,
			@NotNull(message = "Grade hra null is not accepted") double grade_hra,
			@NotNull(message = "Grade ma null is not accepted") double grade_ma,
			@NotNull(message = "Grade bonus null is not accepted") double grade_bonus,
			@NotNull(message = "Grade pf null is not accepted") double grade_pf,
			@NotNull(message = "Grade pt null is not accepted") double grade_pt) {
		super();
		this.grade_id = grade_id;
		this.grade_name = grade_name;
		this.grade_short_name = grade_short_name;
		this.grade_basic = grade_basic;
		this.grade_ta = grade_ta;
		this.grade_da = grade_da;
		this.grade_hra = grade_hra;
		this.grade_ma = grade_ma;
		this.grade_bonus = grade_bonus;
		this.grade_pf = grade_pf;
		this.grade_pt = grade_pt;
	}

	public int getGrade_id() {
		return grade_id;
	}

	public void setGrade_id(int grade_id) {
		this.grade_id = grade_id;
	}

	public String getGrade_name() {
		return grade_name;
	}

	public void setGrade_name(String grade_name) {
		this.grade_name = grade_name;
	}

	public String getGrade_short_name() {
		return grade_short_name;
	}

	public void setGrade_short_name(String grade_short_name) {
		this.grade_short_name = grade_short_name;
	}

	public double getGrade_basic() {
		return grade_basic;
	}

	public void setGrade_basic(double grade_basic) {
		this.grade_basic = grade_basic;
	}

	public double getGrade_ta() {
		return grade_ta;
	}

	public void setGrade_ta(double grade_ta) {
		this.grade_ta = grade_ta;
	}

	public double getGrade_da() {
		return grade_da;
	}

	public void setGrade_da(double grade_da) {
		this.grade_da = grade_da;
	}

	public double getGrade_hra() {
		return grade_hra;
	}

	public void setGrade_hra(double grade_hra) {
		this.grade_hra = grade_hra;
	}

	public double getGrade_ma() {
		return grade_ma;
	}

	public void setGrade_ma(double grade_ma) {
		this.grade_ma = grade_ma;
	}

	public double getGrade_bonus() {
		return grade_bonus;
	}

	public void setGrade_bonus(double grade_bonus) {
		this.grade_bonus = grade_bonus;
	}

	public double getGrade_pf() {
		return grade_pf;
	}

	public void setGrade_pf(double grade_pf) {
		this.grade_pf = grade_pf;
	}

	public double getGrade_pt() {
		return grade_pt;
	}

	public void setGrade_pt(double grade_pt) {
		this.grade_pt = grade_pt;
	}

	@Override
	public String toString() {
		return "GradePay [grade_id=" + grade_id + ", grade_name=" + grade_name + ", grade_short_name="
				+ grade_short_name + ", grade_basic=" + grade_basic + ", grade_ta=" + grade_ta + ", grade_da="
				+ grade_da + ", grade_hra=" + grade_hra + ", grade_ma=" + grade_ma + ", grade_bonus=" + grade_bonus
				+ ", grade_pf=" + grade_pf + ", grade_pt=" + grade_pt + "]";
	}
}
