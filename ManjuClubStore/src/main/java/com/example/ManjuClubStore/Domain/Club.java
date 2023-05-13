package com.example.ManjuClubStore.Domain;
import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@Entity
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int fee;

    // Public no-arg constructor
    public Club() {}

    // All-args constructor
    public Club(String name, int fee) {
        this.name = name;
        this.fee = fee;
    }

}