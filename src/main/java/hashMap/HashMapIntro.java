package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapIntro {

    public static void main(String[] args) {

        HashMap <String, String> antonyms = new HashMap<>();
        antonyms.put("cold", "hot");
        antonyms.put("long","short");
        antonyms.put("hard", "soft");
        antonyms.put(null, "no data");
        antonyms.put("table", null);
        antonyms.put("screen", null);

        System.out.println(antonyms);
        System.out.println(antonyms.get("cold"));
        System.out.println(antonyms.get("hard"));
        System.out.println(antonyms.get("long"));
        System.out.println(antonyms.get(null));
        System.out.println(antonyms.get(null));
        /*
        hashMap is unordered collection. Elements do not have index/position

         */

        HashMap<String, Double> productPrice = new HashMap<>();
        productPrice.put("bread", 2.50);
        productPrice.put("milk", 5.25);
        productPrice.put("water", 1.75);
        productPrice.put("potato", 4.00);
        productPrice.put("banana", 3.24);

        System.out.println(productPrice);
        System.out.println(productPrice.get("banana"));
        System.out.println(productPrice.get("bread"));

        System.out.println(productPrice.size());

        HashMap <String,String> fullName = new HashMap<>();
        fullName.put(null, "James");
        fullName.put(null, "Sam");
        fullName.put("Cameron", null);
        fullName.put("Depp", null);
        fullName.put("Mask", "Elon");

        System.out.println(fullName);
        System.out.println(fullName.get(null));
        System.out.println(fullName.get("Mask"));

        System.out.println(fullName.size());

        HashMap <String,String> names = new HashMap<>(antonyms); // you can copy another hashMap values by putting it in parentheses while hashmap declaration


        HashMap <String, Byte> numbers = new HashMap<>();
        numbers.put("One", (byte) 1);
        numbers.put("Two", (byte) 2);
        numbers.put("Three", (byte) 3);
        numbers.put("Four", (byte) 4);
        numbers.put("Five", (byte) 5);

        System.out.println(numbers.get("One"));
        System.out.println(numbers.get("Two"));
        System.out.println(numbers.get("Three"));
        System.out.println(numbers.get("Four"));
        System.out.println(numbers.get("Five"));


        HashMap <Integer, Integer> decimals = new HashMap<>();
        decimals.put(1, 100);
        decimals.put(2, 200);
        decimals.put(3, 300);
        decimals.put(4, 400);
        decimals.put(5, 500);
        decimals.put(6, 600);
        decimals.put(7, 700);
        decimals.put(8, 800);
        decimals.put(9, 900);
        decimals.put(10, 1000);

        System.out.println(decimals.get(1));

        boolean contains = decimals.containsKey(2); //true
        System.out.println(contains);

        System.out.println(decimals.containsKey(500));

        System.out.println(decimals.containsValue(10000 - 9000));
        System.out.println(decimals.containsValue(null));
        System.out.println(decimals.containsKey(decimals.get(1)-99));
        System.out.println(decimals.containsKey(decimals.get(9 )));


        decimals.remove(10);
        System.out.println(decimals);
        decimals.remove(15);

        decimals.clear();

        decimals.size();

        HashMap <Double, Integer> nums = new HashMap<>();
        nums.put(1.99,1);

        HashMap < Integer, Integer> orders= new HashMap<>();
        orders.put(4, 4);
        orders.put(10,5);
        orders.put(1343, 8);
        orders.put(5454544,5555);
        orders.put(2,5);
        System.out.println(orders);







    }
}
