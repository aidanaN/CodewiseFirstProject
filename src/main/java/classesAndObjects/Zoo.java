package classesAndObjects;

public class Zoo {
    public static void main(String[] args) {

        Animal elephant = new Animal();
        Animal lion = new Animal();
        Animal mouse = new Animal();
        Animal chicken = new Animal();

        elephant.type = " elephant ";
        elephant.color = " gray ";
        elephant.size = "large";
        elephant.name = "Dumbo";

        lion.type = "cat";
        lion.color = "yellow";
        lion.size = "medium";
        lion.name = "Alex";


        elephant.eats();
        elephant.sleeps();

        mouse.type = " mouse ";
        mouse.color = " grey";
        mouse.size = "small ";
        mouse.name = "Mickey";

        chicken.type = " chicken ";
        chicken.color = " yellow";
        chicken.size = "medium ";
        chicken.name = "Como";

        mouse.eats();
        mouse.plays();

        chicken.sleeps();
        chicken.eats();







    }
}
