package methodOverloading;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class OverloadedCalculator {

    public static double addition (int a, int b){
        return a+b;
    }
    public static double addition (int a, int b, int c){
        return a+b+c;
    }
    public static double addition (double a, double b){
        return  a+b;
    }
    public static double substraction (int a, int b){
        return a-b;
    }
    public static double substraction (int a, int b, int c){
        return a-b-c;
    }
    public static double substraction (double a, double b){
        return a-b;
    }
    public static double multiplication (int a, int b){
        return a*b;
    }
    public static double miltiplication (int a, int b, int c){
        return a*b*c;
    }
    public static double multiplication (double a, double b){
        return a*b;
    }
    public static double division (int a, int b){
        return a/b;
    }
    public static double division (int a, int b, int c){
        return a/b/c;
    }
    public static double division (double a, double b){
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println(addition(5,7) );
        System.out.println(addition(4,8,(int)2.14));
        System.out.println(addition(5.2,55));
        System.out.println(division(20.0,5.9f));


    }

}
