package com.example.app.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import com.example.app.model.Consultation;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Integer> {

}
