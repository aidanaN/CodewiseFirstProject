package multidimentionalArrays;

public class ForEachPractice {
    public static void main(String[] args) {

        String [] planets = {"Earth", " Mars", "Venera", "Uranus"};
        String[] continents = {"North Anerica", "South America","Asia","Europe","Africa"};
        String [] countries = {"Switzerland", "Namibia","Germany","Japan","Angola"};
        String [] cities = {"Zurich","Winhook","Berlin","Luanda",""};
        // create 4 d array of string, using for each loop


        long [] population = {25000000, 5000000, 88000000,130000000,4000000};
        long [] numbers = {11111, 222, 3333, 444, 555555, 6666};
        //

        int [] num1 = {1,2,3,4,5};
        int [] num2 = {10,20,30,40,50};
        int [] num3 = {100,200,300,400,500};
        int [] num4 = {1000,2000,3000,4000,5000};
        int [] num5 = {10000,20000,30000,40000,50000};

        int [][][][][] fiveDimIntArr = {{{{num1, num2}, {num3 , num4}}}};

        for (int [][][][] fourDimIntArr : fiveDimIntArr){
            for (int [][][] threeDimIntArr: fourDimIntArr){
                for (int [][] twoDimIntArr: threeDimIntArr){
                    for (int [] oneDimIntArr: twoDimIntArr){
                        for (int a: oneDimIntArr){
                            System.out.println(a + " ");
                        }
                    }
                }
            }
        }




    }
}
