package classesAndObjects;

public class MethodWelcome {

    String name = "Aidana";

    public void welcome (){
        System.out.println( name + ", welcome to our platform");


    }

}

class MethodUse {

    public static void main(String[] args) {

        MethodWelcome w = new MethodWelcome();

        w.welcome ();


    }
}
