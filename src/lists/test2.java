package lists;

import java.util.ArrayList;
import java.util.HashMap;

public class test2 {


    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Bob", 87);
        students.put("Jack", 92);
        students.put("Amy", 89);
        students.put("Dylan", 90);


        HashMap<String, Integer> products = new HashMap<>();
        products.put("Juice", 1290);
        products.put("Coffee", 1890);
        products.put("Water", 380);
        products.put("Coco cola", 1700);

        HashMap<String, Integer> result = getFillteredProducts(products, 500, 2000);
        System.out.println(result);

        ArrayList<String> list = getProductNames(products);
        System.out.println(list);


        int sum2 = getSum(products);
        System.out.println(sum2);

        int sum = getSum(students);
        System.out.println(sum);

        average(students);
        average(products);


    }

    static ArrayList<String> getProductNames(HashMap<String, Integer> map) {
        ArrayList<String> list = new ArrayList<>();
        for (String num : map.keySet()) {
            list.add(num);
        }
        return list;
    }


    static HashMap<String, Integer> getFillteredProducts(HashMap<String, Integer> map, int min, int max) {
        HashMap<String, Integer> sum3 = new HashMap<>();
        for (String sum : map.keySet()) {
            if (map.get(sum) > 1500) {
                sum3.put(sum, map.get(sum));
            }
            if (map.get(sum) >= min || map.get(sum)<= max) {
                sum3.put(sum, map.get(sum));
            }
        }
        return sum3;
    }


    static void average(HashMap<String, Integer> map) {
        double sum1 = 0;
        for (Integer sum : map.values()) {
            sum1 = sum1 + sum;
        }
        System.out.println(sum1 / map.size());
    }

    static int getSum(HashMap<String, Integer> map) {
        int sum1 = 0;
        for (Integer sum : map.values()) {
            sum1 = sum1 + sum;
        }
        return sum1;
    }
}


//    HashMap<String, Integer> box1 = new HashMap<>();
//    box1.put("товар 1", 250);
//    box1.put("товар 2", 100);
//    box1.put("товар 3", 5);
//
//
//    HashMap<String, Integer> box2 = new HashMap<>();
//    box2.put("товар 2", 6);
//    box2.put("товар 3", 70);
//    box2.put("товар 4", 90);
//    box2.put("товар 5", 1500);
//
//
//    HashMap<String, Integer> box3 = new HashMap<>();
//    for (String sum : box1.keySet()) {
//        System.out.println(sum);
//
//    }
//}


// товар 1=250
// товар 2=106
// товар 3=75
// товар 4=90
// товар 5=1500

//        HashMap<String, Double> orders = new HashMap<>();
//        orders.put("Иван И.", 4345.5);
//        orders.put("Ольга С.", 76564.43);
//        orders.put("Александр Т.", 1234.86);
//        orders.put("Александр Р.", 23432.87);
//        orders.put("Екатерина О.", 1034753.6);
//        orders.put("Ярослав В.", 450.0);
//
//
//        double  sum1 = 0;
//        for (double sum : orders.values()) {
//            sum1 += sum;
//        }
//        System.out.println("Сумма всех пользователей:" +  sum1);
//    }
//}

//        HashMap<String, String> friends = new HashMap<>();
//        friends.put("Айгерим", "Тараз");
//        friends.put("Бекжан", "Алматы");
//        friends.put("Нуржан", "Астана");
//        friends.put("Даулет", "Актобе");
//
//
//        for (String key : friends.keySet()) {
//            System.out.println(key + " живет в городе " + friends.get(key));
//        }
//
//
//    }
//}
//        Scanner scanner = new Scanner(System.in);
//        HashMap<String, Double> currencies = new HashMap<>();
//        currencies.put("USD", 517.14);
//        currencies.put("EUR", 605.83);
//        currencies.put("RUB", 6.43);
//
//        System.out.println("Введите сумму в тг:");
//        int sum = scanner.nextInt();
//
//        System.out.println("Введите валюту");
//        String currency = scanner.next();
//
//        if (currencies.containsKey(currency)) {
//            System.out.println(sum + " тг " + " в " + currency + " составляет " + sum / currencies.get(currency));
//        } else  {
//            System.out.println("Валюта не найдена");
//        }
//    }
//}


