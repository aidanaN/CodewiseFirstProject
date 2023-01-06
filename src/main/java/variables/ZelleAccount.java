package variables;

public class ZelleAccount {

    String fullName;
    String phoneNumber;
    double balance;
    String address;
    String bankName;
    double amount;

    static long totalUsers;
    static double totalMoney;

    public ZelleAccount (String fullName, String phoneNumber, String bankName){
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.bankName = bankName;
        totalUsers++;
    }


   public void depositMoney (double amount){
       System.out.println("\nMoney deposited successfully");
       this.balance += amount;
       totalMoney+= amount;

   }
   public void transferMoney (double amount, String phoneNumber ){
        if (this.balance >= amount){
            System.out.println("Amount" + amount + "is successfully transferred to " + phoneNumber);
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds. Transfer invalid");
        }
   }
   public void info (){
       System.out.println("\nAccount details");
       System.out.println("Name: " + this.fullName);
       System.out.println("Balance: " + this.balance);
       System.out.println("Bank: " + this.bankName);
       System.out.println("Phone number: " + phoneNumber);
   }

   public static void customerService (){
       System.out.println("Call 888-777-2323 for customer service");
   }
   public static void zelleInfo (){
       System.out.println("\nUsers: " + ZelleAccount.totalUsers);
       System.out.println("Money: " + ZelleAccount.totalMoney);

   }

}
