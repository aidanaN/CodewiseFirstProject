package arrays;

public class ArraysPractice {

    public static void main(String[] args) {
        /*
        Create array of Strings, with lengths of 5,
        assign values to each element

         */
        int numberOfGroceries = 5;
        String [] groceryList = new String [numberOfGroceries];
       groceryList [0] = "Sprite";
       groceryList[1] = "Cocies";
       groceryList [2] = "banana";
       groceryList [3] = "tomato";
       groceryList[4] = "Vitamine C";



        for (int i = 1; i < groceryList.length; i++){
            System.out.println(i+1+")" + groceryList[i]);

        }
        char numberOfChars [] = new char[]{'c','o','d','i','n','g',' ', 'i','s',' ','g','r','e','a','t'};

        for (int i = 0; i < numberOfChars.length; i++) {
            System.out.print(numberOfChars[i]);
        }

        String colors [] = new  String[] {"black", "white","pink", "blue", "red", "green","yellow"};

        for (int i= 0; i< colors.length; i++){

        if (colors[i].equals("yellow") || colors[i].equals("green")) {
            continue;
        }
            System.out.println(colors[i]);
        }


        int [] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i]==3 || numbers[i]==8){
                continue;
            }
            System.out.println(numbers[i]);
        }
        double [] price = new double[] {1.99,2.99,3.99,4.99,5.99,6.99,7.99,8.99,9.99,10.99};

        for (int i = 0; i < price.length; i++){
            if (i>= 5 && i <=8 ){
                continue;

            }
            System.out.print(price[i] + ", ");

        }
    }}

