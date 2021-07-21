package com.example.dentinhos.controller;

import com.example.dentinhos.model.Patients;
import com.example.dentinhos.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;


    @GetMapping("/ex1")
    public List<Patients> ex1(){
        return patientService.getAllPatients();
    }


}