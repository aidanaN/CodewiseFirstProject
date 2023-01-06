package loops;

import java.util.Scanner;

public class DoWhileLoop2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = user.nextInt();

        System.out.println("Please enter the second number");
        int b = user.nextInt();

        boolean answer;
        do {
            System.out.println(a+b);
            System.out.println("Do you want to try again? true/false");
            answer = user.nextBoolean();

        } while (answer);


    }
}
