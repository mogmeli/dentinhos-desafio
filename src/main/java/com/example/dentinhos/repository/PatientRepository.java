package com.example.dentinhos.repository;

import com.example.dentinhos.model.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patients, Long> {

    @Query(value = "SELECT t.patient FROM Turns t " +
            "WHERE t.day = :date")
    public List<Patients> findAllPatientsByDay( LocalDate date);

}