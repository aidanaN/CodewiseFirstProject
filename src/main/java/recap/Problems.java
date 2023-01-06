package recap;

public class Problems {
    public static void main(String[] args) {
        System.out.println(isPalindrome("mom"));

        countX("Hello", "jhjhhjvHellohghHello");


    }
    /*
    if you reverse mama => amam
    mom =>mom
    civic=>civic
    madam => madam
     */

    public static boolean isPalindrome(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);

        }
        return reversed.equals(str);

    }

    public static boolean isContains(String a, String b) {
        String word = "";

        if (word.contains(a)) {
            return false;
        } else if (word.contains(b)) {
            return true;


        }
        return true;


    }

    public static int countX(String x, String y) {
        int count = 0;


        for (int a = 0; a <= y.length() - x.length(); a++) {
            if (y.substring(a, a + x.length()).equals(x)) {
                count++;
            }


        }
        System.out.println(count);
        return count;


    }

    public boolean in1To10(int n, boolean outsideMode) {

        if (n >= 1 && n <= 10) {
            return true;
        } else if (outsideMode && n <= 1 || n >=10) {
            return true;
        }
        return false;

    }
}





















