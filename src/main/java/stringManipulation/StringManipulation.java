package stringManipulation;

import classesAndObjects.Animal;
import classesAndObjects.Zoo;

public class StringManipulation {
    public static void main(String[] args) {

        String name = "John";
        String name2 = "Johnson";

        boolean isEqual = name == name2;
        System.out.println(isEqual); // catched it

        String city1 = "Chicago";
        String city2 = "Miami";
        isEqual = city1 ==city2;
        System.out.println( city1 == city2); // not catched

        String newCity = new String ("Chicago");
        isEqual = city1 == newCity;
        System.out.println("Chicago == new Chicago : " + city1 ==newCity); // it is false, becouse it is NEW



        //===========
        String cake1 = "honeycake";
        String cake2 = "cheesecake";
        String cake3 = "HoneyCake";
        String cake4 = "cheesecake";
        String cake5 = new String ("cheesecake");

        boolean isSameCake = cake1 == cake2;
        System.out.println("honeycake is same as cheesecake " + isSameCake);

        isSameCake = cake1 == cake3;
        System.out.println("honeycake is same as HoneyCake " + isSameCake);

        isSameCake = cake2 == cake4;
        System.out.println("cheesecake is same as cheesecake " + isSameCake);

        isSameCake = cake4 == cake5;
        System.out.println("cheesecake is same as NEW cheesecake" + isSameCake);

        ///////============equals () method from String class

        isSameCake = cake4.equals(cake5);
        System.out.println(isSameCake);/// it will not look at object ID, only on object name; it only compares VALUES;
        // it can be used by String only
        // it is a method returns boolean : true or false

        System.out.println("USA".equals("USA"));
        System.out.println(" hello Codewise".equals("hello Codewise"));

        String animal = "elephant";
        System.out.println(animal.equals("animal"));

        /////What is a difference between and .equals


        /////toLowerCase(), toUpperCase()
        // These  are String methods, that convert text to all lower case, or all upper case














    }

}
