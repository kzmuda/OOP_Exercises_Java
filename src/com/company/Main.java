package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>(
                Arrays.asList(
                        new Person("Jan", "Kowalski", 20),
                        new Person("Anna", "Nowak", 15),
                        new Person("Adam", "Malinowski",
                                17)
                )
        );

        Collections.sort(persons);

        for(Person person: persons) {
            System.out.println(person);
        }
        System.out.println("==================");
        Collections.sort(persons, new PersonByLastNameComparator());

        for(Person person: persons) {
            System.out.println(person);
        }
    }
}
