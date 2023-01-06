package stringManipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringManipulationHomework {

    public static void main(String[] args) {

        //=====1======

        String message = "Hello everyone, Let's do Java String exercises";

        char h = message.charAt(10);
        System.out.println("The character at position 10 is "+h);

        //======2=====

        System.out.println("The length of text is " + message.length()+ " characters");

        //======3=====

        System.out.println(message.toUpperCase());

        //======4======
        System.out.println(message.toLowerCase());

        //======5=====
        char g = message.charAt(5);
        System.out.println("Letter #5 is: "+ g);

        //======6======

        System.out.println(message + " 's last letter is: " + message.charAt(message.length()-1));

        //======7======

        System.out.println(message.substring(0,1).toLowerCase());

        //=======8=======

        System.out.println(message.substring(message.length()-1).toUpperCase());






    }
}
