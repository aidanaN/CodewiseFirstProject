package homeAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        //=====================1=============================

        String [] cars = {"BMW", "Tesla","Mercedes","Toyota", "Mazda","Honda","Range Rover", "Lada", "Maserati", "Rolls Royce"};

        for (int i= 0; i < cars.length; i++){
            System.out.println(i+ 1 + " " + cars[i]);
        }

        List <String> car = new ArrayList(Arrays.asList(cars));
        System.out.println("the car size is: " + car.size());

        //=====================2==============================

        Integer [] age = {1,2,3,4,5,6,7,8,9,10};

        for (int a = 0; a < age.length; a++){
            System.out.println(age[a] + " years old");
        }

        List <Integer> ages = new ArrayList (Arrays.asList(age));
        System.out.println("the age size is:" + ages.size());

        //====================3=================================

        Double [] price = {10.50,11.40,12.2,15.22,50.00};

        for (int b = 0; b < price.length; b++){
            System.out.println("the price is " +price[b] + "$");
        }

        List <Double> prices = new ArrayList (Arrays.asList(price));
        System.out.println("the size of price is: " + prices.size());

        //===================4===================================

        Character [] project1 = {'h','e','l','l','o','j','a','v','a'};

        for (int d = 0; d < project1.length; d++){
            System.out.println("the char is: " + project1[d] );
        }
        List <Character> project = new ArrayList (Arrays.asList(project1));
        System.out.println("the size of char is: " +  project.size());

        //===================5====================================

        Boolean [] isRecycling = {true,false,false,true,false};

        for (int e = 0; e < isRecycling.length; e++){
            System.out.println("This item isRecycling: " + isRecycling[e]);

        }
        List <Boolean> isRecycle = new ArrayList(Arrays.asList(isRecycling));
        System.out.println("the size of recycling is: " + isRecycle.size());











    }








}
