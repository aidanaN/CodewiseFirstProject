package classesAndObjects;

public class Cake {

    String name;
    String decoration;
    int expiration ;
    boolean isSweet;

    public void bake (){
        System.out.println( name +" expire after " + expiration + " days" );
    }
    public void sell(){
        System.out.println( name + " is sweet :" + isSweet);
    }
    public void cook(){
        System.out.println( name + " with " + " decoration" + " is cooking");

    }





}
class Bakery {
    public static void main(String[] args) {

        Cake cake1 = new Cake();
        Cake cake2 = new Cake();
        Cake cake3 = new Cake();
        Cake cake4 = new Cake();

        cake1.name = "Honeycake";
        cake1.expiration = 5;
        cake1.isSweet = true;

        cake1.bake();
        System.out.println();

        cake2.name = "Napaleon";
        cake2.isSweet = false;

        cake2.sell();
        System.out.println();

        cake3.name = "Cheesecake";
        cake3.decoration = "Birthday";

        cake3.cook();
        System.out.println();






    }
}
