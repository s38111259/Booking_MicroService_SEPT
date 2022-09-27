package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.Consultation;
import com.example.app.services.ConsultationService;

@RestController
@RequestMapping(value = "/api")
public class BookingController {
	@Autowired
	ConsultationService consultationService;
	
	
	@GetMapping("/bookings")
    public ResponseEntity<List<Consultation>> findAllDoctors() {
        return consultationService.getAllBookings();
    }

//    // GET REQUESTS for finding a single doctor
//    @GetMapping("/bookings/{id}")
//    public ResponseEntity<Consultation> findDoctorById(@PathVariable("id") Long id) {
//        return consultationService.;
//    }

    // POST REQUEST for creating a new doctor
    @PostMapping("/bookings")
    public ResponseEntity<Consultation> addBooking(@RequestBody Consultation consultation) {
        return consultationService.addBooking(consultation);
    }
}