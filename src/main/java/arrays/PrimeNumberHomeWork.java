package arrays;

import java.util.Scanner;

public class PrimeNumberHomeWork {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int number;
        number = scanner.nextInt();
        for (int i = 1; i <= 1; i++ ) {

            if (number > 1 && number % number == 0 && number % 1==0 ) {
                System.out.println(number + " :integer number is a prime");
            } else {
                System.out.println(number+" :integer number is not a prime");


            }
            System.out.println();
        }



    }
}
