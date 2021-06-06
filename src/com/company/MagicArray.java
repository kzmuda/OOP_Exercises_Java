package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicArray<T> {
    private List<T> array = new ArrayList<T>();
    private int lastAddedIndex = 0;

    public MagicArray() {
    }

    public void add(T object) {
//        int currentIndex;
        int currentIndex = lastAddedIndex < 3 ? lastAddedIndex : 0;
//
//        if (lastAddedIndex < 2) {
//            currentIndex = lastAddedIndex+1;
//        } else {
//            currentIndex = 0;
//        }
        if (array.size() == 3) {
            array.remove(currentIndex);
        }
        array.add(currentIndex, object);
        lastAddedIndex = currentIndex+1;
    }

    public void print() {
        System.out.println(Arrays.toString(new List[]{array}) + " - Array\n" + lastAddedIndex + " - Last added index");
    }

}
