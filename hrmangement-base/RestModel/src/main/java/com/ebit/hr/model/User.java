package com.ebit.hr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "USER_SEQ", schema = "PACE", allocationSize = 1)
	@Column(name ="USER_ID")
	private int userid;
	
	@Size(min=3,max=20)
	@Column(name ="USER_NAME")
	@NotNull(message = "Name is mandatory")
	private String username;
	
	@Size(min=3,max=15)
	@Column(name ="USER_PASSWORD")
	@NotNull(message = "Password is mandatory")
	private String password;
	
	@Column(name ="EMAIL_ID")
	@Email(message = "email should be valid")
	private String emailid;
	
	
	@Column(name ="USER_TYPE")
	private String usertype;


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int userid, @Size(min = 3, max = 20) @NotNull(message = "Name is mandatory") String username,
			@Size(min = 3, max = 15) @NotNull(message = "Password is mandatory") String password,
			@Email(message = "email should be valid") String emailid, String usertype) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.emailid = emailid;
		this.usertype = usertype;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public String getUsertype() {
		return usertype;
	}


	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}


	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", emailid=" + emailid
				+ ", usertype=" + usertype + "]";
	}
	
	
}
