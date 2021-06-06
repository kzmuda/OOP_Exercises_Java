package com.company;

import java.time.LocalDate;

public class Bread extends Product{
    private LocalDate expirationDate;



    public Bread(String name, Double price, LocalDate expirationDate) {
        super(name, price, 1.0);
        this.expirationDate = expirationDate;
    }
}
