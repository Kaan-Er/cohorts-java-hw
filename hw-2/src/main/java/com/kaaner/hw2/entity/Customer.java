package com.kaaner.hw2.entity;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
public class Customer {
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private String sector;
    private List<Order> orders;
    private LocalDate createdAt;

    public Customer(String name, String surname, String email, String phoneNumber, String sector, List<Order> orders, LocalDate createdAt) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.sector = sector;
        this.orders = orders;
        this.createdAt = createdAt;
    }

}
