package operators;

public class ArithmeticOperators {
    public static void main (String[] args ) {

        //Assignment operator

        int x = 5;
        System.out.println("The value of x: " + x);

        x = 10;


        // x - operand
        // 10 - operand
        // = assignment operator

        int y = 20;
        int p = 10;

        y = 5; //5
        y = p; //10

        y = y; //10;

        p = y; //10;
        p = 5; //5
        p = p + 20; //25
        y = p; //25

        // =========Arithmetic operators===========

        short num = 10;
        short num2 = 20;

        int sum = num + num2;
        System.out.println(sum);

        // ========subtraction ========

        int q = 1;
        int r = 2;

        int s = r-q;
        System.out.println(s + 5);

        // =========multiplication========

        long l = 10;
        long k = 5;

        System.out.println(l*k);

        l = k*k; // 25


        // division //

        byte myByte = 9;
        byte myByte2 = 3;

        System.out.println (myByte / myByte2);

        myByte2 = (byte) (myByte / myByte2) ; // 3

        //=====modulus====== %

        int j  = 10;
        int m = 3;

        System.out.println(j % 3); //1
        System.out.println(j / m); //10/3=3

        double d = 10.0;
        double c = 3;

        System.out.println(d % c);

        System.out.println(25 % 3);
        System.out.println(10%9);//1
        System.out.println(10%6);//4

        System.out.println(29.0 % 3.0);

        ///practice
        int digit = 100;
        int anotherDigit = 20;

        System.out.println(digit % anotherDigit);













    }
}
