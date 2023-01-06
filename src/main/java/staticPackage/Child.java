package staticPackage;

import java.security.spec.RSAOtherPrimeInfo;

public class Child {

    String name;
    int age;
    static String play;
    static String draw;
    String gameName;



    public void eatSnacks(){
        System.out.println(name + " is eating snacks");
    }
    public void singSong(){
        System.out.println(name + " is singing songs");
    }
    public static void playing (String gameName){
        System.out.println("Playing " + gameName + " games with other kids");
        play = gameName;
    }
}
