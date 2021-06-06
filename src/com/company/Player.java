package com.company;

public class Player {
    private String name;
    private WriteTo display;

    public void printName(){
        display.print(name);
    }

    public Player(String name, WriteTo display) {
        this.name = name;
        this.display = display;
    }
}
