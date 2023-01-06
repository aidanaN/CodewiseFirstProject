package methodOverloading;

public class MethodOverloading2 {
    public static void main(String[] args) {



    }
    public static int sum (int a, int b){
        return  a + b;



    }
    public static int sum (double a, double b){
        return(int) (a + b);
    }
    public static int sum (float a, float b){
        return (int) (a+b);
    }
    public static int sum (int a, int b, int c){
        return a+b+c;
    }
    public static int sum (long a, long b, long c){
        return (int) (a+b+c);
    }
    public static String project1 (String [] a, int b, int c, boolean d){
        return "";
    }
    public static String stringMethod (int a, double b, String c, String d, int [] e){
        return "";
    }
    public static String stringMethod (String a, String b, String c, String d, String e, String v, String r, String y, String t, String o) {
        return a;
    }


}
