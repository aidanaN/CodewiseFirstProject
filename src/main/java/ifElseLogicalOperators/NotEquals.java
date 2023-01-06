package ifElseLogicalOperators;

public class NotEquals {
    public static void main(String[] args) {
     /*
     != means not equals, and can be used by primitives and non primitive data types
      */

        int num1 = 10;
        int num2 = 5;

        System.out.println(num1 != num2); //true
        System.out.println(num1 == num2); //false

        String name1 = "Johny";
        String name2 = "Johny";
        String name3 = new String ("Johny");

        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name1 != name3);
        System.out.println(name1 != name2);

        /*
        .equals () to compare String values, can only be used by String
         */

        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        System.out.println(!name1.equals(name2));



        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();


        System.out.println(calculator1.equals(calculator2));  //false


        // Logical operators

        /* There are logical operators:

        && - AND
        & - AND
        || - or
        | - or

        There are used with boolean. They produce either true or false.
         */
        /*
        if (weather is nice && I have time) {
            I go walking ;

         */
        }








    }

