package hashMap;

import java.util.HashMap;

public class StockPriceClass {
    public static void main(String[] args) {
        HashMap <String,Double> stockPrice = new HashMap<>();

        stockPrice.put("apple", 400.90);
        stockPrice.put("tesla", 1200.32);
        stockPrice.put("meta", 300.43);
        stockPrice.put("bofa", 5.5);
        stockPrice.put("slack", 123.54);
        stockPrice.put("macdonalds", 98.12);

        findTheHighestPrice(stockPrice);
        findTHeAveragePrice(stockPrice);
        System.out.println(removeStocks(stockPrice, 200));
    }

    public static double findTheHighestPrice (HashMap<String,Double> stocks){

        double highest = 0;

        for (String key : stocks.keySet()){
            if (stocks.get(key) > highest){
                highest = stocks.get(key);
            }

        }
        System.out.println(highest);
        return highest;


    }

    public static double findTHeAveragePrice(HashMap<String,Double> stocks){
        double average = 0;
        double sum = 0;

        for (String key : stocks.keySet()){
            sum += stocks.get(key);   //stocks.get(key) = value;          key = value;

        }
        average = sum/stocks.size();
        System.out.println(average);
        return average;



    }
    public static HashMap<String,Double> removeStocks (HashMap<String,Double> stocks, double minPrice){

        HashMap <String,Double> newStocks = new HashMap<>();



        for (String key : stocks.keySet()){
            if (stocks.get(key)<= minPrice){
                newStocks.put(key,stocks.get(key));
            }
        }

        return stocks;


    }

}
