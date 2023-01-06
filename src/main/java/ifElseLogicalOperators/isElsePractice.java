package ifElseLogicalOperators;

public class isElsePractice {
    public static void main(String[] args) {

        int x = 100;
        int y = 20;

        if (x > y){
            System.out.println("x is equal to y");
        }else if (true){
            System.out.println("this is my else if code");

        }

        System.out.println(x+y);

        //========================

        String weather = "sunny";
        float tempInFahr = 90.5f;

        if(weather.equals("sunny")){
            System.out.println("Let's go to the beach!");

        } if (tempInFahr > 104) {
            System.out.println("Stay home! Too hot outside!");

        }if (tempInFahr > 90){
            System.out.println("Let's go walking");

        }


    }
}
