package practice;

public class Practice {
    public static void main(String[] args) {

        String street = "6060 Delaney dr";
        System.out.println(street.indexOf('r'));
        System.out.println(street.charAt(5));

        boolean starts = street.startsWith("6060");
        System.out.println(starts);

        String empty= "";
        boolean check = empty.isEmpty();
        System.out.println(check);

        int start = street.indexOf("Delaney");
        String newString = street.substring(start,start + 4);
        System.out.println(newString);
        
        String a;
        String b;
        

















    }

}
