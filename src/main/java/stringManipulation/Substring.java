package stringManipulation;

public class Substring {
    public static void main(String[] args) {

        String classes = "Java and soft skills classes";
        System.out.println(classes.substring(0,4));
        //Substring takes to integer and returns a string from index 1, up to index 2
        // beginning index = inclusive
        //end index = exclusive


        String sentence = "Johny Depp us the best actor in the world";
        String name = "Johny Depp";


        String laptop = "Macbook Pro 2023 is really cool.";
        laptop = laptop.substring(12);
        System.out.println(laptop);

        String mobilePhone = "Iphone 14 Pro Max the most expensive";
        mobilePhone = mobilePhone.substring(1);
        System.out.println(mobilePhone);

        System.out.println(mobilePhone.substring(1));

    }
}
