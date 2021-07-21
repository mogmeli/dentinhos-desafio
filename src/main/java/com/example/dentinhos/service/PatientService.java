package com.example.dentinhos.service;

import com.example.dentinhos.model.Patients;
import com.example.dentinhos.repository.PatientRepository;
import com.example.dentinhos.repository.TurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public List<Patients> getAllPatients(){
        LocalDate date = LocalDate.of(2021, 6, 3);
        return patientRepository.findAllPatientsByDay(date);
    }
}