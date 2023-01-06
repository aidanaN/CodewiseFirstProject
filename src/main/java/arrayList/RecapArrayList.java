package arrayList;

import java.util.ArrayList;

public class RecapArrayList {
    public static void main(String[] args) {

        ArrayList<Double> salary = new ArrayList<>(); //create = declare , declaring the object
        salary.add((double) 2300);
        salary.add(3300.00);
        salary.add(5500.50);
        salary.add(800.20);
        salary.add((double)10000);
        salary.add(4500.50);
        salary.add(22000.00);

        /*
        find and print the largest salary
         */

        Double largest = 0.0;

        for (int i = 0; i < salary.size(); i++){
            if (salary.get(i)>largest ){
                largest = salary.get(i);

            }
        }
        System.out.println(largest);

        Double smallest = salary.get(0);

        for (int a = 0; a < salary.size();a++ ){
            if (salary.get(a)<smallest){
                smallest = salary.get(a);
            }
        }
        System.out.println(smallest);


        ArrayList <Short> orderID = new ArrayList<>();
        orderID.add((short)232);
        orderID.add(Short.valueOf("543"));
        orderID.add(Short.valueOf((short)909));
        orderID.add((short)121);
        orderID.add((short)353);
        orderID.add((short)234);

        /*
        find the average of all orderIDs and print it
         */

        short sum = 0;
        int average;

        for (int b =0; b < orderID.size(); b++){

            sum += orderID.get(b);}

           average = sum / orderID.size();
            System.out.println(average);





            }
        }



















