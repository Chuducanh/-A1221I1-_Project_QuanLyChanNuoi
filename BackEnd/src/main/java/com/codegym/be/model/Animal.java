package com.codegym.be.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Animal {
    @Id
    private Long id;

    private String cageId;

    private boolean isSick;

    private float weight;

    private LocalDate dateIn;

    private LocalDate dateOut;

    public Animal(Long id, String cageId, boolean isSick, float weight, LocalDate dateIn, LocalDate dateOut) {
        this.id = id;
        this.cageId = cageId;
        this.isSick = isSick;
        this.weight = weight;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
    }

    public Animal() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCageId() {
        return cageId;
    }

    public void setCageId(String cageId) {
        this.cageId = cageId;
    }

    public boolean isSick() {
        return isSick;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public LocalDate getDateIn() {
        return dateIn;
    }

    public void setDateIn(LocalDate dateIn) {
        this.dateIn = dateIn;
    }

    public LocalDate getDateOut() {
        return dateOut;
    }

    public void setDateOut(LocalDate dateOut) {
        this.dateOut = dateOut;
    }
}
