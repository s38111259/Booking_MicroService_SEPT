package com.example.app.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consultation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "BookingID")
	private int BookingID;
	
	@Column(name = "PatientName")
	private String PatName;
	
	@Column(name = "DoctorName")
	private String DocName;
	
	public int getBookingID() {
		return BookingID;
	}

	public void setBookingID(int bookingID) {
		BookingID = bookingID;
	}

	public String getPatName() {
		return PatName;
	}

	public void setPatName(String PatName) {
		this.PatName = PatName;
	}

	public String getDocName() {
		return DocName;
	}

	public void setDocName(String DocName) {
		this.DocName = DocName;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	public String getTimestamp() {
		return Timestamp;
	}

	public void setTimestamp(String timestamp) {
		Timestamp = timestamp;
	}

	@Column(name = "Reason")
	private String Reason;
	
	@Column(name = "Timestamp")
	private String Timestamp;
	
}
