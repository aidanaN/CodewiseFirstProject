package methodOverloading;

public class MethodOverloading1 {
    public static void main(String[] args) {
        method1();
        method1(5);
        method1('v');
        method1(1205.2);
        method1("Great news!");
        method1(true);

    }

    public static void method1(){
        System.out.println(("inside method with no parameters"));

    }

    public static void method1(int a){
        System.out.println(("inside method with int"));

    }
    public static void method1 (String a){
        System.out.println(("inside method with String"));
    }
    public static void method1 (boolean b){
        System.out.println(("inside method with boolean"));
    }
    public static void method1 (char b){
        System.out.println(("inside method with char"));
    }
    public static void method1 (double c){
        System.out.println(("inside method with double"));
    }





}
