package stringManipulation;

public class Trim {
    public static void main(String[] args) {
        String myStr = "     Whole Foods";
        System.out.println(myStr.length());
        myStr = myStr.trim();
        System.out.println(myStr.trim());/// everytime catch the value

        String shop3 = "M  arianos    shop";
        shop3 = shop3.trim();
        System.out.println(shop3.trim());
        System.out.println(shop3.trim().replace(" ", ""));

        shop3 = shop3.trim();
        System.out.println(shop3.charAt(2));







    }
}
