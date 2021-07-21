package com.example.dentinhos.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalTime;

@Entity
@Getter
@Setter
public class Diarys {

    @Column(name = "id_diary")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    LocalTime start_time;
    LocalTime ending_time;
    @ManyToOne
    Dentists dentist;

    public Diarys() {

    }
}