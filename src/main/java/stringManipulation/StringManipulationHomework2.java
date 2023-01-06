package stringManipulation;

public class StringManipulationHomework2 {
    public static void main(String[] args) {

        String hello1 = "Hello World!";
        String hello2 = "Hello world!";
        String hello3 = new String("HelloWorld!");

        //=====1=====

        boolean isSame;
        isSame= hello1.equals(hello2);
        System.out.println(isSame);

        //=====2=====

        isSame = hello1.equals(hello3);
        System.out.println(isSame);

        //======3======

        boolean isSame2;
        isSame2 = hello1 == hello2;
        System.out.println("Hello World! == Hello world!: " + isSame2);

        //=======4====

        System.out.println(hello1.equalsIgnoreCase(hello2));

        //=======5======

       hello1 = hello1.toLowerCase();
       hello2 = hello2.toLowerCase();
       boolean isSame4 = hello1 == hello2;
       System.out.println(isSame4);



















    }
}
