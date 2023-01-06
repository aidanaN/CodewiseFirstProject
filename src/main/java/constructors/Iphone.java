package constructors;

public class Iphone {

    public Iphone(){
        System.out.println("inside constructor ");
        this.color = "space gray";
        this.memory = 128;
        this.price = 999.99;
        this.isUnlocked = false;
    }

    public Iphone(int memory){
        System.out.println("this Iphone has: " + memory + " GB memory.");
        this.memory = memory;

    }
    public Iphone(String color){
        System.out.println("this Iphone is " + color);
    }

    String color;
    int memory;
    double price;
    boolean isUnlocked;


    public static void main(String[] args) {
        Iphone object1 = new Iphone();
        Iphone iphoneSE = new Iphone(256);
        Iphone iphoneX = new Iphone(128);
        Iphone iphone1Pri = new Iphone();

        System.out.println(new Iphone(512)); //this Iphone has: 512 GB memory, objectId;
        System.out.println(iphoneX);
        System.out.println(iphoneX);








    }

    public void playMusic (){
        System.out.println("Iphone is playing music");
    }






}
