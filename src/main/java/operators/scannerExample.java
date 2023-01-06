package operators;
import java.util.*;

public class scannerExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.next ();
        double a = scan.nextDouble();
        double b = scan. nextDouble();
        System.out.println("Boolean");

        boolean isTrue = scan.hasNext();

        System.out.println("Boolean from user input: " +isTrue);

    }
}
