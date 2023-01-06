package loops;

public class Break {
    public static void main(String[] args) {
        /* break is a java keyword which is used to jump out of loop, to break loop
        --------------
        print all numbers from 1 to 10
        if number = 8, we want to stop printing
        it can be used with all loops

         */

        for (int i = 1; i <= 10; i++){
            if (i == 8){
                System.out.println("reached number 8, breaking the loop");
                break; // it will stop the loop;
            }
            System.out.println(i);

        }
        System.out.println("code after for loop");


        System.out.println();

        int a = 20;
        while (a < 30) {
            System.out.println(a);

            if (a == 25){
                System.out.println("Reached 25, breaking while loop");
                break;

            }
            a++;
        }

        int b = 5000;

               do {
                    System.out.println(b);
                    if (b == 5020) {
                        break;
                    }
                    b++;
                }while (a < 10000);


    }



}
