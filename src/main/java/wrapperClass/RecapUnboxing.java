package wrapperClass;

public class RecapUnboxing {
    public static void main(String[] args) {

        /*unboxing - convert object to primitive

         */


        Integer a = 10;
        int b= a;

        Integer c = Integer.valueOf("123");
        b=c; //unboxing

        Byte b1 = Byte.valueOf((byte)544);
        byte b2=b1;

        Short s1 = Short.valueOf((short)122);
        short s2 = s1;

        Long l1 = Long.valueOf(545425);
        long l2 = l1;

        Double d1 = Double.valueOf(552.22);
        double d2 = d1;

        Character c1 = Character.valueOf('5');
        char c2 = c1;

        Float fl1 = Float.valueOf(25.25f);
        float fl2 = fl1;

        // Casting when we want to convert on data type t another
        //-Implicit Casting
        //-Explicit Casting




    }
}
