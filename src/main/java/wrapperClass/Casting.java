package wrapperClass;

public class Casting {
    public static void main(String[] args) {
        byte a = 20;
        // implicit casting is done by Java compiler
        // and it converts ona data type to another
        int b = a;
        short c = a;
        long d = a;
        float e = a;
        double f = a;

        //explaining casting is used to convert one data type to another manually by putting parentheses
        //in front of the given data type
        //convert higher data to lower data


        int intNum = 30;
        byte byteNum = (byte)intNum;

        short shortNum = (byte)intNum;
        short shortNum2 = (short)intNum;
        short shortNum3 = byteNum;

        // explicit casting: put l, L in the end of lonf, F in the end of float;
        long longNum = 1234;
        intNum = (int) longNum; // explicit
        byteNum = (byte)longNum; //explicit becouse we put parentheses

        double doubleNum = longNum;
        doubleNum = intNum;
        doubleNum = 14512.25f; //implicit casting putting float inside double;

        shortNum = (short) 32769;
        System.out.println(shortNum);

        float floatNum8 = (float)doubleNum;
        floatNum8 = (float)4542.65f; //explicit casting
        floatNum8 = 2302.2f;











    }
}
