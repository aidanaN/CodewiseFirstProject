package ifElseLogicalOperators;

import truckingSoftware.Driver;

public class ifElseRecap {

    public static void caughtSpeeding (int speed, boolean isBirthday) {
        if (speed <= 60) {
            System.out.println("Drivers had not ticket");
        } else if ((speed > 60 && speed <= 80 && !isBirthday)) {
            System.out.println("Driver had small ticket");
        } else if (speed > 60 && speed <= 80 && isBirthday) {
            System.out.println("no ticket");
        } else if (speed > 80 && !isBirthday) {
            System.out.println("Driver had big ticket");
        } else if (speed > 80 && isBirthday) {
            System.out.println("No ticket, since you have birthday!");

        }

    }

    public static void main(String[] args) {
        caughtSpeeding( 59, true);
        caughtSpeeding( 70, false);
        caughtSpeeding( 90, true);
        caughtSpeeding( 81, false);



}}



