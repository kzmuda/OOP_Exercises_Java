package com.company;

public class Display {

    private static writerToConsole writer = new writerToConsole();

    public static void print (String string){

        writer.print(string);

    }

    public static void print (String string, String method){
        if (method == "toFile"){

        } else if (method == "toDatabase"){
            System.out.println(string + "toDatabase");
        } else if (method == "toLog"){
//            toLog(string);
        } else { System.out.println("Wrong method"); }

    }
}
