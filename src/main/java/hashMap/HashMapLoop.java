package hashMap;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapLoop {
    public static void main(String[] args) {

        HashMap <String, Integer> ages=new HashMap<>();
        ages.put("Rahul", 30);
        ages.put("Patel", 48);
        ages.put("Chitra", 32);
        ages.put("Deepak", 12);
        ages.put("Suresh", 50);
        ages.put("Deepak", 12);//north India
        ages.put("Chandramouli", 50);//south India
        ages.put("Padmanbhan", 65);
        // print ages - print values

        // keySet(), return the set of keys

        for (String name : ages.keySet()){ // collection of Strings
            System.out.println(ages.get(name));
        }

        // print name - print keys

        for (String name : ages.keySet()){
            System.out.println(name);
        }

        String userName1 = null;
        int age1 = 0;


        for (String name: ages.keySet()){
            if (name.equals("Rahul")){
                userName1 = name;
                age1 = ages.get(name);

            }

        }
        System.out.println("Name: " + userName1 + "       Age: " + age1);

        String userName2 = "";
        int age2 = 0;

        for (String name: ages.keySet()){
            if (name.equals("Suresh"))
            {
            userName2 = name;
            age2= ages.get(name);
            }
        }

        String [] names = new String[ages.keySet().size()];
        int i = 0;

        for (String name: ages.keySet()){
            names [i] = name;
            i++;

        }

        Integer [] arrayOfAges = new Integer [ages.size()];

        int k = 0;
      /*  for (String name = ages.keySet())  {

            arrayOfAges[k] = ages.get(name);
            k++;
        }
        System.out.println(Arrays.toString(arrayOfAges));

        System.out.println("Just printing the hashmap itself: "+ ages);
        System.out.println("Printing the entryset of the map " + ages.entrySet() ); // key and value


        /*
        keySet () returns a collection of keys, while

                 */

        }


    }


