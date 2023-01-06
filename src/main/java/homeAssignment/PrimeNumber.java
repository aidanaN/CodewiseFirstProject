package homeAssignment;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        boolean prime = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num1 = scanner.nextInt();

        for (int i = 2; i <= num1 / 2; i++){
            if (num1 % i == 0) {
                prime = true;
                break;
            }

        }
        if (!prime)
            System.out.println(num1 + " is a prime number.");
        else
            System.out.println(num1 + " is not a prime number");

    }

}
            











