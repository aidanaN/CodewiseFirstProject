package variables;

public class ZelleApp {
    public static void main(String[] args) {
        ZelleAccount user1 = new ZelleAccount("James Cameron", "456-123-45-87", "Chase");

        user1.depositMoney(2000);
        user1.info();
        user1.transferMoney(200, "546465465646");
        user1.info();



        ZelleAccount user2 = new ZelleAccount("Kate", "54545454554", "BofA");
        user2.depositMoney(5000);
        user2.info();
        user1.depositMoney(4500);

        ZelleAccount.customerService();
        ZelleAccount.zelleInfo();







    }
}
