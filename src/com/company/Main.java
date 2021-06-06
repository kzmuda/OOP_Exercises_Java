package com.company;

import java.util.*;

public class Main {



    public static void main(String[] args) {

        WriteTo writer = new writerToFile();


        Player player = new Player("Anna", writer);
        player.printName();

        GameState gameState = new GameState(writer);
        gameState.printPlayersCount(10);
        gameState.printSumOfPoints(1000);
        Game game = new Game("Game", gameState, Arrays.asList(player), writer);
//        List<Complex> list1 = createComplexList(10);
//
//        Collections.sort(list1);
//
//        for (Complex number: list1) {
//            System.out.println(number);
//        }
//
//        Collections.sort(list1, new CompareByImaginary());
//
//        System.out.println("==================");
//
//        for (Complex number: list1) {
//            System.out.println(number);
//        }
//
////        List<Person> persons = new ArrayList<Person>(
////                Arrays.asList(
////                        new Person("Jan", "Kowalski", 20),
////                        new Person("Anna", "Nowak", 15),
////                        new Person("Adam", "Malinowski",
////                                17)
////                )
////        );
////
////        Collections.sort(persons);
////
////        for(Person person: persons) {
////            System.out.println(person);
////        }
////        System.out.println("==================");
////        Collections.sort(persons, new PersonByLastNameComparator());
////
////        for(Person person: persons) {
////            System.out.println(person);
////        }
//    }
//
//    public static List<Complex> createComplexList(int limit) {
//        List<Complex> tempList = new ArrayList<>();
//        Random random = new Random();
//
//        for (int i = 0; i < limit; i++) {
//            int real = random.nextInt(10);
//            int imaginary = random.nextInt(10);
//            Complex complex = new Complex(real, imaginary);
//            tempList.add(complex);
//        }
//        return tempList;
    }
}

