package groceryStore;

public class Shopping {

    public static void main(String[] args) {

        Buyer buyer = new Buyer();
        buyer.fullName = "Aidana";
        buyer.age = 23;
        buyer.phoneNumber = "1234156";
        buyer.isResident = true;

        buyer.display();
        buyer.updateResidency(true);
        buyer.display();

        buyer.search();

        Buyer fruit1 = new Buyer();

        fruit1.addToCart ( " apple");

        Buyer updateProfile = new Buyer();
        buyer.updateProfile("John",  26, Boolean.parseBoolean("true"), "6066 Hassell rd");






    }

}
