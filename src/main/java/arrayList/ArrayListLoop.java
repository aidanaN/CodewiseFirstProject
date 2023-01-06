package arrayList;

import java.util.ArrayList;

public class ArrayListLoop {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("bananas");
        fruits.add("apples");
        fruits.add("pears");
        fruits.add("mango");
        fruits.add("oranges");
        fruits.add("mandarins");
        fruits.add("dragon fruit");
        fruits.add("grapes");
        fruits.add("persimmon");
        fruits.add("pomegranate");

        int i = 1;

        for (String fruit : fruits) {

            System.out.println(i + " fruit - " + fruit);
            i++;
        }
        System.out.println();

        ArrayList <String> vegetables = new ArrayList<>();
        vegetables.add("tomato");
        vegetables.add("potato");
        vegetables.add("pickles");
        vegetables.add("eggplant");
        vegetables.add("pepper");
        vegetables.add("broccoli");
        vegetables.add("celery");
        vegetables.add("cabbage");
        vegetables.add("carrot");
        vegetables.add("zucchini");

        int a = 0;
        do {
            System.out.println(a + 1 + " vegetables - " + vegetables.get(a));
            a++;
        }
        while (a<vegetables.size());

        System.out.println();

        ArrayList <String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("Los Angeles");
        cities.add("Las Vegas");
        cities.add("New York");
        cities.add("Washington");
        cities.add("New Jersey");
        cities.add("Houston");
        cities.add("Orlando");
        cities.add("Miami");
        cities.add("Boston");

        int b = 0;
        while (b<cities.size()){
            System.out.println(b + 1 + " cities: " + cities.get(b));
            b++;
        }
        System.out.println();

        ArrayList <String> foods = new ArrayList<>();
        foods.add("manty");
        foods.add("oromo");
        foods.add("lagman");
        foods.add("pizza");
        foods.add("burger");
        foods.add("beshbarmak");
        foods.add("hot-dog");
        foods.add("taco");
        foods.add("pelmeni");
        foods.add("vareniki");

        int size= foods.size();

        for (int c = 0; c < foods.size(); c++){
            System.out.println(c + 1+ " food: " + foods.get(c));
        }







    }
}
