package variables;

public class Cat {
    // primitive data type can store only one information;
    // object can store a lot of information;
    //Instance variable
    //The information or data that belongs or that describes the object of this class

    String name;
    int age;
    String breed;
    String gender;
    boolean isVaccinated;
    String owner;
    static String hospitalAddress;

    public Cat (String name ){ //local variable //overloaded constructor
        this.name = name; //Java prefers the local first;

    }
    public void info (){
        System.out.println("\n Cat Information");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Breed: " + this.breed);
        System.out.println("Owner: " + this.owner);
        System.out.println("Gender: " + this.gender);
        System.out.println("Is vacinated: " + this.isVaccinated);
    }


}
