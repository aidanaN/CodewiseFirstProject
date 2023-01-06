package classesAndObjects;

public class Car {

    int tires;
    int wheel;
    int window;
    int lights;
    String color;
    int year;
    double price;
    String brand;
    String brand2;
    String brand3;
    String brand4;




    public void drive (){
        System.out.println( color + " " +brand  + " released unique " + tires + " tires and it is driving more faster." );
    }
    public void stop (){
        System.out.println( brand2 + " year of " + year + " " + "cost " +  price + "USD" + " and it is stopped price rising");

    }
    public void heat (){
        System.out.println( brand3 + " can do heating to " + window + " windows" );
    }
    public void playMusic (){
        System.out.println( brand4 + " is showing Toyota music show with " + lights + " lights");
    }

    }



    class Garage {
        public static void main(String[] args) {
            Car mercedes = new Car();
            Car rangeRover = new Car();
            Car lexus = new Car();
            Car toyota = new Car();

            mercedes.brand = "Mercedes";

            mercedes.tires = 4;
            mercedes.wheel = 4;
            mercedes.window = 6;
            mercedes.lights = 4;
            mercedes.color = "Red";
            mercedes.year = 2023;
            mercedes.price = 70000;

            rangeRover.brand2 = "Range Rover";

            rangeRover.tires = 4;
            rangeRover.wheel = 4;
            rangeRover.window = 6;
            rangeRover.lights = 4;
            rangeRover.color = "Black";
            rangeRover.year = 2020;
            rangeRover.price = 100000;

            lexus.brand3 = "Lexus";


            lexus.tires = 4;
            lexus.wheel = 4;
            lexus.window = 6;
            lexus.lights = 4;
            lexus.color = "Yellow";
            lexus.year = 2007;
            lexus.price = 50000;

            toyota.brand4 = "Toyota";


            toyota.tires = 4;
            toyota.wheel = 4;
            toyota.window = 6;
            toyota.lights = 4;
            toyota.color = "White";
            toyota.year = 2005;
            toyota.price = 10000;

            mercedes.drive();
            System.out.println();

            rangeRover.stop();
            System.out.println();

            lexus.heat();
            System.out.println();

            toyota.playMusic();
            System.out.println();
















        }
    }
