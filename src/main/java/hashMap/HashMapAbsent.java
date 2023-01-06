package hashMap;

import java.util.HashMap;

public class HashMapAbsent {
    public static void main(String[] args) {

        HashMap<String, String> catOwners = new HashMap<>();
        catOwners.put("Tom", "Mira");
        catOwners.put("Garfield", "Aisuluu");
        catOwners.put("Akzholtoi", "Saikal");
        catOwners.put("Myimyi", "Myrzakhan");

        System.out.println("The size: " + catOwners.size());
        System.out.println("Cat Owners: " + catOwners);


        catOwners.put("Arti", "Alina");

        System.out.println("The size: " + catOwners.size());
        System.out.println("Cat Owners: " + catOwners);

        catOwners.put("Ginger", "Alina");
        System.out.println("The size: " + catOwners.size());
        System.out.println("Cat Owners: " + catOwners);

        catOwners.put("Arti", "Myrzakhan");
        System.out.println("The size: " + catOwners.size());
        System.out.println("Cat Owners: " + catOwners);

        int i = 1;
        for (String cat: catOwners.keySet()){
            System.out.println("Cat #" + i + " " + cat);
            i++;
        }

        int j = 1;
        for (String cat : catOwners.keySet()){
            System.out.println("Cat # " + j + " , "+ cat + " Owner # " + j +" "+ catOwners.get(cat));
            j++;
        }

        for (String catOwnerName: catOwners.values()){
            System.out.println("cat owner name: " + catOwnerName);
        }

        catOwners.clone();



    }



}
