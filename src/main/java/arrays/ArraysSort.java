package arrays;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        //                        0        1         2        3
        String [] strArray = {"banana", "orange", "apple", "kiwi"};
        Arrays.sort(strArray); // this sorts array in ascending order
        System.out.println(Arrays.toString(strArray));

        double [] doubleArr = new double[] {3, 7.5, 7.1, 9.5, 0, 3.12};
        System.out.println(Arrays.toString(doubleArr));
        Arrays.sort(doubleArr);
        System.out.println(Arrays.toString(doubleArr));

        char [] charArr = {'a','v','t','e','u'};
        System.out.println(Arrays.toString(charArr));
        Arrays.sort(charArr);
        System.out.println(Arrays.toString(charArr));

        int [] intArr = {12,47,5,147,15,6};
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        long [] longArr = {12,35,7878,14589,14557,14555};
        System.out.println(Arrays.toString(longArr));
        Arrays.sort(longArr);
        System.out.println(Arrays.toString(longArr));

        float [] floatsArr = {45,568,7,54,41};
        System.out.println(Arrays.toString(floatsArr));
        Arrays.sort(floatsArr);
        System.out.println(Arrays.toString(floatsArr));

        short [] shortArr = {4,8,7,2,1,4,5};
        System.out.println(Arrays.toString(shortArr));
        Arrays.sort(shortArr);
        System.out.println(Arrays.toString(shortArr));






    }
}
