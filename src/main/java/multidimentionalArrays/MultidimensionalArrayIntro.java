package multidimentionalArrays;

import java.util.Arrays;

public class MultidimensionalArrayIntro {
    public static void main(String[] args) {


        int [] oneDimArr = new int [5];
        int [][] a = new int [5][3];

        int [] oneDimArr2 = new int [] {1,2,3};
        int [][] twoDimArr2 = new int [][] {  { 5,2 },{ 17,8 }  };

        int [] oneDimArr3 = new int [3];
        oneDimArr3[0] = 1;
        oneDimArr3[1] = 3;
        oneDimArr3[2] = 5;

        int [][] twoDimArr3 = new int [2][3];
        twoDimArr3 [0][0]=2;
        twoDimArr3 [0][1] =5;

        twoDimArr3 [1][0] = 5;
        twoDimArr3 [1][1]=7;
        twoDimArr3 [1][2]=6;


        String [] strOneDim = new String[3];
        strOneDim [0]= "hello";
        strOneDim [1] = "you understand?";
        strOneDim [2] = "easy";

        String [][] strTwoDim = new String[][]{{"abc","def","xyz"},{"qwe","rty"}};

        String [] [] strTwoDim2 = new String [3][4];
        strTwoDim2 [0][0]= "hello";
        strTwoDim2 [0][1]= "bye";
        strTwoDim2 [0][2] = "welcome";

        strTwoDim2 [1][0] = "go";
        strTwoDim2 [1] [1] = "walk";
        strTwoDim2 [1][2] = "run";
        strTwoDim2 [1][3] = "sleep";

        //////==========================================================


        double [][] doubleArr1 = new double[][]{{112.234, 457.457, 222.444}, {111.22,444.578}};

        double [][] doubleArr2 = new double[2][3];
        doubleArr2 [0][0] = 5454.112;
        doubleArr2 [0][1] = 22.47;


        doubleArr2 [1] [0] = 88.55;
        doubleArr2 [1] [1] = 456.25;
        doubleArr2 [1] [2] = 98.111;


        System.out.println(Arrays.toString(doubleArr2));



        boolean boolArr [][] = {{true,true,true}, {false}};
        short shortArr [][] = new short[1][2];
        shortArr [0][0] = 10;
        shortArr [0][1]=1;







    }
}
