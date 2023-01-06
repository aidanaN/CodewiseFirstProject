package wrapperClass;

import constructors.Software;

public class PracticeCasting {
    public static void main(String[] args) {
        String StringNumber = "19932";
        Integer intNumber2 = Integer.valueOf(StringNumber);

        int a = intNumber2;

        //Convert stringNumber to primitive double

        Double dd = Double.valueOf(StringNumber);
        double dd2 = dd;

        Short sh = Short.valueOf(StringNumber);
        short sh2 = sh;
        long ll = Long.valueOf(StringNumber);

        //valueOf() returns objects
        //parseInt() returns primitives

        long aa = Integer.parseInt("-123"); //==> int primitive = 123
        long  b = Integer.valueOf("-123").shortValue(); //==> Object Integer = 123


        System.out.println(aa);
        System.out.println(b);

        String int1 = "123";
        Integer int2 = Integer.valueOf(int1);
        Double d1  = Double.valueOf(int1);
        Short s1 = Short.valueOf(int1);
        Byte b1 = Byte.valueOf(int1);

        Integer intObj = Integer.valueOf("200");
        String intObj1 = String.valueOf(intObj);
        Double dou = Double.valueOf(intObj);

        // convert to primitive
        Integer  obj7 = Integer.valueOf("200");
        int obj8 = obj7;
        int obj10 = Integer.valueOf(obj7);
        int obj9 = Integer.parseInt("200");

        Double project1 = Double.valueOf(1225.25);
        double double1 = project1;
        Double double2 = Double.parseDouble("454245.2223");
        double double3 = double2;

        Boolean boo = Boolean.valueOf(true);
        boolean boo2 =boo;
        Boolean boo3 = Boolean.valueOf("FalSe");
        boolean boolean2 = boo2;







    }
}
