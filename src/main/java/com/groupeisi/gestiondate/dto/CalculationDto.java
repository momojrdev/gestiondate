package com.groupeisi.gestiondate.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;


public class CalculationDto {
    private int calculationId;

    @NotNull(message = "L'ID utilisateur ne doit pas être null")
    private int userId;

    @NotNull(message = "La date ne doit pas être null")
    private LocalDate date;

    @NotNull(message = "Le jour de la semaine ne doit pas être null")
    private String dayOfWeek;

    // Getters and setters
}
