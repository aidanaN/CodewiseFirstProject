package arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysReverseOrder {
    public static void main(String[] args) {

        int a = 6; //primitive

        Integer b = 6; //non-primitive object, wrapper class

        double d = 5.0;
        Double d2 = 5.2;

        Integer [] intArray = {5,6,3,0,1,2}; // 0,1,2,3,4,5 => ascending order
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(intArray);

                                              // 5,4,3,2,1,0 => descending order
        System.out.println("ascending: " + Arrays.toString(intArray)); // ascending order

        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println("descending: " + Arrays.toString(intArray));

        /*
        String, char, double
         */

        String [] StringArr = {"Aidana", "Nugumetova"};
        System.out.println(Arrays.toString(StringArr));
        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(StringArr));

        Character []charArr = {'u','w','o','p','f'};
        System.out.println(Arrays.toString(StringArr));
        Arrays.sort(charArr, Collections.reverseOrder());
        System.out.println(Arrays.toString(charArr));

        Double [] doublesArr = {121.1,754.12,448.87,4577.69};
        System.out.println(Arrays.toString(doublesArr));
        Arrays.sort(doublesArr, Collections.reverseOrder());
        System.out.println(Arrays.toString(doublesArr));

        System.out.println();
        int [] arr1= {3,4,5,7,8,89,};
        sortInt(arr1);

        sortInt(new int [] {3,5,7,8,9,5,4,4});
        Integer [] intArr1 ={1,2,3,4,4,76,};
        reverseOrder(intArr1);
        reverseOrder(new Integer[]{1,35,47,56});
        sortString(new String[] {"blue", "red", "white", "pink"});




    }

    public static int [] sortInt (int [] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr;

    }

    public static Integer [] reverseOrder (Integer [] arr){
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static String [] sortString (String [] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static String [] reverseStringArr ( String [] arr){
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        return arr;



    }



}
