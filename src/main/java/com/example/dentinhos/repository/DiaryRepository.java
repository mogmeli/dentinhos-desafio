package com.example.dentinhos.repository;

import com.example.dentinhos.model.Diarys;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiaryRepository extends JpaRepository<Diarys, Long> {
    public List<Diarys> findAllByDentist_Id(Long id);
}