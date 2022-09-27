package com.example.app.services;
import com.example.app.model.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.app.repository.PatientRespository;


@RestController
@RequestMapping(value = "/rest/patients")
public class PatientsServices {
	
	@Autowired
	PatientRespository patientRepo;
	
	@GetMapping(value = "/all")
	public List<Patient> getAllgetPatients(){
		return patientRepo.findAll();
	}
	
//	@GetMapping(value = "/all/{id}")
//	public List<Patient> getPatient(@PathVariable int id){
//		return patientRepo.findById(id);
//	}
	
	@PostMapping(value = "/loadPatient")
	public List<Patient> load(@RequestBody final Patient patients){
		patientRepo.save(patients);
		return patientRepo.findAll();
	}

}
