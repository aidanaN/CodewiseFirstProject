package methodOverloading;

import java.util.Arrays;
import java.util.Collections;

public class PracticeOverloadingArrays {

    public static void main(String[] args) {
        int [] array1= {1,2,3};
        int [] array2 = {4,5,6};
        System.out.println(Arrays.toString(rotate(array1, "left"))); //2,3,1
        System.out.println(Arrays.toString(rotate(array2, "left"))); //5,6,4
        System.out.println(Arrays.toString(rotate(array1, "right"))); //3,2,1
        System.out.println(Arrays.toString(rotate(array1, "down"))); //3,2,1

        System.out.println(Arrays.toString(rotate(array1, "left", false)));
      reverse("Hola");

    }
    /*
    Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.


rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
         */
       public static int [] rotate (int [] array, String rotate ){
           if (rotate.equals("left")){
               int [] newRotate ={array[1], array[2], array[0]};
               return newRotate;

           } else if(rotate.equals("right")){
               int [] newRotate = {array[2], array[1], array [0]};
               return  newRotate;

           }
           return array;
       }

       public static int [] rotate (int [] array, String rotate, boolean goRotate){
           if (goRotate) {
               if (rotate.equals("left")) {
                   int[] newRotate = {array[1], array[2], array[0]};
                   return newRotate;

               } else if (rotate.equals("right")) {
                   int[] newRotate = {array[2], array[1], array[0]};
                   return newRotate;
               }
               }
               return array;

           }


           public static String reverse (String str){
           String result = "";
           for (int i = str.length() -1; i >= 0; i--){
               result = result + str.charAt(i);


           }
               System.out.println(result);
           return result;



           }







}






