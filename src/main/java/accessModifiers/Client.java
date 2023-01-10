package accessModifiers;

public class Client {

    public String name = "John Doe";
    public String dob = "23111989";
    String address = "123 Abc street";

    private int ssn = 123456789;
    private double balance = 4500;

    protected boolean isMarried = true;
    double totalIncome = 1500000.0;
    protected static boolean isHappy = true;

    public static void payMoney (){
        System.out.println(isHappy);
    }

    protected static void giveGift (){


    }



}
