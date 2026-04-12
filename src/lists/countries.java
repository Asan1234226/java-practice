package lists;

import java.util.ArrayList;
import java.util.HashMap;

public class countries {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> country = new HashMap<>();

        ArrayList<String> country1 = new ArrayList<>();
        country1.add("Алматы");
        country1.add("Астана");
        country1.add("Шымкент");
        country1.add("Костанай");
        country.put("Казахстан", country1);


        ArrayList<String> country2 = new ArrayList<>();
//        country2.add("Токио");
        country2.add("Йокогаму");
        country2.add("Осаку");
        country2.add("Нагою");
        country.put("Япония", country2);

        ArrayList<String> country3 = new ArrayList<>();
        country3.add("Москва");
        country3.add("Краснодар");
        country3.add("Челябинск");
        country3.add("Казань");
        country.put("Россия", country3);

        country.get("Казахстан").add("Актобе");
        country.get("Казахстан").add("Туркестан");


        country.get("Россия").remove("Челябинск");


        System.out.println(country.get("Япония").size());

        System.out.println(country);

        for (String key : country.get("Казахстан")) {
            System.out.println("Казахстан" + " - " + key);
        }



        if (!country.get("Япония").contains("Токио")) {
            System.out.println("Токио не был добавлен");
        } else {
            System.out.println("Токио  был добавлен");


            }
        }
    }

//        for (String key : country.keySet()) {
//            System.out.println(key);
//            ArrayList<String> list = country.get(key);
//            for (String value : list) {
//                System.out.println("- " + value);

//  country.get("Овощи").add(""Редиска)


