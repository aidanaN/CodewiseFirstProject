package stringManipulation;

public class Replace {

    public static void main(String[] args) {

        // replace(), takes 2 chars and replaces the first one with second one, and return new String

        String myStr = "Hello";
        System.out.println(myStr.replace('l','p'));

        //========= Special characters

        String numberAndChars = "Hello 2023! ****Happy N3w Y3ar****";
        System.out.println(numberAndChars.replace('*', '!'));
        System.out.println(numberAndChars);

        //replace String

        String cake = "honeycake";
        System.out.println(cake = cake.replace("honey", "chocolate "));
        System.out.println(cake);


        //Trim

    }
}
