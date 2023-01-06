package constructors;

public class ZaraShop {

    String style;
    String customer;
    String seller;
    String type;
    String collections;
    String paymentType;
    char size;
    char gender;
    double price;
    boolean isOnSale;
    boolean isSatisfied;
    boolean isReturnable;
    boolean talkToClient;
    boolean takePayment;
    boolean packClothes;

    public ZaraShop (String style, char size){
        this.style = style;
        this.size = size;


    }
    public ZaraShop (String type, String collections){
        this.type = type;
        this.collections = collections;

    }
    public ZaraShop (double price){
        this.price =  price;

    }
    public ZaraShop (char gender){
        this.gender = gender;

    }
    public ZaraShop (boolean isOnSale){


    }
    public void talkToClient (String customer){
        System.out.println( seller + " is asking " + customer + " about size.");

    }




     public static void main(String[] args){
        ZaraShop seller1 = new ZaraShop("Casual", 's');
        ZaraShop seller2 = new ZaraShop("mens", "summer collection 2022");
        ZaraShop seller3 = new ZaraShop(80.50);
        seller1.seller = "Seller";

        seller1.talkToClient("old women");





     }
        }
