package lists;

import java.util.HashMap;

public class devlopers {
    public static void main(String[] args) {

        HashMap<String, String> devlopers1 = new HashMap<>();
        devlopers1.put("Игорь", "Java");
        devlopers1.put("Даниил", "Php");
        devlopers1.put("Денис", "Php");
        devlopers1.put("Алексей", "JavaScript");
        devlopers1.put("Мария", "Python");
        devlopers1.put("Екатерина", "Java");
        devlopers1.put("Сергей", "C#");
        devlopers1.put("Андрей", "Java");
        devlopers1.put("Ольга", "Ruby");
        devlopers1.put("Владимир", "Go");
        devlopers1.put("Наталья", "Python");
        devlopers1.put("Тимур", "JavaScript");
        devlopers1.put("Светлана", "C++");
        devlopers1.put("Роман", "Java");
        devlopers1.put("Кирилл", "Php");
        devlopers1.put("Анна", "JavaScript");
        devlopers1.put("Михаил", "Python");
        devlopers1.put("Алиса", "Java");
        devlopers1.put("Виктор", "C#");
        devlopers1.put("Юлия", "Go");


        HashMap<String, Integer> devlopers2 = new HashMap<>();
        for (String num1 : devlopers1.values()) {
            if (devlopers2.containsKey(num1)) {
                devlopers2.put(num1, devlopers2.get(num1) + 1);
            } else {
                devlopers2.put(num1, 1);
            }
        }
        for (String num2 : devlopers2.keySet()) {
            System.out.println(num2 + ": "+devlopers2.get(num2));
        }




//        int sum = 0;
//        HashMap<String, Integer> devlopers2 = new HashMap<>();
//        for (String num : devlopers1.values()) {
//            if (devlopers1.containsKey(num)) {
//                devlopers1.put(num, devlopers1.get(num) + 1);
//            } else {
//                devlopers1.put(num, devlopers1.get(num));
//                for (String sum1 : devlopers1.keySet()) {
//                }
//                System.out.println(devlopers2.get(num));
//            }
//        }
//    }
    }
}


//        Ожидаемый результат:
//        C#: 2
//        Java: 5
//        C++: 1
//        JavaScript: 3
//        Go: 2
//        Php: 3



//        Ruby: 1
//        Python: 3

