package com.example.dentinhos.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Turns {

    @Column(name = "id_turn")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    LocalDate day;

    @ManyToOne
    Diarys diary;

    @ManyToOne
    Patients patient;

    @ManyToOne
    @Cascade( value = org.hibernate.annotations.CascadeType.ALL)
    TurnStatus turnStatus;

    public Turns() {
    }
}