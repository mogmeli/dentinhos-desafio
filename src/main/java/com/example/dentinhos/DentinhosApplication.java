package com.example.dentinhos;

import com.example.dentinhos.model.Patients;
import com.example.dentinhos.repository.PatientRepository;
import com.example.dentinhos.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DentinhosApplication {


    public static void main(String[] args) {
        SpringApplication.run(DentinhosApplication.class, args);
    }

}