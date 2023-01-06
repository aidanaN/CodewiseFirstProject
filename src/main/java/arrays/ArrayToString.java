package arrays;

import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        String [] strArray1 = {"Good", "Morning", "Everyone"};
        String [] strArray2 = {"Good", "Morning", "Everyone"};
        String [] strArray3=strArray1;
        System.out.println(strArray1);
        /*
        Arrays.toString(arr) method converts all values of array into ine String.
         */
        System.out.println(Arrays.toString(strArray1));

        int [] intArray = {1,2,3,4,5,6,7,8,9,0};
        String str = Arrays.toString(intArray);
        System.out.println(str);
        /////===========================================================

        Boolean [] booleansArray = {true, false, true, false};
        System.out.println(Arrays.toString(booleansArray));

        System.out.println();

        short [] shortArray = {1,2,3,4,5};
        System.out.println(Arrays.toString(shortArray));

        System.out.println();

        float [] floatsArray = {23,234,23,56};
        System.out.println(Arrays.toString(floatsArray));

        System.out.println();

        double [] doublesArray = {12.5, 56.56, 89.45, 78.54};
        System.out.println(Arrays.toString(doublesArray));

        int [] intsArray = {1,5,8,9,7};
        System.out.println(Arrays.toString(intsArray));




    }
}
