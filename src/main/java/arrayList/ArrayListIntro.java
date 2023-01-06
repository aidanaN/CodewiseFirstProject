package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();

        //add is using to add values-elements inside arrayList

        String[] arr = new String[]{};
        groceryList.add("milk");
        groceryList.add("bread");
        groceryList.add("apple");

        System.out.println(groceryList); //print out method

        System.out.println(groceryList.get(1)); //get method (int index) will return the element form given index

        System.out.println("ice cream");
        System.out.println("peanut butter");
        System.out.println("12");

        System.out.println();

        ArrayList<String> toDoList = new ArrayList<>();


        toDoList.add("to get a highly paid IT job");
        toDoList.add("to sent my grandparents to Mecca");
        toDoList.add("to have a vocation in Hawaii");
        toDoList.add("to pay off all family credit cards");
        toDoList.add("to have in saving account at least 50000$");
        toDoList.add("to buy Saint Lauren bag");

        System.out.println(toDoList);

        int size = toDoList.size(); //size the same as length
        int i;
        for (i = 1; i < toDoList.size(); i++) ;
        System.out.println(toDoList.get(0) + " DONE");

        ArrayList <String> cars = new ArrayList<>();
        cars.add("Maserati");
        cars.add("Lambargini");
        cars.add("Porche");
        cars.add("Mazda");
        cars.add("Bugatti");

        System.out.println(cars);

        cars.set(3, "Ferrari");

        System.out.println(cars);

        cars.set(4, "Aston Martin");

        System.out.println(cars.get(4));

        System.out.println("size: " + cars.size());
        System.out.println(cars.get(1));

        cars.remove(0);
        System.out.println(cars);

        System.out.println(cars.get(0));
        cars.remove(2);
        System.out.println(cars.size());

        cars.add(2, "Ferrari");
        cars.add(0, "Maserati");
        System.out.println(cars);


        for (int ii = 0; ii < cars.size(); ii++){
            if (cars.get(ii).equals("Ferrari")){
                System.out.println(cars.get(ii));
            }
        }

        System.out.println(cars.size());
        cars.clear();
        System.out.println(cars.size());



    }
}
