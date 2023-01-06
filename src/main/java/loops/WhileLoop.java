package loops;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 10) {
            System.out.println("Good morning everyone!");
            i++;


        }
        System.out.println();
        int a = 0;
        while (a <= 20) {
            System.out.println(a);
            a++;
        }
        System.out.println();
        int b = 1;
        while (b <= 31) {
            System.out.println(b + " January 2023");
            b++;
        }
        System.out.println();
        int c = 1;
        while (c <= 30) {
            if (c % 2 == 0) {
                System.out.println(c + " even + 3 = " + (c + 3));
                c++;
            } else {
                System.out.println(c + " odd + 2 = " + (c + 2));
                c++;
            }

        }
        System.out.println();
        for (int d = 100; d >= 0; d--) {
            if (d % 4 == 0) {
                System.out.println(d + " quarter ");}

                if (d % 2 == 0) {
                    System.out.println(d + " double ");
                } else {
                    System.out.println(d);
                    d--;

                }
            }


    }




}



