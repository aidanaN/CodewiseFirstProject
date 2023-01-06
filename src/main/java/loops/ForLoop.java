package loops;

public class ForLoop {
    public static void main(String[] args) {
        /*
        Create a program that will print numbers from 0 to 100
         */
//               variable    boolean
        multiplication(3);
        multiplication(7);
        division(5);
        method1(10);
        method2(8);

        addition(5);
        for (int i = 0; i <= 100; i++) {
            //           System.out.println(i);
        }

        //       System.out.println();
        for (int ii = 2; ii <= 50; ii++) {

            //          System.out.println(ii);
        }
        //       System.out.println();
        for (int i = 0; i <= 1000; i++) {
            //           System.out.println(i);
        }
        for (int i = 1; i <= 20; i++) {
            //          System.out.println(i+ " apple");
        }
        for (int i = 1; i <= 50; i++) {
            //           System.out.println("apple " + i);
        }

        for (int i = 1; i <= 10; i++) {
            //           System.out.println(2 + " * " + i + " = " + 2 * i);
        }

        for (int i = 1; i <= 10; i++) {
            //           System.out.println(9 + " * " + i + " = " + 9 * i);
        }

        for (int i = 1; i <= 100; i++) {
            //          System.out.println(100 + " * " + i + " = " + 100 * i);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) { // if its equal we take 1 - 5
            // if just less then 0 to 6
            //           System.out.println(" Java is fun ");
        }
        System.out.println();

        for (int i = 1; i <= 50; i++) {
            //         System.out.println("My name is Feruza");
        }
        //      System.out.println();

        for (int k = 10; k >= 1; k--) {
            //           System.out.println("The value of x is: " + k);
        }

        for (int i = 100; i > 0; i--) {
            if (i % 2 == 0) {
                //              System.out.println(i + " - even ");
            } else {
                //              System.out.println(i + " - odd");
            }

        }
        for (int i = 10; i >= 0; i = i - 2) {
            System.out.println("The value is: " + i
            );

        }


    }




    public static void multiplication ( int number){
        for ( int i = 1; i <= 10; i++){
 //           System.out.println( number + " * " + i + " = " + number * i);
        }


    }
    public static void addition ( int numer) {
        for ( int i = 1; i<=50; i ++){
 //           System.out.println( numer + " + " + i + " = " + (numer + i));


    }

}
public static void division ( int number) {
        for ( double i = 1; i <= 5; i++){
            System.out.println( number + " / " + i + " = " + (number / i));
        }
}

public static void method1 (int number) {
        int sum = 0;
    for (int i = 1; i <= number; i++){
        System.out.println("The number is: " + i);
        sum = sum + i;
    }

        System.out.println("The total sum is: " +sum);

}
public static void method2 (int number) {
        int sum=1;
        for (int i = 1; i <= number; i++){
            System.out.println("The number is : " + i);
            sum= sum * i;

        }
    System.out.println("The total sum is: " + sum);


}


}



















