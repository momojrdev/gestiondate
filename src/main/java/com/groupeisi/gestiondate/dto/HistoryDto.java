package com.groupeisi.gestiondate.dto;


import jakarta.validation.constraints.NotNull;

public class HistoryDto {
    private int historyId;

    @NotNull(message = "L'ID utilisateur ne doit pas être null")
    private int userId;

    @NotNull(message = "L'ID calcul ne doit pas être null")
    private int calculationId;

    // Getters and setters
}
