package truckingSoftware;

public class Driver {
    String fullName;
    int age;
    boolean isDrugTest;
    String location;


    public void printInfo(){
        System.out.println("Name: " + fullName);
        System.out.println("age: " + age);
        System.out.println("Is driver has a Drug Test: " + isDrugTest);
    }

    public void reportAccident(String location){
        System.out.println("Driver " + fullName +  " had an accident in " + location );


    }
    // this method should print out name
    public void drive(){
        System.out.println("\n" + fullName + " is driving");

    }

    public String sendLocation(){

        // huge block of code that can figure out your location

        return "LA";// must be the very last statement


    }

    public int sendTotalLoads(){

        int totalLoads = 5;
        return totalLoads;


    }





}
