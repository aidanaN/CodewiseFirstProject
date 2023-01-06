package classesAndObjects;

public class Animal {

    String type;
    String color;
    String size;

    String name;

    byte age;
    boolean isMammal;

    public void eats(){
        System.out.println(color + " " + size + " " + type + " is eating");

    }

    public void sleeps (){
        System.out.println(color + " " + size + " " + type + " is sleeping");


    }

    public void plays (){
        System.out.println(color + " " + size + " " + type + " is playing");

    }

    public boolean isMammal (){
        return true;

        /* RETURN TYPES
        void
        int
        short
        byte
        boolean
        String
                    it can be only one of this options
         */
    }


}
