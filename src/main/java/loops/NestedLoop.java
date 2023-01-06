package loops;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");
        }
        int i = 1;
        while (i <= 10) {
            System.out.println("Hi");
            i++;
        }
        int a = 1;
        do {
            System.out.println("Bye bye");
            a++;
        } while (a < 10);
        System.out.println();


        for (int b = 1; b <= 3; b++) {
            System.out.println("WEEK: " + b);
            for (int c = 1; c <= 7; c++) {
                System.out.println("Day: " + c);
                //           for ( int g = 1; g <= 24; g++){
                //             System.out.println("Hours: " + g);
            }
        }

        for (int k = 1; k <= 12; k++) {
            System.out.println("Month: " + k);
            for (int p = 1; p <= 30; p++) {
                System.out.println("    day: " + p);
            }
        }
        for (int q = 1; q <= 8; q++) {
            for (int p = 1; p <= q; p++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int t = 1; t <= 6;t++){
            for (int y = 1; y <= 6-t; y++){
                System.out.print(" ");
            }
            for (int e = 1; e <= t * 2 - 1; e++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("!!! HAPPY NEW YEAR !!!");


    }}

