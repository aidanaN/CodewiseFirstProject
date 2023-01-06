package stringManipulation;

public class CharAt {
    public static void main(String[] args) {
        /*
        charAt () method that returns int
        it belongs to String class, and can only be used by String
        it will return us the char of letter

         */
        String name = "Angelina";
        /*
        A = 0
        n = 1
        g = 2
        e = 3
        etc
         */

        char a = name.charAt(3);
        System.out.println(a);

        String text = "Hello everyone! Hope you are doing well. I wish  you all good luck and at least 120k salary.";

        // ===length () returns number of characters in the string
        // returns int and can be only used by String

        System.out.println("the number of letters: " + text.length());

        String country = "USA";
        System.out.println(country + " has " + country.length() + "letters");

        String school = "Harvard";
        String anotherSchool = "Stanford";

        System.out.println(school.charAt(0));
        System.out.println(anotherSchool + "'s last letter is: " +
                anotherSchool.charAt(anotherSchool.length() - 1));



    }
}
