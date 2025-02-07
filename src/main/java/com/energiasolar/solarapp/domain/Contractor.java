package com.energiasolar.solarapp.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "contractors")
public class Contractor {

    private Long id;

    private String name;

    private String email;

    private String phone;

    private String location;

    private String expertise;

    private boolean isAvailable;

    public Contractor() {}

    public Contractor(String name, String email, String phone, String location, String expertise, boolean isAvailable) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.location = location;
        this.expertise = expertise;
        this.isAvailable = isAvailable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    
    
}