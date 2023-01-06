package arrays;

import java.util.Arrays;

public class ArraysBinarySearch {

    public static void main(String[] args) {
        String [] strArr = {"chicago", "LA","San-Francisco"};
        int index = Arrays.binarySearch(strArr, "LA");
        System.out.println(index);


    }
}
