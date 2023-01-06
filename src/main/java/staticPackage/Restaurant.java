package staticPackage;

public class Restaurant {
    public static void main(String[] args) {

        Cook cook1 = new Cook("Ramsey Gordon");
        Cook cook2 = new Cook("Salt Bae");

        cook1.washHand();
        cook2.prepareSalad();

        Cook.takeOrder("Steak");
        cook1.takeOrder("Salat");

        System.out.println(cook2.order);

        cook2.takeOrder("fettuchini");

        System.out.println(cook1.order);




    }







}
