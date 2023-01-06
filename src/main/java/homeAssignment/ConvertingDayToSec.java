package homeAssignment;

import java.util.Scanner;

public class ConvertingDayToSec {

    public static void main(String[] args) {

        long days;
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Please enter days: "));
        days = scanner.nextInt();

        long totalSeconds = days * 24 * 60 * 60;
        System.out.println(totalSeconds);
    }
}

