package com.example.dentinhos.service;

import com.example.dentinhos.model.Turns;
import com.example.dentinhos.repository.TurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TurnService {

    @Autowired
    TurnRepository turnRepository;

    public List<Turns> ex3(){
       return turnRepository.findAllByTurnStatusName("finalizado");
    }

    public List<Turns> ex4(){
        LocalDate date = LocalDate.of(2021, 6, 3);
        return turnRepository.findAllByDayAndTurnStatusName( date, "pendente");
    }

    public List<Turns> ex6(){
        return turnRepository.findAllByTurnStatus_NameAndDiary_Dentist_Id( "remarcado", 3L);
    }

}