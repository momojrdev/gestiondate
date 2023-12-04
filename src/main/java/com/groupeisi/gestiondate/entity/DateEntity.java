package com.groupeisi.gestiondate.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "date_entries")
public class DateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dateEntryId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false, length = 20)
    private String dayOfWeek;

    // Getters and setters
}
