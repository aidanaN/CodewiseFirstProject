package packageTwo;

import packageOne.ClassX;
import packageOne.ClassY;

public class ClassZ {


    private String device = "laptop";
    private double price = 1200;

    private void buy () {

    }

    String friend = "Feruza";
    boolean isCodewiser = true;

    void study () {
        System.out.println();
    }


    protected String todolist = "work out";
    protected double time = 15.30;

    protected void jump () {

    }

    public static String singer = "Dimash K";
    public static int awards = 8;

    public static void sing (){


    }

    public static void main(String[] args) {
        ClassY classY = new ClassY();
//        System.out.println(classY.style); we can not call codes starts with access modifier "private" in other classes
//        System.out.println(classY.size);
//        System.out.println(classY.putOn);
        System.out.println(classY.animal);
        System.out.println(classY.hasVaccine);
        System.out.println(classY.check());

        System.out.println(classY.childName);
        System.out.println(classY.age);
        System.out.println(classY.sleep());

        ClassX classX = new ClassX();
//        System.out.println(classX.brand); we can not call codes starts with access modifier "private" in other classes
//        System.out.println(classX.size);
//        System.out.println(classX.sell);
        System.out.println(classX.phoneNumber);
        System.out.println(classX.isCellPhone);
        System.out.println(classX.call());

        System.out.println(classX.childName);
        System.out.println(classX.age);
        System.out.println(classX.play());




    }
}