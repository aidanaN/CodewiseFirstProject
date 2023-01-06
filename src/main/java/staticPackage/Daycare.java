package staticPackage;

public class Daycare {

    public static void main(String[] args) {

        Child child1 = new Child();
        Child child2 = new Child();

        child1.name = "David";
        child2.name = "Olesya";

        child1.eatSnacks();
        child2.singSong();

        child1.playing("Ball");
        child2.playing ("Doll");




    }



}
