package arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        String [] animals = {"elephant", "giraffe" , "wolf" , "lion"};
        String animal1 = animals[0];
        String animal2 = animals[1];
        String animal3 = animals[2];
        String animal4 = animals[3]; //if more than 3,we see outOfBoundsError

        System.out.println(animal1);
        System.out.println(animals[2]);
        System.out.println(animals[10-8+1]);
        System.out.println(animals[animals.length-2]);

        int [] fibonacciNumbers = {1,1,2,3,5,8,13,21,34,55};

        int num1 = fibonacciNumbers[2];
        num1 = fibonacciNumbers[5];
        int num2 = fibonacciNumbers [0];
        int num3= fibonacciNumbers[fibonacciNumbers.length -5];
        System.out.println(num3);

        //==============================

        String [] cities = new String[5];
        System.out.println(cities[0]); // null, no data yet here
        cities[0] = "Los Angeles";
        cities[1] = "Paris";
        cities[2] = "Rome";
        cities[3] = "Dubai";
        cities[4] = "Tokyo";

        System.out.println(cities[0]);
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);

        }
        cities [3] = "Kuala-Lumpur";
        
       //  String countries []; C# 
        String [] countries;  //declared / created array of String
        countries = new String[]{"USA", "Argentina", "Italy" , "Japan", "", null, "Ukraine"}; //7 elements
        countries[6]= "Singapore";
        countries[5] = "Kazakhstan";
        
        double [] prices = {1.99, 2.99, 3.99,20.99,99.99};
        long [] longArray = {1343, 36677,235, 5464};
        boolean [] booleanArr = {true, true, false, true, false, true};
        char [] charArr = {'w', 'h', 'y','c','l','d','?',};
        System.out.println(prices[0]);
        for (int a = 0; a < prices.length; a++);
        System.out.println(prices[1]);


        //==============================

        String [] berries = new String[5];
        String [] fruits = new String[]{"", "", "", "", ""};

        int [] nums = new int [5];
        int [] newNums = new int[] {0,1,2,3,4};


        //==========================================================================

        String [] flowers = new String[]{"Roses","Tulips"};
        System.out.println(flowers[1]);

        byte [] cars = {1,2,4,9};
        System.out.println(cars[2]);

        boolean isPrivate [] = {true,false};
        System.out.println(isPrivate[1]);

        char letters [] = {'b','i','n','g','o'};
        System.out.println(letters[2]);

        short [] numbers = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i< numbers.length; i++);
        System.out.println(numbers[5]);










        
        
        









    }
}

