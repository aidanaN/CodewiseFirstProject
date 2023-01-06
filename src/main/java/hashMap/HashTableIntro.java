package hashMap;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableIntro {
    public static void main(String[] args) {

        Hashtable<String, Integer> productPrices = new Hashtable<>();
        productPrices.put("apple", 3);
        productPrices.put("sugar", 5);
        productPrices.put("pepper", 1);
        productPrices.put("avocado", 2);
        productPrices.put("chicken", 6);
        productPrices.put("milk", 4);


        getProductsInRange(productPrices, 4, 7);
        getProductsInRange(productPrices, -8, 1);


    }

    public static int calculateTheSum(Hashtable<String, Integer> products, int quantity) {
        int sum = 0;

        for (String key : products.keySet()) {

            sum += products.get(key) * quantity;
        }
        System.out.println(products);
        System.out.println(quantity);
        System.out.println(sum);


        return sum;


    }

    public static Hashtable<String, Integer> getProductsInRange(Hashtable<String, Integer> products, int beginRange, int endRange) {
        if (beginRange >= 0 && endRange <= 100){
            if (beginRange < endRange) {

            Hashtable<String, Integer> newProduct = new Hashtable<>();

            for (String key : products.keySet()) {
                if (products.get(key) >= beginRange && products.get(key) <= endRange) {
                    newProduct.put(key, products.get(key));

                }
            }
            System.out.println(newProduct);
            return newProduct;
        } else {
            System.out.println("Please provide correct information");

        }
        return null;

    }
        else {
            System.out.println("Please enter the numbers in range from 0 to 200");
        }
        return null;

    }



    public static Hashtable <String,Integer> nameOfProducts (Hashtable<String,Integer> productsName) {


        Hashtable<String, Integer> products = new Hashtable<>();
        for (String key : productsName.keySet()) {
            if (key.startsWith("a")) {
                System.out.println("key starts with a: " + key);
            }
        }
        for (String key : productsName.keySet()) {
            if (key.endsWith("p")) {
                System.out.println("ends with p: " + key);
            }
        }
        return null;
    }}



