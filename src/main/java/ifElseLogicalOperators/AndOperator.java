package ifElseLogicalOperators;

public class AndOperator {

    public static void main(String[] args) {
        int money = 25;
        String cake1 = "honeycake";
        int costOfTheCake1 = 20;
        boolean isGlutenFree1 = true;

        String cake2 = "cheesecake";
        int costOfTheCake2 = 25;
        boolean isGlutenFree2 = false;

        /* I want to buy a gluten free cake and i only have 25$
        and i can buy non gluten free cake only if it is less then 20$;
         */

        // if at least one false it will give you false
        // true && true == true
        // true && false == false
        // false && false = false
        // false && true = false

       if (isGlutenFree1 && costOfTheCake1 <= money){
            System.out.println("I will buy the:  " + cake1);
       }
       else if (!isGlutenFree2 && costOfTheCake2 < 15) {
           System.out.println("I will buy the non gluten free " + cake2);

       }

       /*
       && - AND - for all conditions
       true && true && true

       & - AND - it will only check
        */




    }

}
