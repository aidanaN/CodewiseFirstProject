package stringManipulation;

public class LowerUpperCase {

    public static void main(String[] args) {
        String shop1 = "Amazon";
        String shop2 = "amazon";

        boolean isSame;

        isSame = shop1.equals(shop2);
        System.out.println("Amazon is same as amazon: " + isSame);

        shop1 = shop1.toLowerCase(); //Amazon ===> amazon
        isSame = shop1.equals(shop2);
        System.out.println("Amazon is same as amazon: " + isSame);

        String car1 = "MERCEDES";
        String car2 = "Rolls Royse";
        String car3 = "Mercedes";
        String car4 = "rolls roys";

        isSame = car1.equals(car3.toUpperCase()); //MERCEDES.equals(MERCEDES);

        System.out.println("car1: " + car1);
        System.out.println("car2: " + car2);
        System.out.println("car3: " + car3);
        System.out.println("car4: " + car4);
        car3 = car3.toUpperCase();
        System.out.println(car3);

        System.out.println(car3 + " " + car1);

        car1 = car1.toLowerCase();
        car3 = car3.toLowerCase();

        System.out.println(car3 + " " + car1);


        System.out.println("RoLLs Royse".equals(car4));
        System.out.println("rolls Royse".toLowerCase().equals(car4));

        System.out.println("ChiCago".equals("cHicago"));
        System.out.println("Chicago".toUpperCase().equals("chIcago".toUpperCase()));

        ////equalsIgnoreCase()

        System.out.println("Chicago".equals("ChIcago"));
        System.out.println("ChiCago".equalsIgnoreCase("cHIcago"));

        String person1= "Brad Pitt";
        String person2 = "Brad pitt";

        boolean isPitt = person2.equals(person1);
        System.out.println("isPitt: " + isPitt);

        isPitt = person2.equalsIgnoreCase(person1);
        System.out.println("isPitt: " + isPitt);

        isPitt = person2.equals(person1.toUpperCase());
        System.out.println("isPitt:" + isPitt);



        isPitt = person2.toLowerCase().equalsIgnoreCase(person1.toUpperCase());
        System.out.println("isPitt: " + isPitt);







    }
}
