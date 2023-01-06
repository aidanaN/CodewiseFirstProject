package ifElseLogicalOperators;

public class OrOperator {

    //===========|| OR |

    // it will check until we get result
    // true || true --->true
    // true || false --->true
    // false || true --> true
    // false || false --> false

    // | - keeps checking all conditions even if true

    public static void main(String[] args) {


        int a = 10;
        int b = 50;
        int c = 20;
        int d = 90;

        if (a > b || b ==  c ){
            System.out.println("if condition");
        }else if (c == d || d > b || a < b){
            System.out.println(" else if condition ");
        }
        else {
            System.out.println("this is else");
        }

        boolean b1 = 10 > 5 || 5 < 3;
        System.out.println(b1);

        b1 = 5 > 0 || 5 < 10;
        System.out.println(b1);

        b1 = 5 == 5 && 5 > 4;
        System.out.println(b1);

        b1 = 5 > 1 && 1 > 0 || 0 > 2 && 2 < 3;
        System.out.println(b1);

        b1 = true;
        boolean b2 = false;
        // true


    }

}
