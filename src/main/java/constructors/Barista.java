package constructors;

public class Barista {

    String name;
    String position;
    char gender;
    double salary;
    boolean isExperienced;
    boolean areHandsClean;
    boolean isHappy;
    static double jarOfTips = 2.50;


    public Barista(String name, String position, double salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
        System.out.println("Hired a new " + position + ". Name is " + name + ". The salary will be " + salary+"$ per hour");



    }
    public Barista (String name, boolean isExperienced){
        this.name = name;
        this.isExperienced = isExperienced;
        System.out.println("Hire new barista " + name + ". Expierenced: " + isExperienced);
    }

    public void talkToClient (String clientName){
        System.out.println(name + " is talking to client: " + clientName);



    }
    public void steamMilk(String typeOfMilk){
        System.out.println(name + " is steaming " + typeOfMilk + " milk");



    }
    public void takeOrder (String orderName, String clientsName){
        System.out.println(position + " " + name + " is taking order of " + orderName + " from client: " + clientsName);
    }
    public void washHands (boolean cleanHands){
        if (cleanHands){
            System.out.println(name + "The hands are clean. not washing again");
            areHandsClean = true;
        } else {
            System.out.println(name + " is washing the hands.");
            areHandsClean = true;
        }

    }
    public boolean getTips ( double tipsAmount){
        if ( tipsAmount > 0) {
            System.out.println( position + " " + name + " is getting tips in amount of: " + tipsAmount + "$" );
            isHappy = true;
            jarOfTips+=tipsAmount;
            return true;

        } else {
            System.out.println( "no tips for " + position + " " + name + "at this time" );
            isHappy = false;
            return false;

        }



    }









}
