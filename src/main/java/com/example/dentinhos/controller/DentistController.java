package com.example.dentinhos.controller;

import com.example.dentinhos.model.Dentists;
import com.example.dentinhos.model.Turns;
import com.example.dentinhos.repository.DentistRepository;
import com.example.dentinhos.service.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DentistController {

    @Autowired
    DentistaService dentistaService;

    @GetMapping("/ex2")
    public List<Dentists> ex2(){
        return dentistaService.ex2();
    }
}