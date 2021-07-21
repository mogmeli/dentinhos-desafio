package com.example.dentinhos.repository;

import com.example.dentinhos.model.Dentists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DentistRepository extends JpaRepository<Dentists, Long> {
    @Query(value = "SELECT DISTINCT t.diary.dentist FROM Turns t WHERE COUNT(t.diary) > 2 GROUP BY t.diary")
    public List<Dentists> findAllDentistsWithMoreThanTwoTurnInOneDate();
}