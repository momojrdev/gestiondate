package com.groupeisi.gestiondate.dto;

import jakarta.validation.constraints.NotNull;

public class UserDto {
    private int id;

    @NotNull(message = "Le nom ne doit pas être null")
    private String nom;

    @NotNull(message = "Le prénom ne doit pas être null")
    private String prenom;

    @NotNull(message = "L'email ne doit pas être null")
    private String email;

    @NotNull(message = "Le mot de passe ne doit pas être null")
    private String password;

    // Constructeurs
    public UserDto() {
        // Constructeur par défaut
    }

    public UserDto(int id, String nom, String prenom, String email, String password) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
