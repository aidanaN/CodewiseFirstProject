package packageOne;

import packageTwo.ClassZ;

public class ClassX {

    private String brand = "Zara";
    private int size = 8;

    private void sell () {

    }

    String phoneNumber = "+1-312-520-3505";
    boolean isCellPhone = true;

    void call () {

    }

    protected String childName = "Amirkhan";
    protected double age = 3.5;

    protected void play () {

    }

    public String fruit = "banana";
    public double price = 3.25;

    public void buy (){

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

        ClassZ classZ = new ClassZ();
//        System.out.println(classZ.device);we can not call codes starts with access modifier "private" in other classes
//        System.out.println(classZ,price); it can be called only in the same class
//        System.out.println(classZ,buy);
//        System.out.println(classZ.friend); we can not use code with "default" access modifier from another package
//        System.out.println(classZ.isCodewiser);
//        System.out.println(classZ.study);
        System.out.println(classZ.todoList); //we can not use
        System.out.println(classZ.time);
        System.out.println(classZ.jump);
        System.out.println(ClassZ.singer);
        System.out.println(ClassZ.awards);
        System.out.println(ClassZ.sing);








    }




}
