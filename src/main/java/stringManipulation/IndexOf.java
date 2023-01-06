package stringManipulation;

public class IndexOf {
    public static void main(String[] args) {

        String str = "abcdefg";
        System.out.println(str.charAt(3));
         //functionality that helps us to find letter under number
        //charAt(int index) takes an integer
        // returns char behind that integer

        /*

       indexOf(char c), method belongs to String class takes a char in single quotes, return the index of the char

         */

        System.out.println(str.indexOf('c'));
        System.out.println(str.indexOf('g'));

        ///=== WHat if String has 2 or more letters

        String str2 = "abcdeenkdaafkgcbac";
        System.out.println(str2 + ": " + str2.indexOf('a')); // shows first word
        int index2 = str2.indexOf('b', 5);
        System.out.println(index2);

        str2.indexOf(1); // if indexOf takes one char, it returns the index of that char
        int i = str2.indexOf("dee"); // If indexOf takes one String, it alse returns us but the only first char of that String

        System.out.println("index of dee: " + i);






















        String state = "Connecticut";

        System.out.println("index of o: "+ state.indexOf('o')); //1
        System.out.println(state.indexOf("ti")); //6
        System.out.println(state.indexOf('u',state.length() / 2));
        System.out.println(state.indexOf("14", 20));
        System.out.println(state.indexOf(state.charAt(state.length()-1)));


        String city = "New York";
        System.out.println(city.charAt(2)); // to find a position


        // isEmpty (), checks whether the String is empty or not

        String name1 = "Hello Codewise";
        String name2 = "";
        String name3 = "%";
        String  name4 = " ";

        System.out.println(name1.isEmpty());
        System.out.println(name2.isEmpty());
        System.out.println(name3.isEmpty());
        System.out.println(name4.isEmpty());
        System.out.println((name1 = name2).isEmpty());
        System.out.println(name1.isEmpty());

        // Replace




        System.out.println();




    }
}
