package com.example.app.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.Users.custom_exception.ResourceNotFoundException;
import com.example.app.model.Consultation;
import com.example.app.repository.ConsultationRepository;

public class ConsultationService {
	
	ConsultationRepository consultationRepository;
	
	//Return all bookings
	public ResponseEntity<List<Consultation>> getAllBookings(){
		List<Consultation> allBooking = new ArrayList<Consultation>();
		consultationRepository.findAll().forEach(allBooking::add);
		if (allBooking.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
		return new ResponseEntity<>(allBooking, HttpStatus.OK);
	}
	
	
	//Add booking
	public ResponseEntity<Consultation> addBooking(Consultation consultation) {
		Consultation _newAdmin = consultationRepository.save(new Consultation(consultation.getBookingID(), consultation.getPatName(), consultation.getDocName(), consultation.getReason()));
        return new ResponseEntity<>(_newAdmin, HttpStatus.CREATED);
    }
	
	
	//Delete booking
	public ResponseEntity<Consultation> deleteBooking(Integer id){
		Consultation doctor = consultationRepository.findById(id)
									.orElseThrow(() -> new ResourceNotFoundException("Doctor with ID: " + id + " not found."));
		consultationRepository.delete(doctor);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
