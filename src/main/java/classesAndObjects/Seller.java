package classesAndObjects;

public class Seller {

    String storeName; //    use camel case for variables and method names;
    String phoneNumber; //  for phoneNumbers use String, because we are not gonna calculate this numbers
    int numberOfEmployee;
    boolean isHalal;

    String bottleName;
    int bottleSize;
    int bottlePrice;
    boolean isBottleRecycling;

    public void display() {
        // block of code belongs for display method
        System.out.println("Seller's display");
        System.out.println("Full name: " + storeName);
        System.out.println("Is Halal: " + isHalal);
        System.out.println("Phone number is: " + phoneNumber);


    }
}
