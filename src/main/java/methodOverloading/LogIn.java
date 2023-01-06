package methodOverloading;

import java.util.Random;

public class LogIn {
    public static void main(String[] args) {
        logIn("1-315-520-3505");
        login("hvj,v","khbhk");
        login("klldkd@gmail.com",true);
    }
    public static void logIn(String phoneNumber) {
        phoneNumber = phoneNumber.replace("-", "");
        phoneNumber = phoneNumber.replace(" ", "");

        System.out.println(phoneNumber);

        if (phoneNumber.length() == 10 || phoneNumber.length() == 11) {
            Random random = new Random();
            int passCode= random.nextInt(1000);

            System.out.println("Passcode: " + passCode+ " sent to " + phoneNumber);
        } else {

            System.out.println("Incorrect phone number");

        }

    }
    public static void login (String username, String password){
        if (username.isEmpty() || password.isEmpty()){
            System.out.println("Invalid credentials. Try again");
        } else {
            System.out.println("Successfully  login");
        }


    }
    public static void login (String phoneNumber, boolean isPhoneNumber){
       if (isPhoneNumber) {
           phoneNumber = phoneNumber.replace("-", "");
           phoneNumber = phoneNumber.replace(" ", "");

           System.out.println(phoneNumber);

           if (phoneNumber.length() == 10 || phoneNumber.length() == 11) {
               Random random = new Random();
               int passCode = random.nextInt(1000);

               System.out.println("Passcode: " + passCode + " sent to " + phoneNumber);
           } else {
               System.out.println("Invalid phone number");
           }
       }else {

               System.out.println("sent to gmail");

           }

       }}










