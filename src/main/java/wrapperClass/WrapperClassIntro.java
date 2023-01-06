package wrapperClass;

public class WrapperClassIntro {
    public static void main(String[] args) {
        int age = 35;
        char letter = 'S';

        //Wrapper class
        //convert age and letter to Object type. Wrapper class
        //Autoboxing: converting from primitive to object
        Integer a = age;
        Character b = letter;
        System.out.println(a);
        System.out.println(b);

        //unboxing
        int i = a;
        char e = b;
        Boolean n = true; // boolean n = true;
        boolean m = n;
//              it calls utility
        //Array.toString(arr); => print all values in that array
        //Utility method

        // Utility means = useful
        System.out.println(Integer.sum(1,5));
        System.out.println(Integer.max(5,8));
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(validatePassword("James2023"));
        pickNumbers("hkd2vdk2023");


    }

    /////////////////////////////////////////////////////////////////////

    //Pseudo code

    //1.Declare a method signature
    //2.loop for each character of the given String
    //3.Get each char and check if it is digit
    //4.If it finds at least one digit, just break loop

    public static boolean validatePassword(String password) {

        boolean found = false;

        for (int i = 0; i < password.length(); i++){
            char letter = password.charAt(i);
            if (Character.isDigit(letter)){
                found = true;
                break;
            }
        }
        return found;


    }
    public static void pickNumbers (String word){
        String number = "";

        for (int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            if (Character.isDigit(letter)){
                number += letter;

            }
        }
        int result = Integer.parseInt(number);
        System.out.println("Numbers: " + result);
    }




}
