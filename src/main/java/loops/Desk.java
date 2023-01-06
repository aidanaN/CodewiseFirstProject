package loops;

import java.util.Scanner;

public class Desk {
    public static void main(String[] args) {
        //checkEvenorOdd(1);
  //      printNumbers(5);
        printString("");


        /* Pseudo code:
        1. Method signature
       2. we use if Else statement to identify if the number is even or odd
       3. If it is even => we use loop to run 30 times and print "Hi"
       4. If it is odd => we use loop to print it 30 times
         */
    }

    public static void checkEvenorOdd(int number) {

        if (number % 2 == 0) {
            //even
            for (int a = 0; a <= 30; a++) {
                System.out.println(a + ". Hi");

            }
        } else {
            for (int i = 0; i < 30; i++) {
                System.out.println((i + 1) + ". hello");
            }


        }
    }

    public static void printNumbers(int n) {

        if (n > 0) {
            for (int i = 0; i <= n; i++) {
                System.out.println("Please enter the positive number");
            }
        } else {
            System.out.println("Invalid number");


        }
    }

    /* Pseudo code
    1. Method signature
    2. RUn a loop
     */
    public static void printString (String str){
        if (str.isEmpty()){
            System.out.println("Invalid data. String cannot be empty");
        } else {
            for (int i=0; i < str.length(); i++ ) {
                char c = str.charAt(i);
                System.out.println(c);




        }


    }


}}