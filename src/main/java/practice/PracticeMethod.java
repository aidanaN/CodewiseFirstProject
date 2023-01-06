package practice;



public class PracticeMethod {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;

        add(num1, num2); // or just add(2,5);

        double afterTax = calculateSalesTax (100);
        System.out.println(afterTax);


        double afterDiscount = discount20(afterTax);
        System.out.println(afterDiscount);




    }

    public static void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The total summary is: " + sum);


    }

    public static double calculateSalesTax(double price) {
        double result;
        double salesTax= price * 0.06;
        result = price + salesTax;
        return result;

    }
    public static double discount20(double price1) {
        double result1;
        double discount = price1 * 0.2;
        result1 = price1 - discount;
        return result1;

        /* Pseudo code
        a. Method signature: return type double, discount20, method parameters -> double type
        b. declare a result for final result
        c. create variable for discount and calulate it.
        d. subtract the discount from total price.
        e. return the final result.
         */





    }


}












