package com.company;

public class Milk extends Product {
    private Integer capacity;



    public Milk(String name, Double price, Integer capacity) {
        super(name, price, capacity*1.03);
        this.capacity = capacity;
    }
}
