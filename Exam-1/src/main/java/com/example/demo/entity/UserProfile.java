package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_profiles")

public class UserProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String mobile;
	private String address;
	private LocalDate birthOfDate;
	
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="userProfile")
	private User user;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(LocalDate birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserProfile() {}

	public UserProfile(String mobile, String address, LocalDate birthOfDate) {
		super();
		this.mobile = mobile;
		this.address = mobile;
		this.birthOfDate = birthOfDate;

	}


}
