package methodOverloading;

public class MethodOverloading3 {
    public static void main(String[] args) {
        isPalindrome("civic");
        isPalindrome("Chicago");
        String [] array = {"civic", "mom", "level", "madam"};
        String [] array2 = {"hello", "mom", "level", "madam"};
        System.out.println(isPalindrome(array2));
        System.out.println(isPalindrome(array));


    }

    public static boolean isPalindrome (String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
      //  System.out.println(result.equals(str));
        return result.equals(str);

    }

    public static boolean isPalindrome (String str, String str1){
        return ( str.equals(str1));

    }

    public static boolean isPalindrome (String [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (!isPalindrome(arr[i])) {

                return false;
            }
        }

        return true;



    }




}
