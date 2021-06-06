package com.company;

public class writerToConsole implements WriteTo {

    @Override
    public void print(String string) {
        System.out.println(string);
    }
}
