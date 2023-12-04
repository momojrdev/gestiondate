package com.groupeisi.gestiondate.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "history")
public class HistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int historyId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "calculation_id")
    private CalculEntity calculation;

    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
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

    public HistoryEntity(int historyId, UserEntity user, CalculEntity calculation) {
        this.historyId = historyId;
        this.user = user;
        this.calculation = calculation;
    }
}
