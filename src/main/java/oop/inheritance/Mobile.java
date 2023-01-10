package oop.inheritance;

public class Mobile extends Device{

    String brand;
    double price;
    boolean hasTouchScreen;
    boolean hasCamera;

    public Mobile(boolean isPortable) {
        super(isPortable);
    }


    public void call(){
        System.out.println("calling from mobile");
    }
    public void text(){
        System.out.println("text message from mobile");
    }
    public void takePicture(){
        System.out.println("taking picture from mobile");
    }









}
