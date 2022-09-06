package com.example.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "DoctorID")
	private int DoctorID;
	
	@Column(name = "Name")
	private String DoctorName;
	
	@Column(name = "Phone")
	private int PhoneNo;
	
	@Column(name = "Address")
	private String Address;
	
	@Column(name = "Sex")
	private String Sex;
	
	@Column(name = "Email")
	private String Email;
	
	@Column(name = "Specialization")
	private String Specialization;
	
	public Doctor() {
		
	}
	
	public int getDoctorID() {
		return DoctorID;
	}

	public void setDoctorID(int doctorID) {
		DoctorID = doctorID;
	}

	public String getDoctorName() {
		return DoctorName;
	}

	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}

	public int getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	
}
