package multidimentionalArrays;

public class PracticePrintingTwo {
    public static void main(String[] args) {
        String [] numbers = {"12", "45", "56", "234"};
        String [] words = {"sun", "earth" , "jupiter", "moon"};

        String [][] twoDimenArr = {numbers, words};

        for (int i = 0; i < twoDimenArr.length; i++){
            for (int b = 0; b <twoDimenArr[i].length; b++){
                System.out.println(twoDimenArr[i][b]);
            }
            System.out.println( );
        }
        for (int i = 1; i < twoDimenArr.length; i++){
            for (int b = 0; b <twoDimenArr[i].length; b++){
                System.out.println(twoDimenArr[i][b]);
            }
            System.out.println();
    }
        for (int i = 0; i < twoDimenArr[0].length; i++){

                System.out.println(twoDimenArr[0][i]+" ");
            }
            System.out.println();


    String [] toDoList = {"grocery shopping", "clean house", "study", "play with kids", "go out with friends"};

    /*
    for each loop works with collection


     */
    for (String task : toDoList){
        System.out.println("inside for each loop " + task);
    }

    double [] numbers1 = {121.5,454.2,457.6,47.1,57.4};

    for (double task : numbers1){
        System.out.println("inside for each loop doubles are: " + task);
    }










    }





}
