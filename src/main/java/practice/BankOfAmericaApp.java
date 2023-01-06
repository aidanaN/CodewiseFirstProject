package practice;

public class BankOfAmericaApp {
    public static void main(String[] args) {

        BofaAccount user1 = new BofaAccount("Aidana Nugumetova", "312-520-3505", "nugumetova3001@gmail.com");
        user1.addMoney(5000);
        user1.displayInfo();
        user1.sentMoney(200,"4561234415");
        user1.displayInfo();
        user1.sentMoney(1200, "5635656566");
        user1.displayInfo();
        user1.sentMoney(5000, "51615615");

        BofaAccount user2 = new BofaAccount("James Camaren", "4856165165", "James@gmail.com");
        user2.displayInfo();
        user2.addMoney(1000);
        user2.displayInfo();
        BofaAccount.bankInfo();










    }
}
