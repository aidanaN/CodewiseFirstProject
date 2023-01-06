package ifElseLogicalOperators;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class NestedIfElse {

    public static void speeding(int speed, boolean isBirthday) {
        if (!isBirthday) {
            if (speed > 60 && speed <= 80) {
                System.out.println("You get small ticket");
            } else if (speed > 80) {
                System.out.println("You get big ticket");
            }
        } else {
            System.out.println("No ticket");


        }
    }

    public static void main(String[] args) {
        speeding(90, true);
        speeding(81, false);
        speeding(60, false);
        System.out.println(isEqual(1,2,3));





    }

    public static boolean isEqual(int a, int b, int c) {
        if (a + b == c || b + c == a || a + c == b) {
            return true;
        } else {
            return false;
        }
    }
    public boolean cigarParty (int cigars, boolean isWeekend) {
        if (isWeekend) {
            if (cigars <= 40) {
                System.out.println("The party was successfull on weekend");
                return true;
            } else {
                System.out.println("The party failed on weekend");
                return false;
            }
        } else {
            if (cigars >= 40 && cigars <= 60) {
                System.out.println("PArty was successful on weekday");
                return true;
            } else {
                System.out.println("Party failed on weekday");
                return false;

            }
        }

    }
    public static int greenTicket (int a, int b, int c) {

        if (a == b) {
            if (a == c)
                return 20;
        } else {
            return 10;
        }
        if (b == c) {
            if (a == c)
                return 20;
        } else {
            return 10;
        }
                     return 0;
        }








    }




