package loops;

import java.util.Scanner;

public class DoWhileLoop3 {
    public static void main(String[] args) {

        int sum = 0;
        boolean answer;

        Scanner user = new Scanner(System.in);


        do {

            System.out.println("Please write first number");
            int b = user.nextInt();

            System.out.println("Please write arithmetic operator");
            String operator = user.next();


            System.out.println("Please write second number");
            int c = user.nextInt();


            if (operator.equals("+")) {
                System.out.println(b + " + "+ c + " = " + (b + c));
            } else if (operator.equals("-")){
                System.out.println(b + " - " + c + " = " + (b-c));
            } else if (operator.equals(" * ")){
                System.out.println(b + " * " + c + " = "+ (b*c));
            } else if (operator.equals("/")) {
                System.out.println(b + " / " + c + " = " + (b/c));

            }

            System.out.println("Do you want to play more? true / false");
            answer = user.nextBoolean();


        } while (answer);


    }
}
