package com.example.dentinhos.repository;

import com.example.dentinhos.model.Patients;
import com.example.dentinhos.model.Turns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface TurnRepository extends JpaRepository<Turns, Long> {
    public List<Turns> findAllByTurnStatusName(String status);

    public List<Turns> findAllByDayAndTurnStatusName(LocalDate day, String status);

    public List<Turns> findAllByTurnStatus_NameAndDiary_Dentist_Id(String status, Long id);
}