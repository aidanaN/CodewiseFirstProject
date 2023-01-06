package homeAssignment;

import java.util.ArrayList;

public class isEmptyArray {
    public static void main(String[] args) {

        //=======1=========

        ArrayList <String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("white");
        colors.add("pink");
        colors.add("brown");

        boolean isArrayEmpty = colors.isEmpty();
        System.out.println(isArrayEmpty);

        colors.clear();
        System.out.println(colors.size());

        System.out.println(isArrayEmpty);

        //=======2==========

        String [] shops = new String[]{"Zara", "H&M", "TopShop", "Mango", "Aritzia"};

        boolean isListEmpty = shops.length == 0;
        shops = new String[0];
        boolean isList1Empty = shops.length == 0;

        System.out.println(isList1Empty);
        System.out.println(isList1Empty);

        }

    }

