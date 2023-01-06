package operators;

import java.util.SortedMap;

public class OperatorsHomework {
    public static void main (String [] args) {
        //====task1=====
        int a = 100;
        int b = 200;
        int sum = a + b;

        System.out.println(sum);
        //====task2====
        int q = 5;
        int w = 9;
        int e = 10;
        int sum2 = q + w + e;

        System.out.println(sum2);
        //====task3====
        int c = 1;
        int d = 2;
        int sum3 = c + d;
        System.out.println(sum3);

        int g = 3;
        int f = 1;
        int sum4 = g - f;
        System.out.println(sum4);

        int h = 2;
        int i = h;
        int sum5 = i * h;
        System.out.println(sum5);

        int k = 4;
        int l = 2;
        int sum6= k / l;
        System.out.println(sum6);

        int m = 2;
        int n = 8;
        int sum7= m+n;
        System.out.println(sum7);

        int o = 10;
        int p = 7;
        int sum8 = o % p;
        System.out.println(sum8);

        //====task4====
        int length = 9;
        int width = 15;
        int area = length * width;
        int perimeter = 2 * ( length + width);


        System.out.println("The area of rectangle is: " + area);
        System.out.println("The perimeter of rectangle is :" + perimeter);

        //====task5===
        int t = 2345;
        int v = t + 8;
        int s = v / 3;
        int aa = s % 5;
        int bb = i * 5;


        System.out.println("The result: " + bb);

        //=====task6====
        int kk = 8;
        int nn = 2345;
        int mm = 3;
        int ll = 5;
        int yy = 5;

        int first = kk += nn;
        first = first /= mm;
        first = first %= ll;
        first = first *= yy;

        System.out.println(first);


        //=====task7====
        boolean cc = 23 == 45;
        System.out.println( "23 == 45 is " + cc );

        //=====task8====
        boolean dd = -10 == 10;
        System.out.println( " -10 == 10 is " + dd);











    }
}
