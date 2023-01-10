package packageOne;

import packageTwo.ClassZ;

public class ClassY extends ClassX {

    private String style = "sport";
    private int size = 8;

    private void putOn(){

    }
    String animal = "Cat";
    boolean hasVaccine = true;

    boolean check () {

        return false;
    }

    protected String childName = "Adilkhan";
    protected double age = 2.2;

    protected boolean sleep () {

        return false;
    }

    public String streetAddress = "E Devon ave";
    public byte aptNumber = 112;

    public void moveIn (){

    }


    public static void main(String[] args) {
        ClassX classX = new ClassX();
//        System.out.println(classX.brand); we can not call codes starts with access modifier "private" in other classes
//        System.out.println(classX.size);
//        System.out.println(classX.sell);
        System.out.println(classX.phoneNumber);
        System.out.println(classX.isCellPhone);
        classX.call();

        System.out.println(classX.childName);
        System.out.println(classX.age);
        classX.play();

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

