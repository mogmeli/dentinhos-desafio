package com.example.dentinhos.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Patients {

    @Column(name = "id_patient")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    String last_name;
    String address;
    String dni;
    LocalDate birth_date;
    String phone;
    String email;

    public Patients() {
    }
}