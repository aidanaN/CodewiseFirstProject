package stringManipulation;

public class Contains {
    public static void main(String[] args) {
        /*

       contains() method comes from String class, and can only be used by String
       it checks if one String contains another String
       return boolean: true or false
         */

        String slogan = "Chicago is a windy city";
        String city = "Chicago";

        boolean doesItContain = slogan.contains(city);
        System.out.println(doesItContain);

        doesItContain = slogan.contains("windy");
        System.out.println(doesItContain);

        doesItContain = slogan.contains("win");
        System.out.println(doesItContain);

        doesItContain = slogan.contains("Chi");
        System.out.println(doesItContain);

        }



    }

