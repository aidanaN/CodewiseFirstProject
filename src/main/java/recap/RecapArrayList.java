package recap;

import java.util.ArrayList;
import java.util.Arrays;

public class RecapArrayList {
    public static void main(String[] args) {
//     Array of Strings. Arrays can store both primitives and objects
        String[] arrayOfBerries = new String[3];
        arrayOfBerries[0] = "blackberry";
        arrayOfBerries[1] = "blueberry";
        arrayOfBerries[2] = "mulberry";
        System.out.println(Arrays.toString(arrayOfBerries));
//         this will return the number of elements inside array
        System.out.println(arrayOfBerries.length);


//        ArrayList can only store objects, it's resizable
//        dynamic collection of similar data
        ArrayList<String> listOfBerries = new ArrayList<>();
        listOfBerries.add("cherry");//0
        listOfBerries.add("strawberry");//1
        listOfBerries.add("raspberry");//2
        System.out.println(listOfBerries);
//        this will return the number of elements inside array
        System.out.println(listOfBerries.size());
//           we can either remove elements by index number or remove element by value
        listOfBerries.remove(1); // go and remove strawberry
        System.out.println(listOfBerries.size() + " " + listOfBerries);
        listOfBerries.remove("cherry");
        System.out.println(listOfBerries);

        listOfBerries.add("golden cherry");
        listOfBerries.add("California blueberries");

        System.out.println(listOfBerries);
        //[raspberry,(add)watermelon golden cherry, california bluberries]
        listOfBerries.add(1, "watermelon");
        System.out.println(listOfBerries);

//        checks if we have certain elements or no
        boolean hasStrawberry = listOfBerries.contains("strawberry");//true if element is there, and false if not
        System.out.println(hasStrawberry);


        System.out.println(listOfBerries.contains("golden cherry"));//true
        System.out.println(listOfBerries.contains("blueberries"));//false
        System.out.println(listOfBerries.contains("California blueberries"));//true
        System.out.println(listOfBerries.contains("California blueberries ".trim()));//remove extra space

        System.out.println(listOfBerries);
        System.out.println(listOfBerries.get(1));//take endex number and return element from that index
        System.out.println(listOfBerries.size() - 1);//California blueberries
        System.out.println(listOfBerries.get(10 + 5 - 12));//California blueberries

//       Set() value updates the value that we already have
        listOfBerries.set(0, "sweet raspberry");//updates the element at given index
        System.out.println(listOfBerries);

        listOfBerries.clear(); // doesn't return anything, but it removes all elements from the list
        System.out.println(listOfBerries.size());

        boolean isEmpty = listOfBerries.isEmpty();//returns true if list is empty, and false if not
        System.out.println(isEmpty);


        listOfBerries.add("cherry");//0
        listOfBerries.add("strawberry");//1
        listOfBerries.add("raspberry");//2
//        listOfBerries.add(3,"potato");//set method can not create new element, but we can update it
//        so raspberry on //2 will become potato insted with .set method
        listOfBerries.set(2, "potato");
        System.out.println(listOfBerries);


//    FOR LOOP = to print String using FOR loop
        ArrayList<String> toDoList = new ArrayList<>(listOfBerries);
        toDoList.add("to do coding");
        toDoList.add("to read a book");
        toDoList.add("workout");
        toDoList.add("cook a dinner");
        toDoList.add("go to cinema");
        System.out.println("The size of String is: " + toDoList.size());

        System.out.println(toDoList);
//        we can clone previous class by using Object
        Object obj = listOfBerries.clone();// it turned arrayList to Object
        System.out.println(obj.toString().length());//we turned Object to String

        for (int i = 0; i < listOfBerries.size(); i++) {
            System.out.println("berry #" + i + " " + listOfBerries.get(i));
        }


//       FOR EACH LOOP -  use for each loop to print Integer arraylist
        ArrayList<Integer> houseNumbers = new ArrayList<>();

        System.out.println("The size of Integer is: " + houseNumbers.size());

        int b = 1;
        while (b <= 10) {
            houseNumbers.add(b);
            ++b;
        }
        System.out.println(houseNumbers);
        /*
        String money = "$ = 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 = $"
         */



//    WHILE LOOP-use while loop to print double arraylist
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(34.78);
        prices.add(3848.59);
        prices.add(129.32);
        prices.add(9943.4);
        prices.add(49.99);
        System.out.println("The size of Double is: " + prices.size());


//        DO WHILE LOOP = use do while loop to print boolean arraylist
        ArrayList<Boolean> value = new ArrayList<>();
        value.add(true);
        value.add(true);
        value.add(false);
        value.add(false);
        value.add(true);
        System.out.println("The size of boolean is: " + value.size());

        int a = 0;
        String str = "";
        do {
            str += value.get(a) + ", ";
            a++;    // we can also do (a = a + 1)
        } while (a < value.size());
        System.out.println(str);


        ArrayList<String> money = new ArrayList<>();

        money.add("1");
        money.add("2");
        money.add("3");
        money.add("4");
        money.add("5");
        money.add("6");
        money.add("7");
        money.add("8");
        money.add("9");
        money.add("10");


      //  int m = 0;
      //  for (String m : money) {

        for (int num : houseNumbers) {



        }


        }


    }





















