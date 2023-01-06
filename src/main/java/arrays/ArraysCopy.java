package arrays;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {
        int [] intArr1 = {1,2,3,4,5,6};
        //=============================
        String [] strArr1 = {"hello", "hi"};
        String [] strArr2 = Arrays.copyOf(strArr1, strArr1.length);
        strArr2 [0] = "bye bye";
        System.out.println(Arrays.toString(strArr2));


    }
}
