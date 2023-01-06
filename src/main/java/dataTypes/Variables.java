package dataTypes;

public class Variables {

    public static void main (String [] args){
        System.out.println ("My name is Aidana");

        // byte can store values from -128 to 127
        byte a = 12;

        System.out.println(a);

        byte b = 127;

        System.out.println("first value of b " + b);

        b = 23;

        System.out.println("second value of b: " + b);

        byte c = -128;

        //--------------------Shorts------------------//

        short youngAge = 18;
        System.out.println("My age is " + youngAge);
        youngAge = -32768;

        youngAge = 125;

        System.out.println("New age is " + youngAge);



        //------------------INT------------------//

        int transactionID = 24135468;
        System.out.println("Transaction ID is: " + transactionID);

        transactionID = 11111111;


        int bankAccount = 111222;

        System.out.println("New Transaction ID" + transactionID);



        System.out.println("My bank account number " + bankAccount);

        bankAccount = 123456;

        // create new short, byte, int, long


        byte unit = 123;


        System.out.println("My unit number is " + unit);


        short coding = 789;

        System.out.println("My lucky numbers are: " + coding);



        int building = 4567;

        System.out.println("My building numbers is: " + building);


        long phone = 606656565;

        System.out.println("My phone number is: "+ phone);

        float degreeCelcius = 35.634561232f;

        double degreeFah = 101.8;

        float number = 123123111312.12121212112f;

        System.out.println("My salary is : " + number);

        double code = 12123213121.12121313131;

        System.out.println("My code is : " + code);

        //----------boolean only stores true or false

        boolean isLegal = true;

        System.out.println(isLegal);

        boolean isYoung;
        isYoung = false;

        System.out.println( isYoung);

        char letter = 't';
        char digit = 3;
        char specCharacter = '?';


        char massage = 'o';



        char print = '1';



        char show = '!';

        massage = 'O';


        System.out.println("" + massage + "" + print + "" + show);

        System.out.println("Char value: " + massage + print + show);

        //------------String - the most common data type

        String name = "Codewise 2022 Batch1!";

        System.out.println(name);

        String firstName = "Aidana";
        String lastName = "Nugumetova";

        System.out.println(firstName + " "  + lastName);

        int age = 26;
        System.out.println("Hello my name is " + firstName + " " + lastName + ". I am " + age + "years old.");

        String city = "Chicago";

        System.out.println("Hello my name is " + firstName + " " + lastName + ". I am from " + city + "." );


        byte myByte = 12;
        int myInt = 23;
        double myDouble = 8989;

        String myName = "Aidana";
        String myCIty = "Chicago";

        System.out.println(myByte + myInt);




























    }
}
