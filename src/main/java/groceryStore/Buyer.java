package groceryStore;

import java.util.Scanner;

public class Buyer {

    //

    String fullName;
    String phoneNumber;
    boolean isResident;
    String address;
    int age;

    public void enterInfo(String name, int age1, boolean resident, String address1) {
        fullName = name;
        age = age1;
        isResident = resident;
        address = address1;


    }

    // display
    public void display() {
        // block of code belongs for display method
        System.out.println("Buyer's display");
        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Resident: " + isResident);
        System.out.println("Phone number is: " + phoneNumber);

    }

    public boolean isResident() {
        return isResident;
    }
    public void updateResidency( boolean newResidency){
        isResident = newResidency;



    }

    public void search () {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please text the keyword");

        String keyword = scanner.nextLine();

        System.out.println("Searching for the " + keyword);


    }
    public void addToCart (String fruit1){
        System.out.println( fruit1 + " has been added to your card");


    }

    public void updateProfile (String newFullName, int newAge, boolean newIsResident, String newAddress){
        fullName = newFullName;
        age = newAge;
        isResident = newIsResident;
        address = newAddress;

        System.out.println(newFullName + newAge + newAddress + newIsResident);








    }







    }



