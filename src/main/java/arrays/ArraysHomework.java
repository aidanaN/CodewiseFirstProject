package arrays;

import java.util.Arrays;

public class ArraysHomework {
    public static void main(String[] args) {
        ////===========TASK #1=============
        int sum = 0;
        int [] my_array = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < my_array.length; i++)
         sum = sum + my_array[i];
        System.out.println(sum);

        ////===========TASK #2==============
        int sum1=0;
        int [] averValues = {3,6,8,10,90,0,25,2,32,11};
        for (int i = 0; i < averValues.length; i++)
            sum1 = sum1 + averValues[i];

        double average = sum1 / averValues.length;
        System.out.println(average);

        ////==========TASK #3===============
        //1
        int [] numArr = {5,4,8,7,6,1,0};
        int [] aptArr = {11,22,33,44,55,66};
        int [] buildingArr = {112,113,114,115,116,117};
        int [] secArr = {1,2,3,4,5,6,7,8,9};
        int [] minutesArr = {10,20,30,40,50,60};

        for (int i = 0; i < numArr.length; i++){
        System.out.println(numArr[i]);}

        //2
        Short [] shortNum = new Short[5];
        shortNum [0] = 1;
        shortNum [1] = 3;
        shortNum [2] = 5;
        shortNum [3] = 7;
        shortNum [4] = 9;

        for (short ii = 0; ii < shortNum.length; ii++){
        System.out.println(shortNum[ii]);}

        //3
        double [] doubleNum = {1.25,22.14,25.1,75.2,98.2};
        double [] doublePrice = {5.10,4.01,8.01,555.2,441.3};
        double [] doubleWeight = {45.};
        double [] doubleGrades = {89.9,90,100,50.5,75.50};
        double [] doublePoints = {10.5,11.5,12.5,13.5};

        for (int a = 0; a < doubleNum.length; a++){
        System.out.println(doubleNum[a]);
        }


        //4
        boolean [] isOrganic = {true,false,true,true};
        boolean [] isPublic = {false,true,true,false};
        boolean [] isTrue = {true,false,false,false};
        boolean [] isFalse = {false,false,true,false};
        boolean [] isRecycle = {true,false,true,false};

        for (int b = 0; b < isOrganic.length; b++) {
            System.out.println(" " + isOrganic[b]);


        }
        //5
        String [] colors = {"blue", "red", "white", "pink", "purple"};
        String [] cars = {"BMW", "Tesla", "Mercedes", "Ford", "Mazda"};
        String [] cities = {"Paris", "Milan", "Astana", "LA", "Prague"};
        String [] countries = {"Kazakhstan", "Ukraine", "Russia", "China", "Kyrgyzstan"};
        String [] pets = {"cat", "dod", "parrot", "hamster", "rabbit"};

        for (int c = 0; c < cities.length; c++){
        System.out.print(" "+cities[c]);}





















    }
}
