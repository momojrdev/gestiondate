package com.groupeisi.gestiondate.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;


public class DateEntryDto {
    private int dateEntryId;

    @NotNull(message = "L'ID utilisateur ne doit pas être null")
    private int userId;

    @NotNull(message = "La date ne doit pas être null")
    private LocalDate date;

    @NotNull(message = "Le jour de la semaine ne doit pas être null")
    private String dayOfWeek;

    public int getDateEntryId() {
        return dateEntryId;
    }

    public void setDateEntryId(int dateEntryId) {
        this.dateEntryId = dateEntryId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public DateEntryDto(int dateEntryId, int userId) {
        this.dateEntryId = dateEntryId;
        this.userId = userId;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public DateEntryDto(int dateEntryId, int userId, LocalDate date, String dayOfWeek) {
        this.dateEntryId = dateEntryId;
        this.userId = userId;
        this.date = date;
        this.dayOfWeek = dayOfWeek;
    }

// Getters and setters
}
