package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapKeyEntrySet {
    public static void main(String[] args) {


        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(10, "ten");
        numbers.put(20, "twenty");
        numbers.put(30, "thirty");
        numbers.put(40, "forty");


        for (Integer key : numbers.keySet()) {
            System.out.println(key);

        }
        for (Integer key : numbers.keySet()) {
            System.out.println(numbers.get(key));


        }

        /*
        10-ten
        20-twenty
         */
        for (Integer key : numbers.keySet()) {
            System.out.println(key +" - "+ numbers.get(key));
        }

        /*
        ENTRYSET () returns a set of key value
        return set of keys and values
        (key - value) = (entry)

         */
        for (Map.Entry<Integer, String> entry : numbers.entrySet()){
            System.out.println(entry);

        }

        HashMap <String, String> fruitsAndVegetable = new HashMap<>();
        fruitsAndVegetable.put("apple", "fruit");
        fruitsAndVegetable.put("carrot", "vegetable");
        fruitsAndVegetable.put("pear", "fruit");
        fruitsAndVegetable.put("cabbage", "vegetable");

        for (String key: fruitsAndVegetable.keySet()){
            if (fruitsAndVegetable.get(key).equals("fruit")){
                System.out.println(key);
            }
        }
        for (String key: fruitsAndVegetable.keySet()){
            if (fruitsAndVegetable.get(key).equals("vegetable")){
                System.out.println(key);
            }
        }
        HashMap <String, String>  words = new HashMap<>();
        words.put("window","house");
        words.put("brick", "house");
        words.put("rain", "nature");
        words.put("water","swimming");
        words.put("association", "organization");
        words.put("software", "system");

        for (String key : words.keySet()){
            if (words.get(key).length() <= 5){  //key
                System.out.println("length <= 5 " + words.get(key)); //value

        }}

        for (String key : words.keySet()){
            if (words.get(key).length() <= 7) {
                System.out.println("length <= 7 " + words.get(key));
            }





        /*
        1. print the value with length <= 5
        length() <= 5:house
        2. print the values with length >= 7
        length () >= 7: swimming
        3. print keys that start with letter a,b,c
        starts with a or b or c: word
        4. print keys that ens with letter e, or o
        ends with e or o: word
         */

       // int length = words.size();
        // System.out.println("length: " + words.size());


    }
     for (String key : words.keySet()){
         if (key.startsWith("a") || key.startsWith("b") || key.startsWith("c")){
             System.out.println("key starts with a,b or c: " + key);
         }
     }
     for (String key: words.keySet()){
         if (key.endsWith("e") || key.endsWith("o")){
             System.out.println("ends with e or o: " + key);
         }
     }

     boolean isEmpty = words.isEmpty();
        System.out.println(isEmpty); //false
        words.clear();

        System.out.println(words.isEmpty());




    }}
