package com.groupeisi.gestiondate.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "calculations")
public class CalculEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int calculationId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false, length = 20)
    private String dayOfWeek;


    // Getters and setters
}
