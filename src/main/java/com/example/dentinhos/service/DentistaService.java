package com.example.dentinhos.service;

import com.example.dentinhos.model.Dentists;
import com.example.dentinhos.repository.DentistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistaService {

    @Autowired
    DentistRepository dentistRepository;

    public List<Dentists> ex2(){
        return dentistRepository.findAllDentistsWithMoreThanTwoTurnInOneDate();
    }
}