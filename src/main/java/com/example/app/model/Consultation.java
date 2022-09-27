package com.example.app.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consultation {
	
	public Consultation() {
		// TODO Auto-generated constructor stub
	}
	
	public Consultation(int BookingID, String PatName, String DocName, String Reason){
		this.BookingID = BookingID;
		this.PatName = PatName;
		this.DocName = DocName;
		this.reason = Reason;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "BookingID")
	private int BookingID;
	
	@Column(name = "PatientName")
	private String PatName;
	
	@Column(name = "DoctorName")
	private String DocName;
	
	@Column(name = "Reason")
	private String reason;
	
	@Column(name = "Dte")
	
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
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
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
