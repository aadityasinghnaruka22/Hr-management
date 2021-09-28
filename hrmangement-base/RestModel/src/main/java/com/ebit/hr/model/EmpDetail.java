package com.ebit.hr.model;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class EmpDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_detail_data")
	@SequenceGenerator(name = "emp_detail_data", sequenceName = "EMP_DETAIL_SEQ", schema = "PACE", allocationSize = 1)
	@Column(name = "emp_id")
	private int empid;
	
	@Column(name = "userid")
	private int userid;
	
	@Column(name = "emp_title")
	private String emptitle;
	
	@Column(name = "emp_name")
	@NotNull(message = "Emp_name cannot be null")
	private String empname;
	
	@Column(name = "emp_dob")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date empdob;
	
	@Column(name = "emp_doj")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date empdoj;
	
	@Column(name = "emp_address")
	private String empaddress;
	
	@Column(name = "emp_city")
	private String empcity;
	
	@Column(name = "emp_pincode")
	@NotNull(message = "Pincode cannot be null")
	private String emppincode;
	
	@Column(name = "emp_mobile_no")
	@NotNull(message = "Emp mobile number cannot be null")
	private String emp_mobile_no;
	
	@Column(name = "emp_state")
	private String emp_state;
	
	@Column(name = "emp_mail_id")
	@Email(message = "email should be valid")
	private String emp_mail_id;
	
	@Column(name = "emp_pan_no")
	@NotNull(message = "not to be null")
	private String emp_pan_no;
	
	@JsonIgnore
	@Column(name = "emp_pancard")
	@Lob
	private Blob emp_pancard;

	public EmpDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpDetail(int empid, int userid, String emptitle,
			@NotNull(message = "Emp_name cannot be null") String empname, Date empdob, Date empdoj, String empaddress,
			String empcity, @NotNull(message = "Pincode cannot be null") String emppincode,
			@NotNull(message = "Emp mobile number cannot be null") String emp_mobile_no, String emp_state,
			@Email(message = "email should be valid") String emp_mail_id,
			@NotNull(message = "not to be null") String emp_pan_no, Blob emp_pancard) {
		super();
		this.empid = empid;
		this.userid = userid;
		this.emptitle = emptitle;
		this.empname = empname;
		this.empdob = empdob;
		this.empdoj = empdoj;
		this.empaddress = empaddress;
		this.empcity = empcity;
		this.emppincode = emppincode;
		this.emp_mobile_no = emp_mobile_no;
		this.emp_state = emp_state;
		this.emp_mail_id = emp_mail_id;
		this.emp_pan_no = emp_pan_no;
		this.emp_pancard = emp_pancard;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getEmptitle() {
		return emptitle;
	}

	public void setEmptitle(String emptitle) {
		this.emptitle = emptitle;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Date getEmpdob() {
		return empdob;
	}

	public void setEmpdob(Date empdob) {
		this.empdob = empdob;
	}

	public Date getEmpdoj() {
		return empdoj;
	}

	public void setEmpdoj(Date empdoj) {
		this.empdoj = empdoj;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public String getEmpcity() {
		return empcity;
	}

	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}

	public String getEmppincode() {
		return emppincode;
	}

	public void setEmppincode(String emppincode) {
		this.emppincode = emppincode;
	}

	public String getEmp_mobile_no() {
		return emp_mobile_no;
	}

	public void setEmp_mobile_no(String emp_mobile_no) {
		this.emp_mobile_no = emp_mobile_no;
	}

	public String getEmp_state() {
		return emp_state;
	}

	public void setEmp_state(String emp_state) {
		this.emp_state = emp_state;
	}

	public String getEmp_mail_id() {
		return emp_mail_id;
	}

	public void setEmp_mail_id(String emp_mail_id) {
		this.emp_mail_id = emp_mail_id;
	}

	public String getEmp_pan_no() {
		return emp_pan_no;
	}

	public void setEmp_pan_no(String emp_pan_no) {
		this.emp_pan_no = emp_pan_no;
	}

	public Blob getEmp_pancard() {
		return emp_pancard;
	}

	public void setEmp_pancard(Blob emp_pancard) {
		this.emp_pancard = emp_pancard;
	}

	@Override
	public String toString() {
		return "EmpDetail [empid=" + empid + ", userid=" + userid + ", emptitle=" + emptitle + ", empname=" + empname
				+ ", empdob=" + empdob + ", empdoj=" + empdoj + ", empaddress=" + empaddress + ", empcity=" + empcity
				+ ", emppincode=" + emppincode + ", emp_mobile_no=" + emp_mobile_no + ", emp_state=" + emp_state
				+ ", emp_mail_id=" + emp_mail_id + ", emp_pan_no=" + emp_pan_no + ", emp_pancard=" + emp_pancard + "]";
	}
}