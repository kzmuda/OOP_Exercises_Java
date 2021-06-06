package com.company;

public abstract class Product {
    protected String name;
    protected Double price;
    protected Double weight;


    public Product(String name, Double price, Double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }
}
