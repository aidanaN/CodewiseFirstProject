package homeAssignment;

import java.util.Arrays;

public class ReverseString {


    public static void main(String[] args) {
        System.out.println(reverseString("codewise"));
        System.out.println(reverseString("mama"));
        System.out.println(reverseString("hello"));



    }


    public static String reverseString(String str) {

        String reverse = "";
        int length = str.length();
        for( int i = length - 1 ; i >= 0 ; i-- ) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}