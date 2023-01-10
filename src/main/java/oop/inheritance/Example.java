package oop.inheritance;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        int a = 10;
        byte b = (byte) a; //casting

        float f = 10.0f;
        double d = 2.0;

        d = f; // double can fit float, because it is larger

        f = (float) d;

        Feline feline = new Feline("Africa");
        Animal animal = new Animal();

        animal = feline;

        feline = (Feline) animal; // casting the object

        String str = new String();
        Object obj = new Object();

        str = (String) obj;
        obj = str;
        obj = animal;
        obj = new ArrayList<>();
        obj = 3;
        obj = "string";

        /*
        Integer c = 10;
        String number = "90";

         */

        String number = "90";
        Integer c = Integer.parseInt(number);




    }
}
