package scannerClass;

import java.util.Scanner;

public class ScannerString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);/*
        System.out.println("Please enter your first name : ");
        String firstName = sc.nextLine();
        System.out.println("Please enter you last name : ");
        String lastName = sc.nextLine();
        System.out.println("Please enter your age : ");
        String age = sc.nextLine();

        System.out.println("\nHello " + firstName + " " + lastName + "!" + "\n You are so young! Just " + age + " " + " years old" );*/




//////============1============
        Scanner mult = new Scanner(System.in);
        System.out.println("Please enter first multiply number: ");
        int firstNumber = mult.nextInt();
        System.out.println("Please enter second multiply number: ");
        int secondNumber = mult.nextInt();
        int sumMult = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + sumMult);


        //////=========2========
        Scanner add = new Scanner(System.in);
        System.out.println("PLease enter first number for addition:" );
        int firstAdd = add.nextInt();
        System.out.println("Please enter second number for addition:");
        int secondAdd = add.nextInt();
        System.out.println("Please enter third number for addition:");
        int thirdAdd = add.nextInt();
        int sumAdd = firstAdd + secondAdd + thirdAdd;
        System.out.println(firstAdd + " + " + secondAdd + " + " + thirdAdd + sumAdd);

        //////============3==========
        Scanner bread = new Scanner(System.in);
        System.out.println("Please enter your product name: ");
        String productName = bread.nextLine();
        System.out.println("Please enter you product price:");
        int productPrice = bread.nextInt();
        System.out.println("Please enter quantity of your products: ");
        int productQuantity = bread.nextInt();
        int sumProducts = productPrice * productQuantity;

        System.out.println("\nYou purchased " + productQuantity + " " + productName + "each cost " +   productPrice + "$, the total amount is " + sumProducts + "$");

        String name ="Jason";
        System.out.println(name.charAt(0) + "".toLowerCase());

        int a = 45;
        String number = a +"";



    }
}
