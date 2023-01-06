package loops;

public class DoWhileLoop {
    public static void main(String[] args) {

        int l = 100;
        int sum = 0;

        while ( l >= 1);
        {
            if (l % 5 == 0) {
                System.out.println(l + "divisible number");

                if (l % 2 != 0) {
                    System.out.println(l + "weird number");
                }

            } else {
                if (l % 2 != 0) {
                    System.out.println(l + "odd number");
                }
            }
            if (l % 2 == 0) {
                System.out.println(l + "even number");

            }
            l--;


        }}}
