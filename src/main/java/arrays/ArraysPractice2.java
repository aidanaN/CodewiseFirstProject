package arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        int [] arr1 = {1,5,7,8,9};
        int x = 5;
        System.out.println(containX(arr1, x ));
        System.out.println(containX(arr1, x));
        int [] arr2 = {1,2,3,4,5,6};
        int [] arr3 = {1,5,6,7,22,7};



    }
    public static boolean containX (int [] array, int x){

       for (int i = 0; i < array.length;  i++) {

           if (array[i] == x) {
               return true;
           }
       }
           return false;
       }



       public static boolean containsX2(int [] array, int x){
        String str = Arrays.toString(array);

        if (str.contains(x+"")){
            return true;

        }else{
            return false;
        }


       }

    }



