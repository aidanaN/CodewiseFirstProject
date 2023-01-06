package loops;

import java.util.Scanner;

public class NestedForLoopHomework {
    public static void main(String[] args) {

        int a,b, c = 1;
        int n = 5;

        for(a = 1; a <= n; a++) {
            for (b = 1; b <= a; b++) {
                System.out.print(" " + c++);
            }
            System.out.println();
        }
    }
}
