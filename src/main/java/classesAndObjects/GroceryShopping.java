package classesAndObjects;

public class GroceryShopping {

    public static void main(String[] args) {

        Seller marianos = new Seller();
        System.out.println(marianos.storeName);
        System.out.println(marianos.phoneNumber);
        System.out.println(marianos.isHalal);
        System.out.println(marianos.numberOfEmployee);

        marianos.storeName = "\n\n\tMariano's";
        marianos.isHalal = true;
        marianos.numberOfEmployee = 34;
        marianos.phoneNumber = "45687856";
        System.out.println(marianos.storeName);
        System.out.println(marianos.phoneNumber);
        System.out.println(marianos.isHalal);
        System.out.println(marianos.numberOfEmployee);

        Seller freshFarms = new Seller();
        System.out.println(freshFarms.storeName);
        System.out.println(freshFarms.phoneNumber);
        System.out.println(freshFarms.isHalal);
        System.out.println(freshFarms.numberOfEmployee);

        freshFarms.storeName = "Fresh Farms";
        freshFarms.isHalal = false;
        freshFarms.numberOfEmployee = 50;
        freshFarms.phoneNumber = "123456789";
        System.out.println(freshFarms.storeName);
        System.out.println(freshFarms.phoneNumber);
        System.out.println(freshFarms.isHalal);
        System.out.println(freshFarms.numberOfEmployee);



        Seller iceMountain = new Seller();


        iceMountain.bottleName = "Ice Mountain";
        iceMountain.isBottleRecycling = true;
        iceMountain.bottlePrice = 1 ;
        iceMountain.bottleSize = 17;
        System.out.println(iceMountain.bottleName);
        System.out.println(iceMountain.isBottleRecycling);
        System.out.println(iceMountain.bottlePrice);
        System.out.println(iceMountain.bottleSize);





    }
}
