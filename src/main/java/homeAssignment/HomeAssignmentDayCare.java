package homeAssignment;

public class HomeAssignmentDayCare {
    public static void main(String[] args) {

        Daycare daycare1 = new Daycare();
        Daycare daycare2 = new Daycare();

        daycare1.name = "Children's land";
        daycare1.price = 1250;
        daycare1.startAge = 1;
        daycare1.endHours = 5;
        daycare1.isGlutenFree = false;
        daycare1.hasDiscount = true;
        daycare1.hasWeekends = true;
        daycare1.hasLunch = true;

        daycare2.name = "Kindercare";
        daycare2.price = 1500;
        daycare2.startAge = 2;
        daycare2.endHours = 3;
        daycare2.isGlutenFree = true;
        daycare2.hasDiscount = true;
        daycare2.hasWeekends = false;
        daycare2.hasLunch = false;


        if (daycare1.price > daycare2.price){
            System.out.println("I am intersted in " + daycare1.name);
        }else if (daycare1.price < daycare2.price){
            System.out.println("I am interested in " + daycare2.name);
        }

        if (daycare1.rating > daycare2.rating){
            System.out.println("The high rating of daycare is " + daycare1.name);
        } else if (daycare2.rating > daycare1.rating) {
            System.out.println("The high rating of daycare is " + daycare2.name);


            if (daycare1.hasLunch && daycare1.isGlutenFree) {
                System.out.println(daycare1.name + " is better!");
            } else{
                System.out.println(daycare2.name + " i will chose this daycare");

            }


        }


    }


}


class Daycare {


    String name;
    double price;
    int startAge;
    int endHours;
    int rating = 0;
    boolean isGlutenFree;
    boolean hasDiscount;
    boolean hasWeekends;
    boolean hasLunch;

    public void hasGlutenFree (boolean hasLunch) {
        if (hasLunch) {
            System.out.println(name + " are good daycare!");
            rating++;


        } else {
            System.out.println(name + " are with healthy food daycare!");
            rating += 2;


        }


    }




}




