package oop.inheritance;

public class Feline extends Animal {

    String specie;
    String habitat;

    /*
    this () - call costructor from this class
    super () - call constructor from parent class
     */


    public Feline(int age){
        super(true, "feline",1 ); //must always be first line inside constructor
    }
    public Feline (String name){

    }
    public Feline(){

    }



    public void meow (){

    }
    public void play(){
        System.out.println(specie + " is playing"+ " and " + age + " years old");
    }

    public static void main(String []args){
        Feline feline = new Feline("Alex");
        feline.eat();
    }
}
