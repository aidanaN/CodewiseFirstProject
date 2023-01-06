package practice;

public class BofaAccount {

    String fullName;
    String phoneNumber;
    String address;
    double accountBalance;
    boolean isPersonal;
    String email;

    static int totalUser;
    static double totalMoney;

    public BofaAccount (String fullName, String phoneNumber, String email){
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        totalUser++;

    }
    public void addMoney(double money){
        this.accountBalance += money;
        totalMoney += money;
        System.out.println("Now in your account: " + this.accountBalance);


    }
    public void sentMoney(double money, String phoneNumber){
        if (this.accountBalance >= money && money <= 1000){
            System.out.println("It was successfully transferred");
            this.accountBalance -= money;
            totalMoney-=money;
        } else if (this.accountBalance >= money && money > 1000){
            System.out.println("Transfer limit is exceeded ");
        } else {
            System.out.println("Your transfer failed");
        }
    }
    public void displayInfo (){
        System.out.println("Name: " + this.fullName);
        System.out.println("Phone number: " + this.phoneNumber);
        System.out.println("Account balance: " + this.accountBalance);
        System.out.println("Account email: " + this.email);

    }

    public static void bankInfo(){
        System.out.println("Users: "+ totalUser);
        System.out.println("Total amount deposited to bank: " + totalMoney);
    }










}
