package variables;

public class Cup {

    public static void main(String[] args) {

        Cat.hospitalAddress = "575 w Dundee rd";

        Cat tom = new Cat("Tom"); //object
        tom.isVaccinated = true;
        tom.breed = "Hawaiian";
        tom.gender = "Boy";
        tom.age =2;
        tom.owner = "Luina";
        tom.info();


        Cat cat1 = new Cat("Katy");
        cat1.isVaccinated = false;
        cat1.age = 5;
        cat1.breed ="British";
        cat1.gender = "girl";
        cat1.info();

        System.out.println(tom.hospitalAddress);
        System.out.println(cat1.hospitalAddress);
        tom.hospitalAddress = "55 wall st";
        System.out.println(cat1.hospitalAddress);






    }




    public static void sayHello(){  //reusable, it will run only if we call it
        String name = "James",email,address = "main st"; //local variable, not going outside of method;
        int age, phoneNumber, year;
        System.out.println();

    }


}
