package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsEmptyArrayList {
    public static void main(String[] args) {

        ArrayList <String> companies = new ArrayList<>();
        boolean isListEmpty = companies.isEmpty();

        System.out.println("IS companies list is empty? " + isListEmpty);

        companies.add("Google");
        companies.add("Microsoft");
        companies.add("Bank of America");
        companies.add("Cisco");
        companies.add("Oracle");
        companies.add("Uber");

       isListEmpty = companies.isEmpty();
        System.out.println(isListEmpty);

        String [] arrayOfCompanies = new String[companies.size()];
        companies.toArray(arrayOfCompanies);

        System.out.println(Arrays.toString(arrayOfCompanies));


        String [] geeks = {"Saikal", "Myrzakhan", "Ilgiz", "Zhamal"};

        List <String> arrayListGeeks = Arrays.asList(geeks);

        //convert from Array to arrayList

        String [] arrayOfGeeks = new String[arrayListGeeks.size()];

        arrayListGeeks.toArray(geeks);
        System.out.println(Arrays.toString(geeks));

        // another way to convert array to ArrayList

        String [] testers = {"Daniel", "Aichurok", "Nazima"};
        List<String> al = new ArrayList(Arrays.asList(testers));

        System.out.println(al);

        /*

         */
        for (String tester : testers){
            System.out.println("for each: " + tester);
        }
        int a = 0;
        while (a < al.size()){
            System.out.println("while loop: " + al.get(a));
            a++;
        }

        int r = 0;
        do {
            System.out.println("do while " + arrayOfGeeks[r]);
            r++;
        }
        while (r < arrayOfGeeks.length);

        for (int o = 0; o< arrayListGeeks.size(); o++){
            System.out.println("for loop: " + arrayListGeeks.get(r));
        }










    }
}
