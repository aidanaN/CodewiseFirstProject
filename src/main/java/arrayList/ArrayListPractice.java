package arrayList;

import javax.swing.*;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        /*
        contains (elements) it will return boolean
        true if contains, false if does not contain
         */

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int iii = 0; iii <= 20; iii++) {
            if (iii % 2 ==0 ){
                evenNumbers.add(iii);
            }

        }
        System.out.println(evenNumbers);

        System.out.println();

        ArrayList<Integer> numbers3 = new ArrayList<>();


        for ( int a = 0; a <= 100; a++){
            if (a % 3 == 0){
                numbers3.add(a);

            }
        }
        System.out.println (numbers3);

        ArrayList<String> apples = new ArrayList<>();
        for (int b = 1; b <= 100; b++){

            if (b % 10 != 0 ){
                apples.add(b + " apples");
            }

        }
        System.out.println(apples);

        for (int j = 1000; j <= 1100; j++){
            if (j % 2 !=0 ){
                apples.add(j + " apples");
            }
        }

        for (int k = 0; k < apples.size(); k++){
            System.out.println(apples.get(k));
        }

        boolean o = apples.contains("2 apples");
        System.out.println(o);

        o = apples.contains("2 aples");
        System.out.println(o);







    }



    }

