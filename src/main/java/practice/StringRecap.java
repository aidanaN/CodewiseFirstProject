package practice;

public class StringRecap {
    public static void main(String[] args) {

        System.out.println(doubleChar("Coding"));
      reverseString("Aidana");
        countA("Hello Aidana");


    }

    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            // result = result + charAt(i);
            result += (str.charAt(i) + "");
            result += (str.charAt(i) + "");
            // "CCooddiinngg"
        }
        return result;
    }
    public static String reverseString(String str){
        String reverse = "";
        for ( int i = str.length()-1;i>=0;i--){
        reverse = reverse + str.charAt(i);



    }
        System.out.println(reverse);
        return reverse;


}
public static void countA (String str) {
    int counter = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'a') {
            counter++;


        }
        System.out.println(str + " = " + counter);


    }


}
}












