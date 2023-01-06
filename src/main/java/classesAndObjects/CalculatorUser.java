package classesAndObjects;

import java.util.Scanner;

public class CalculatorUser {

    public static void main(String[] args) {


        Calculator calculator = new Calculator();

        calculator.add();

        int add = calculator.add();
        System.out.println(add);

        calculator.subtract();

        int subtract = calculator.subtract();
        System.out.println(subtract);

        calculator.divide();

        int divide = calculator.divide();
        System.out.println(divide);

        calculator.multiply();

        int multiply = calculator.multiply();
        System.out.println(multiply);
    }




}
