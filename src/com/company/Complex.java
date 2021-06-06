package com.company;

public class Complex implements Comparable<Complex> {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }

    @Override
    public int compareTo(Complex o) {
        if(this.real > o.real) {
            return 1;
        } else if(this.real < o.real) {
            return -1;
        } else {
            return Integer.compare(this.imaginary, o.imaginary);
        }
    }
}
