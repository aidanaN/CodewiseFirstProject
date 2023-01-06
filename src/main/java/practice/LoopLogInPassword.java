package practice;

import java.util.Scanner;

public class LoopLogInPassword {
    public static void main(String[] args) {

        String secret = "Hello";
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        int maxAttamps = 3;
        int attampt = 0;



        while (check){
            System.out.println("Please, enter your password: ");
            String enteredPassword = scanner.nextLine();
            if (enteredPassword.equals(secret)) {
                System.out.println("Successful, correct password");
                break;


            } else {

                System.out.println("Incorrect password! Try again!");
                attampt++;

            }
            if (attampt == maxAttamps){
            System.out.println("Maximum attamps reached! Account suspended!");
            break;





        }}


    }




}
