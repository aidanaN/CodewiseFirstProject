package operators;

public class RecapOperators {
    public static void main(String[] args) {
        System.out.println("Hello Codewise!");

        String text = "Java programmer";
        int num = 20;
        double d = 10.23;
        char c = 'j';
        char k = '&';
        byte b = 12;

        System.out.println("String text: " + text );
        System.out.println("int : " + num);
        System.out.println("double d: " + d );
        System.out.println("char: " + c);
        System.out.println("char: " + k);
        System.out.println("byte: " + b);

        int n = 20;
        double d2 = 30.5;

        d2 = n;
        System.out.println(d2);

        int length = 145;
        int width = 145;
        int sumArea = length * width;
        System.out.println("The length of square is: " + length);
        System.out.println("The width of square is: " + width);
        System.out.println("The area of square: " + sumArea);

        int length2 = 123;
        int width2 = 123;
        int sumPerimeter = 2 * ( length2 + width2);
        System.out.println("The lenght of the square is: " + length2);
        System.out.println("The width of the square is: " + width2);
        System.out.println("The perimeter of the square is " + sumPerimeter);

        int length3 = 54;
        int width3 = 98;
        int sumPerimeter3 = 2 * ( length3 + width3);
        System.out.println("The lenght of the rectangle is: " + length3);
        System.out.println("The width of the rectangle is: " + width3);
        System.out.println("The perimeter of the rectangle is " + sumPerimeter);

        int length4 = 1234;
        int width4 = 4134;
        int sumArea4 = (length4 + width4) * 2;
        System.out.println("The length of rectangle is: " + length4);
        System.out.println("The width of rectangle is: " + width4);
        System.out.println("The area of the rectangle is " + sumArea4);

        int aa = 12;
        int bb = 5;
        System.out.println ("a + b = " + ( aa + bb));

        System.out.println();

        int result = 1 + 2; //result 3
        System.out.println(result);


        int i = 3;
        i++;
        System.out.println("i :" + i);
        ++i;
        System.out.println("i 2");

        //=====Comparison operators=======

        boolean compare;
        compare = 3 == 5;
        /*
        = assign the value
        == compare, equals
        */

        System.out.println("3 == 5: " + compare);
        System.out.println("3 > 5: " + (3>5));
        System.out.println("3 < 5: " + (3 < 5 ));

        System.out.println(" 3 >= 5: " + (3>=5));
        System.out.println(" 3 <= 5: " + (3<=5));

        /*
        == equals ?
        != not equals to ?
         */

        System.out.println("3 != 5 " + (3!= 5));

        int age = 30;
        int years = -30;

        boolean isTrue = age != years;
        System.out.println(isTrue);

        age = 5;
        years = 5;
        isTrue = age == years;
        System.out.println(isTrue);


        int x = 10;
        int y = 5;

        // int exp2 = (y * x / y + y *x /y );

        int exp2= y * x;
        exp2 = exp2 / y;
        exp2 = exp2 + (y * x / y);
        System.out.println(exp2);

        int xd = 9;
        int yd = 12;
        int ad = 2;
        int bd = 4;
        int cd = 6;

        int ops = 3 + 4 * xd;
        ops = ops / 5;
        int tempInt = yd - 5;
        tempInt  = tempInt * 10;
        ops = ops - tempInt;
        tempInt = ad + bd + cd;
        ops = ops * tempInt;
        ops = ops / xd;
        tempInt = 9 * (4 / xd + ( 9 + xd) / yd);

        System.out.println(tempInt);




















    }
}
