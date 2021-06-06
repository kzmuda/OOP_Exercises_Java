package com.company;

public class writerToFile implements WriteTo {

    @Override
    public void print(String string) {
        System.out.println(string + " toFile");
    }
}
