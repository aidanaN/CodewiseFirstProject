package multidimentionalArrays;

public class PracticePrinting {
    public static void main(String[] args) {

        String[][] strArr = new String[][]{{"plov", "blinchiki", "shashlyk"}, {"tea", "cola", "water"}};

        for (int i = 0; i < strArr.length; i++) { //outer loop will loop through
            for (int k = 0; k < strArr[i].length; k++) {
                System.out.println(strArr[i][k]);
            }


        }
        //==================================================

        String[] foods = {"sushi", "ramen", "tom-yam"};
        String[] drinks = {"green tea", "black tea", "soda", "mountain dew", "water"};

        String[][] menu = new String[][]{foods, drinks};


        int j;
        for (j = 0; j < menu.length; j++) {
        for (int k = 0; k < menu[j].length; k++) {
            System.out.println(menu[j][k]);


        }
            System.out.println();
        }


    String [] birds = {"mockingbird", "sparrow", "parrot", "eagle"};
    String [] insects = {"grasshopper","spider","ladybug" };
    String [] mammals = {"cow" ,"bear", "whale", "elephant" , "dog", "human"};


    String [][] animals = new String [][]{birds, insects, mammals};
        System.out.println("animals length " + animals.length);

 //   String [][][] animals2 = {{birds}, {insects}, {mammals}};
//        System.out.println("animals2 length " + animals2.length);

        for (int i = 0; i < animals.length; i++){
            for (int k = 0; k < animals[i].length; k++){
                System.out.println(animals [i][k] + " ");
            }
            System.out.println();
        }




}

}
