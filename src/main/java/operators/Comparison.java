package operators;

public class Comparison {
    public static void main (String []args) {

        boolean b = 5 > 2;
        System.out.println(b);
        b = 5 < 2;
        System.out.println(b);

        // == equals operators, compare 2 values if that are equal

        b = 10 ==10;
        System.out.println("10==10: " + b);

        b = 10==5;
        System.out.println("10==5: " + b);

        b = 10>=5;
        System.out.println("10>=5: " + b);

        String str = "abc";
        String str2 = "123";
        System.out.println(str + str2);

        System.out.println(1+5);
        System.out.println(str+1+5); //abc15








    }
}
