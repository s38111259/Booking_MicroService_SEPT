package com.example.app.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.Doctor;
import com.example.app.model.Patient;
import com.example.app.repository.DoctorRepository;

@RestController
@RequestMapping(value = "/rest/doctors")
public class DoctorResource {
	
	@Autowired
	DoctorRepository doctorRepo;
	
	@GetMapping(value = "/all")
	public List<Doctor> getAllDoctors() {
		return doctorRepo.findAll();
	}
	
//	@GetMapping(value = "/{id}")
//	public List<Doctor> getDoctor(@PathVariable int id){
//		return 
//	}
	
	@PostMapping(value = "/loadDoctor")
	public List<Doctor> load(@RequestBody final Doctor doctor){
		doctorRepo.save(doctor);
		return doctorRepo.findAll();
	}
}
