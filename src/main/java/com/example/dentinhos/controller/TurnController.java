package com.example.dentinhos.controller;

import com.example.dentinhos.model.Turns;
import com.example.dentinhos.service.TurnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TurnController {

    @Autowired
    TurnService turnService;


    @GetMapping("/ex3")
    public List<Turns> ex3(){
        return turnService.ex3();
    }


    @GetMapping("/ex4")
    public List<Turns> ex4(){
        return turnService.ex4();
    }


    @GetMapping("/ex6")
    public List<Turns> ex6(){
        return turnService.ex6();
    }
}