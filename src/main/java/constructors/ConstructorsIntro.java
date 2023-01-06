package constructors;

public class ConstructorsIntro {

    public ConstructorsIntro (){
        System.out.println("Hello! I am a constructor");

    }

    public ConstructorsIntro (String name){
        System.out.println("Hello " + name + "! This is another constructor with one argument" );

    }
    public  ConstructorsIntro (String name, int age){
        System.out.println("Hello " + name + "! This is another constructor with one argument, and it prints your age: " + age);

    }

    public static void main(String[] args) {
        ConstructorsIntro object = new ConstructorsIntro();
        ConstructorsIntro object2 = new ConstructorsIntro();
        ConstructorsIntro object3 = new ConstructorsIntro("Aidana");
        ConstructorsIntro object4 = new ConstructorsIntro("Aidana", 27);
    }





}
