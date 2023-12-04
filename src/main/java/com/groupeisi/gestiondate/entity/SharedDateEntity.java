package com.groupeisi.gestiondate.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shared_dates")
public class SharedDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sharedDateId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "calculation_id")
    private CalculEntity calculation;

    public int getSharedDateId() {
        return sharedDateId;
    }

    public void setSharedDateId(int sharedDateId) {
        this.sharedDateId = sharedDateId;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public CalculEntity getCalculation() {
        return calculation;
    }

    public void setCalculation(CalculEntity calculation) {
        this.calculation = calculation;
    }
}
