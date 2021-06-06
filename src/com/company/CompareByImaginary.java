package com.company;

import java.util.Comparator;

public class CompareByImaginary implements Comparator<Complex> {
    @Override
    public int compare(Complex o1, Complex o2) {
        if(o1.getImaginary() > o2.getImaginary()) {
            return 1;
        } else if(o1.getImaginary() < o2.getImaginary()) {
            return -1;
        } else {
            return Integer.compare(o1.getReal(), o2.getReal());
        }
    }
}
