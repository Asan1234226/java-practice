import java.lang.reflect.Array;
import java.nio.file.attribute.UserDefinedFileAttributeView;


import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class MenuTask {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ключ1", "значение1");
        map.put("ключ2", "значение2");
        map.put("ключ3", "значение3");

        HashMap<String, String> reversedMap = new HashMap<>();
        for (String num : map.keySet()) {
            reversedMap.put(map.get(num),num);
        }
        System.out.println(reversedMap);
    }
}










//        int[] nums = {8, 5, 3, 9, 12, 5};
//        int max = nums[0];
//        int min = nums[0];
//
//
//        for (int i = 0; i < nums.length; i++) {
//
//            if (nums[i] > max) {
//                max = nums[i];
//
//            }
//
//            if (nums[i] < min) {
//                min = nums[i];
//
//
//            }
//        }
//
//        System.out.println("Самая большая число в массиве : " + max);
//        System.out.println("Самая маленькая число в массиве : " +  min);
//        System.out.println("Разница мeжду наибольшим  и  наименьшим числом  : " + (max - min));
//        }
//    }




// Scanner input = new Scanner(System.in);

//        String[] drinks = {"Американо", "Капучино", "Латте", "Фрапучино"};
//
//
//        while (true) {
//
//
//            for (int i = 0; i < drinks.length; i++) {
//                System.out.println(i + 1 + " " + drinks[i]);
//            }
//            System.out.println("0 Выйти");
//            int menu = input.nextInt();
//            if (menu == 0) {
//                System.out.println(" Вы вышли из меню");
//                break;
//            }
//            if (menu >= 1 && menu <= drinks.length) {
//                System.out.println(drinks[menu - 1] + " готовится ... ожидайте");
//                } else {
//                System.out.println("Некоректный номер напитка");
//            }
//        }
//    }
//}


//        int[] radiohead = {1993, 1995, 1997, 2000, 2001, 2003, 2007, 2011, 2016};
//        int[] kendrickLamar = {2011, 2012, 2015, 2016, 2017, 2022, 2024};
//        int[] bjork = {1977, 1990, 1993, 1995, 1997, 2001, 2004, 2007, 2011, 2015, 2017, 2022};
//
//        int radio = 0;
//        int kendrick = 0;
//        int bjock = 0;
//
//
//        for (int i = 0; i < radiohead.length; i++) {
//
//
/// /
//            if (radiohead[i] > 2000) {
//                radio++;
//
//
//
//            }
//        }
//
//        for (int i = 0; i < kendrickLamar.length; i++) {
//            if (kendrickLamar[i] > 2000) {
//                kendrick++;
//
//            }
//        }
//
//        for (int i = 0; i < bjork.length; i++) {
//            if (bjork[i] > 2000) {
//                bjock++;
//            }
//        }
//
//
//        System.out.println("Количество альбомов");
//        System.out.println("Radiohead: " + radiohead.length);
//        System.out.println("KendrickLamar: " + kendrickLamar.length);
//        System.out.println("bjork: " + bjork.length);
//
//
//        System.out.println("Количество альбомов выпущеных в 21-веке");
//        System.out.println("Radiohead: " + radio);
//        System.out.println("KendrickLamar: " + kendrick);
//        System.out.println("bjork: " + bjock);
//        System.out.println("Сумма всех альбомов выпущенных в 21 веке : " +(radio + kendrick + bjock));
//
//
//    }
//}


//        String[] words = {"дом", "кот", "дом", "собака", "кот", "дерево", "дом", "собака", "кот", "дерево", "дом", "машина", "кот", "дерево", "дом" , "машина" , "машина" , "машина" , "машина" , "машина" , "машина"};
//
//        int cat = 0;
//        int house = 0;
//        int dog = 0;
//        int tree = 0;
//        int car = 0;
//
//        for (int i = 0; i < words.length; i++) {
//
//
//            if (words[i].equals("дом")) {
//                house++;
//            } else if (words[i].equals("кот")) {
//                cat++;
//            } else if (words[i].equals("собака")) {
//                dog++;
//            } else if (words[i].equals("дерево")) {
//                tree++;
//            } else if (words[i].equals("машина")) {
//                car++;
//            }
//        }
//        System.out.println("дом : " + house + " раз");
//        System.out.println("кот  : " + cat + " раз");
//        System.out.println("собака  : " + dog + " раз");
//        System.out.println("дерево : " + tree + " раз");
//        System.out.println("машина : "  + car  + " раз");
//
//        if (house> cat && house > dog && house > tree && house > car){
//            System.out.println("самое частое слово : дом  раз " + house);
//        } else if (cat > house && cat > dog && cat > tree && cat > car) {
//            System.out.println("самое частое слово : кот  раз " + cat);
//        } else if (dog > house && dog > cat && dog > tree &&  dog > car) {
//            System.out.println("самое частое слово : собака  раз " + dog);
//        } else if (tree > house && tree > cat && tree > dog && tree >car) {
//            System.out.println("самое частое слово : дерево  раз " + tree);
//        } else if (car > house && car > cat && car > dog &&  car > tree) {
//            System.out.println("самое частое слово : машина  раз " + car);
//
//        }
//
//    }
//}


//        String[] transports = {"Автомобиль", "Самолет", "Корабль", "Автобус", "Мотоцикл", "Лодка", "Поезд", "Вертолет", "Подводная лодка", "Дельтаплан", "Автомобиль", "Самолет", "Корабль", "Автобус", "Автомобиль", "Поезд", "Лодка"};
//
//        int ground = 0; //Домашнее задание 3
//        int air = 0;
//        int water = 0;
//
//        for (int i = 0; i < transports.length; i++) {
//
//
//
//            if (transports[i].equals("Автомобиль") || transports[i].equals("Автобус") || transports[i].equals("Мотоцикл") || transports[i].equals("Поезд")) {
//                ground++;
//            } else if (transports[i].equals("Самолет") || transports[i].equals("Вертолет") || transports[i].equals("Дельтаплан")) {
//                air++;
//            } else if (transports[i].equals("Корабль") || transports[i].equals("Лодка") || transports[i].equals("Подводная лодка")) {
//                water++;
//
//
//            }
//        }
//        System.out.println("Наземный транспорт : " + ground);
//        System.out.println("Воздушный транспорт : " + air);
//        System.out.println("Водный транспорт : " + water);
//    }
//}


//        String[] countries = {"Канада", "Россия", "Канада", "Казахстан", "Бразилия", "Япония", "Япония", "Казахстан", "Франция", "Германия", "Франция", "Казахстан", "Китай", "Канада", "Казахстан", "Япония", "Германия", "Япония", "Бразилия", "Канада", "Россия", "Канада", "Россия", "США", "Канада", "США", "Россия", "Япония", "Бразилия", "США", "Бразилия", "Россия", "Италия", "Канада", "Япония", "Бразилия", "Казахстан", "Япония", "Россия", "Италия", "Бразилия", "Германия", "Китай", "Бразилия", "Германия", "Италия", "Италия", "Италия", "Канада", "Франция"};
//
//
//        int country1 = 0;   // Домащнее задание 1
//        int country2 = 0;
//        int country3 = 0;
//        int country4 = 0;
//        int country5 = 0;
//        int country6 = 0;
//        int country7 = 0;
//        int country8 = 0;
//        int country9 = 0;
//        int country10 = 0;
//
//
//
//
//        for (int i = 0; i < countries.length; i++) {
//
//
//            if ( countries[i].equals("Россия")) {
//            country1++;
//            } else if (countries[i].equals("Италия")) {
//                country2++;
//            } else if (countries[i].equals("Франция")) {
//                country3++;
//            } else if (countries[i].equals("Канада")) {
//                country4++;
//            } else if (countries[i].equals("Казахстан")) {
//                country5++;
//            } else if (countries[i].equals("США")) {
//                country6++;
//            } else if (countries[i].equals("Китай")) {
//                country7++;
//            } else if (countries[i].equals("Япония")) {
//                country8++;
//            } else if (countries[i].equals("Бразилия")) {
//                country9++;
//            } else if (countries[i].equals("Германия")) {
//                 country10++;
//            }
//        }
//        System.out.println("Россия : " + country1);
//        System.out.println("Италия : " + country2);
//        System.out.println("Франция  : " +  country3);
//        System.out.println("Канада: " +  country4);
//        System.out.println("Казахстан : " + country5);
//        System.out.println("США : "  + country6 );
//        System.out.println("Китай : "  +  country7);
//        System.out.println("Япония : " + country8 );
//        System.out.println("Бразилия : " + country9 );
//        System.out.println("Германия : " + country10 );
//    }
//}


//        String[] countries = {"Казахстан", "Россия", "Китай", "США", "Германия", "Франция", "Япония", "Италия", "Канада", "Бразилия"};
//
//        int europe = 0;       // домашнее задание 2
//        int america = 0;
//        int asia = 0;
//
//
//        for (int i = 0; i < countries.length; i++) {
//
//            if (countries[i].equals("Россия") || countries[i].equals("Германия") || countries[i].equals("Франция") || countries[i].equals("Италия")) {
//                europe++;
//            } else if (countries[i].equals("Казахстан") || countries[i].equals("Китай") || countries[i].equals("Япония")) {
//                asia++;
//            } else if (countries[i].equals("США") || countries[i].equals("Канада") || countries[i].equals("Бразилия")) {
//                america++;
//
//            }
//        }
//        System.out.println("Европа : " + europe);
//        System.out.println("Азия : " + asia);
//        System.out.println("Америка  : " + america);
//    }
//}


//        for (int i = 0; i < countries.length; i++) {
//
//
//            if (countries[i].equals("Россия")) {
//                country++;
//            } else if (countries[i].equals("Италия")) {
//                country1++;
//            } else if (countries[i].equals("Франция")) {
//                country2++;
//            } else if (countries[i].equals("Канада")) {
//                country3++;
//            } else if (countries[i].equals("Казахстан")) {
//                country4++;
//            } else if (countries[i].equals("США")) {
//                country5++;
//            } else if (countries[i].equals("Китай")) {
//                country6++;
//            } else if (countries[i].equals("Япония")) {
//                country7++;
//            } else if (countries[i].equals("Бразилия")) {
//                country8++;
//            } else if (countries[i].equals("Германия")) {
//                country9++;
//            }
//        }
//        System.out.println("Россия : " + country);
//        System.out.println("Италия : " + country1);
//        System.out.println("Франция : " + country2);
//        System.out.println("Канада : " + country3);
//        System.out.println("Казахстан : " + country4);
//        System.out.println("США : " + country5);
//        System.out.println("Китай : " + country6);
//        System.out.println("Япония :" + country7);
//        System.out.println("Бразилия : " + country8);
//        System.out.println("Германия : " + country9);
//    }
//}

// прошлые задание ------------------------------------------------------------------
// TODO: посчитать сколько раз встречается каждая страна

//        int[] scores = {10, 10, 8, 9, 7, 8, 9, 9, 10, 7, 6, 5, 8, 9, 10, 10, 6, 5, 6, 9, 6, 9, 10, 5, 9, 8, 7, 9, 5, 10, 10, 10, 7, 5, 6, 8, 6, 8, 5, 8, 8, 10, 8, 7, 7, 5, 8, 10, 10, 10};
//
//        int num = 0;
//        int num1 = 0;
//        int num2 = 0;
//        int num3 = 0;
//        int num4 = 0;
//        int num5 = 0;
//        int num6 = 0;
//        int num7 = 0;
//
//
//        int num10 = 0;
//
//        for (int i = 0; i < scores.length; i++) {
//
//
//            if (scores[i] == 10) {
//                num++;
//            }
//            if (scores[i] > num7) {
//                num7 = scores[i];
//
//
//            } else if (scores[i] == 9) {
//                num1++;
//            } else if (scores[i] == 8) {
//                num2++;
//            } else if (scores[i] == 7) {
//                num3++;
//            } else if (scores[i] == 6) {
//                num4++;
//            } else if (scores[i] == 5) {
//                num5++;
//
//            }
//
//
//            num10 += scores[i];
//
//            num6 = num6 + scores[i];


//        }
//        System.out.println(" 10: " + num);
//        System.out.println(" 9 : " + num1);
//        System.out.println(" 8 : " + num2);
//        System.out.println(" 7 : " + num3);
//        System.out.println(" 6 : " + num4);
//        System.out.println(" 5 : " + num5);
//        System.out.println(" Средние  оценка : " + num10);
//        System.out.println(" Количество оценок выше или равно 8  :  " + (num2 + num1 + num));
//        System.out.println(" Минимальный  количество оценок  : " + num5);
//        System.out.println(" Все оценки  : " + num6);
//        System.out.println(" Первая оценка  : " + scores[0]);
//        System.out.println(" Последния оценка  : " + scores[scores.length - 1]);
//    }
//}


//                if (expences[i] < min ) {
//                    min = expences[i];


//        double[] expences = {1200, 5000, 2300, 3423, 12312, 5656, 2222};
//        double min = expences[0];
//        double total = 0;
//        double max = 0;
//        double middle = 0;
//
//
//
//
//        for (int i = 0; i < expences.length; i++) {
//            if (expences[i] > max) {
//                max = expences[i];
//
//                if (expences[i] < min ) {
//                    min = expences[i];
//                }
//            }
//
//            middle = middle + expences[i];
//
//            total = total + expences[i];
//        }
//
//
//        System.out.println("Самая большая трата: " + max + " тг ");
//
//        System.out.println("За эту неделю  потратили: " + total + " тг ");
//
//        System.out.println("Средние трата в день: " + middle / expences.length + " тг ");
//
//        System.out.println("Минимальная трата : " + min + " тг ");
//
//
//    }
//}


//      int[] nums  = {7, -3, 9, -11, 18, 99, 2, 11 };   //6
//
//        int positiev = 0;
//        int negative  = 0;
//
//       for (int i = 0; i < nums.length; i++) {
//
//           if (nums[i] <  0 ) {
//               negative++;
//           } else if (nums[i] > 0) {
//               positiev++;
//
//           }
//       }
//        System.out.println("Отрацительные числа : "  + negative);
//        System.out.println("Положительный числа  : "  + positiev);
//    }
//}

// positive

//        int[] nums  = {7, -3, 9, -11, 18, 99, 2, 11,};   //2
//
//        for (int i = 0; i < 4; i++) {
//        System.out.println(nums[i]);
//        }
//    }
//}


// System.out.println("Положительные числа : " );


//        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11,};    // 7
//
//        double max = 0;
//        double min = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > max) {
//                max = nums[i];
//            }
//                if (nums[i] < min) {
//                    min = nums[i];
//
//
//                }
//
//                }
//        System.out.println("Самая большая трата: " + max + " тг ");
//
//        System.out.println("Минимальная трата : " + min + " тг ");
//
//    }
//        }
//


//        int[] nums  = {7, -3, 9, -11, 18, 99, 2, 11,};    // 5
//
//        for (int i = 5; i < 8; i++) {
//            System.out.println(nums[i]);
//
//
//
//        }
//    }
//}


//        int[] nums  = {7, -3, 9, -11, 18, 99, 2, 11,};    //2
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println(nums[i]);
//        }
//    }
//}


//        int[] nums  = {7, -3, 9, -11, 18, 99, 2, 11,};
//
//        for (int i = 0; i < 3; i++) {
//        System.out.println(nums[i]);
//        }
//    }
//}


//        String[]  cities =   {"Астана" , "Алматы" , " Шымкент"};


//        double[] expensive = {1500.50, 2500.50, 500.00, 0.0, 4750.60, 2500.20, 1200.00};
//
//        System.out.println("Введите день (0-6)");
//        int day = input.nextInt();
//
//        if (day > 6) {
//            System.out.println("Некоректный день");
//        } else if (day < 0) {
//            System.out.println("Некоректный день");
//        } else {
//
//            System.out.println("Вы выбрали  день " + day + " текущее значение: " + expensive[day]);
//            System.out.println("Что вы хотите сделать? 1 - изменить,  2 - прибавить ");
//            int command = input.nextInt(); // 1
//
//            if (command == 1) {  // 2
//                System.out.println("Введите новую трату ");
//                int money = input.nextInt(); // 3
//                expensive[day] = money;
//            } else if (command == 2) {
//                System.out.println("Введите новую трату ");
//                int money = input.nextInt(); // 3
//                expensive[day] = expensive[day + money];
//            } else {
//                System.out.println("Некоректная  команда");
//
//            }
//        }
//        System.out.println(Arrays.toString(expensive));
//    }
//}


// int day = input.nextInt();
//int num2 = input.nextInt();
//        System.out.println("Сколько   городов  хотите ввести ? ");
//        int cities = input.nextInt();
//
//
//
//
//        String[] num = new String[cities];
//
//
//
//
//        for (int i = 0; i < cities; i++) {
//            System.out.println("Введите название городa:");
//            String dg = input.next();
//
//
//
//
//
//        }
//        System.out.println(Arrays.toString(num));
//
//
//
//        }
//    }


//     double[] expences = new double[arrays];
//
//
//        double sum = 0;
//        double max = 0;
//        double min = 0;


//        for (int i = 0; i < arrays; i = i + 1) {
//            System.out.println("Введите название  города ");
//            String num = input.next();
//        }
//    }
//}
//
//
//            if (num > max) {
//                max = num;
//            }
//
//            if (min == 0 || num < min) {
//                min = num;
//            }
//
//            sum = sum + num;
//            expences[i] = num;
//
//
//
//        System.out.println(Arrays.toString(expences));
//        System.out.println("Количество  элементов :  " + arrays);
//        System.out.println(" Сумма чисел : " + sum);
//        System.out.println("  Максимальное значение : " + max);
//        System.out.println("    Минимальная  значение  : " + min);
//        System.out.println("    Средние значение   : " + sum / expences.length);
//


//
//        int[] nums = new  int [6];
//        for (int i  = 0; i < nums .length; i ++) {
//            nums[i] = (i + 1 )  + 1500;
//
//        }
//
//        System.out.println(Arrays.toString(nums));
//    }
//}


// double[] expences = {1200, 5000, 2300, 3423, 12312, 5656, 2222};
//        double min = expences[0];
//        double total = 0;
//        double max = 0;
//        double middle = 0;
//
//
//
//
//


//        System.out.println("Введите кол - во  фильмов: ");
//        int count = input.nextInt();
//
//        int sum = 0;
//        for (int i = 1; i <= count; i = i + 1) {
//            System.out.println("Введите продалжительность  фильма  в минутах: ");
//            int num = input.nextInt();
//            sum = sum + num;
//
//
//        }
//        System.out.println("Общая  продалжительность  всех фильмов  в часах: " + sum /60)  ;
//
//    }
//}

//


//        int[] nums = new  int [6];
//        for (int i  = 0; i < nums .length; i ++) {
//            nums[i] = (i + 1 ) * 1500;
//        }
//
//        System.out.println(Arrays.toString(nums));
//    }
//}


//        double[] expences = {1200, 5000, 2300, 3423, 12312, 5656, 2222};
//        double min = expences[0];
//        double total = 0;
//        double max = 0;
//        double middle = 0;
//
//
//
//
//        for (int i = 0; i < expences.length; i++) {
//            if (expences[i] > max) {
//                max = expences[i];
//
//                if (expences[i] < min ) {
//                    min = expences[i];
//                }
//            }
//
//            middle = middle + expences[i];
//
//            total = total + expences[i];
//        }
//
//
//        System.out.println("Самая большая трата: " + max + " тг ");
//
//        System.out.println("За эту неделю  потратили: " + total + " тг ");
//
//        System.out.println("Средние трата в день: " + middle / expences.length + " тг ");
//
//        System.out.println("Минимальная трата : " + min + " тг ");
//
//
//    }
//}
//

//        while (true) {
//            String[] drinkCoffe = {"Американо ", "Капучино", "Латте ", "Эспрессо"};
//
//            for (int i = 0; i < drinkCoffe.length; i++) {
//                System.out.println(i + 1 + " " + drinkCoffe[i]);
//            }
//            System.out.println("0 Выйти");
//            int menu = input.nextInt();
//            if (menu == 0) {
//                System.out.println(" Вы вышли из меню");
//                break;
//            }
//
//            if (menu >= 1 && menu <= drinkCoffe.length) {
//                System.out.println(drinkCoffe[menu - 1] + " готовится ... ожидайте");
//            } else {
//                System.out.println("Некоректный номер напитка");
//            }
//        }
//    }
//}


//        int[] expences = {7000, 3500, 42400, 23000, 4000, 2000, 14000};
//        double total = 0;
//
//        for (int i = 0; i < expences.length; i++) {
//            total = expences[i] + total;
//
//        }
//        System.out.println("Общая сумма  расходов : " + total  + " тг ");
//        System.out.println("Средние ежедневные расходы: " + total/ expences.length + " тг " );
//
//    }
//}

//        String[] cities = {"Астана", "Алмата " , "Караганда "  , "Актобе"  ,  "Актау"};
//
//        for (int i = 0  ; i < 5; i++) {
//            System.out.println(  i+1  + " " + cities[i]);
//
//        }
//    }
//}

//        double rateUSD = 540;
//        double rateEUR = 630;
//        double rateRUB = 7;
//
//
//        System.out.println("Введите ваш текущий баланс ");
//        int balance = input.nextInt();
//
//        while (true) {
//
//            System.out.println("В какую  валюту хотите конвертировать  тенге ? Доступные  варианты: USD,  EUR, RUB. Если  хотите завершить, напишите   exit");
//            String  currency =  input.next();
//            if ( currency.equals("exit")) {
//                System.out.println("Программа завершена ");
//                break;
//            }
//            if (currency.equals("USD")) {
//                System.out.println("Ваши сбережения в долларах : " + balance / rateUSD);
//            } else if (currency.equals("EUR")) {
//                System.out.println("Ваши сбережения в евро : " +  balance / rateEUR);
//            } else if (currency.equals("RUB")) {
//                System.out.println("Ваши сбережения в рублях : " +  balance / rateRUB);
//            } else   {
//                System.out.println( " Валюта не подерживается ");
//            }
//        }
//    }
//}


//        int balance = 0;
//        while (true) {
//            System.out.println(" 1. Пополнить  счёт");
//            System.out.println(" 2. Снять деньги ");
//            System.out.println(" 3. Проверить баланс ");
//            System.out.println(" 0. Выход");
//            int atm = input.nextInt();
//
//
//            if (atm == 0) {
//                System.out.println("Программа завершена ");
//                break;
//            } else if (atm == 1) {
//                System.out.print("Введите сумму для пополнения :  ");
//                int sum = input.nextInt();
//                if (sum <= 0) {
//                    System.out.println("Сумма должна быть  положительной ");
//                } else {
//                    balance = balance + sum;
//                    System.out.println("Счёт пополнен на " + sum + " тенге");
//                }
//            } else if (atm == 2) {
//                System.out.print(" Введите сумму для снятие: ");
//                int sum = input.nextInt();
//                if (balance < sum) {
//                    System.out.println("Недостатачно средств на счёте ");
//                } else if (sum <= 0) {
//                    System.out.println("Сумма должна быть положительной");
//                } else {
//                    balance = balance - sum;
//                    System.out.println("Снято " + sum + " тенге");
//                }
//            } else if (atm == 3) {
//                System.out.println("Текущий баланс " + balance);
//            }
//        }
//    }
//}
//        while (true) {
//            Scanner input = new Scanner(Scanner.in);
//        System.out.println("1. USD  > KZT");
//        System.out.println("2 KZT >USD");
//        System.out.println("0  Выход");
//        int text  = i
//
//
//
//
//
//        }
//    }
//}


//        while (true);
//        Scanner input = new Scanner(System.in);
//        System.out.println("1 Добавить");
//        System.out.println("2 Обновить");
//        System.out.println("3 Удалить");
//        System.out.println("4 Завершить");
//        int test = input.nextInt();
//    }
//}

//        double rateUSD = 540;
//        Scanner input = new Scanner(System.in);
//
//        while (true) {
//            System.out.println(" 1 KZT > USD");
//            System.out.println(" 2 USD > KZT");
//            System.out.println(" 3  Выход ");
//            System.out.println("Выберите операцию:");
//            int command = input.nextInt();
//
//            if (command == 3) {
//                System.out.println("Программа завершена ");
//                break;
//            } else if (command == 1) {
//                System.out.println("Введите сумму в KZT: ");
//                int money = input.nextInt();
//                System.out.println(money + " KZT  =  " + (money / rateUSD) + " USD ");
//            } else if (command == 2) {
//                System.out.println("Введите сумму в USD:");
//                int currency = input.nextInt();
//                System.out.println(currency + " USD  = " + (currency * rateUSD) + " KZT ");
//
//            }
//        }
//    }
//}
//

//        while (true) {
//            System.out.println("  1 Сложение");
//            System.out.println(" 2 Вычетание");
//            System.out.println(" 3 Выйти");
//            int command = input.nextInt();
//
//            System.out.println("Первое число : ");
//            int num1 = input.nextInt();
//            System.out.println("Второе число: ");
//            int num2 = input.nextInt();
//
//            if (command==1){
//                System.out.println("Результат " +(num1+num2));
//            } else if (command==2) {
//                System.out.println("Результат " + (num1-num2));
//            } else if (command==3) {
//                break;
//
//            }
//
//        }
//    }
//}
//        if (num ==1){
//            break;
//    }
//} System.out.println("Первое число ");
//        System.out.println("Второе число");
//
//}
//}


//        for(int  i =0; i <=7;  i++) {
//            if (i <1) {
//            System.out.println("У вас пока нет  лайков");
//        } else if (i ==1) {
//                System.out.println("Пост понравился 1 человеку ");
//            } else if (i  <=4) {
//                System.out.println("Пост понравился " + i + " людям");
//            }else if (i <= 7) {
//                System.out.println("Пост понравился " +  i + " пользователям");
//            }
//        }
//    }
//}


//        for (int i = 5; i >= 1; i--) {
//            if (i == 5)
//                System.out.println("Осталось  5 дней");
//            else if (i >= 2) {
//                System.out.println("Осталось " + i + " дня");
//            } else if (i == 1) {
//                System.out.println(" Остался " + i + " день");
//
//            }
//        }
//         System.out.println("Сегодня день мероприятия !");
//
//    }
//}


//         int num =input.nextInt();
//        for ( int  i = 1;  i <=100 ; i++) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//                int day = input.nextInt();
//                num=num+day;
//            }  else {
//
//            }
//            } System.out.println("Сумма всех чисел  от 1  до 100 кратные 3 : "  + num );
//    }
//}


//        for (int i = 1; i <= 20; i++) {
//            if (i % 3 == 0   &&  i   %  5==0 ) {
//                System.out.println("Hello  World");
//            } else if (i % 5 == 0) {
//                System.out.println("World");
//
//            } else if (i % 3 ==0 ) {
//                System.out.println("Hello");
//
//            } else {
//
//                System.out.println(i);


//        for (int i = 3; i <= 10; i++) {
//            if (i % 5 == 0 || i % 3 == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//}


//            for (int  i =3; i <= 10;  i++) {
//            if (i / 3==0) {
//
//             } else if (i / 5==0) {
//
//           }
//
//       if (i % 3==0) {
//            System.out.println(i + " ");
//
//       } else  if (i % 5==0){
//            System.out.println(i + " ");
//        }
//    }
//}
//}


//        for (int i =1; i  <= 10; i++){
//


//
//        for ( int  i  = 0 ; i <= 10; i++ ) {
//            if (i < 1) {
//                System.out.println(" У вас  нет  новых собщений");
//            } else if (i  ==  1) {
//                System.out.println(" У вас 1 новое собщение ");
//
//            } else if ( i  <= 4 ) {
//                System.out.println(" У вас " + i + " новых собщения");
//
//            } else if ( i  <= 10) {
//                System.out.println(" У вас " + i + " новых собщений");


//        for (int i = 1; i <= 10; i++){
//            if (i <5){
//                System.out.println("Текущее число " + i + " - меньше 5");
//            } else if (i > 5) {
//                System.out.println("Текущее число " + i + " - больше 5");
//            } else  {
//                System.out.println("Текущее число " + i + " -  ровно 5");


//        System.out.println("Введите кол - во  фильмов: ");
//        int count = input.nextInt();
//
//        int sum = 0;
//        for (int i = 1; i <= count; i = i + 1) {
//            System.out.println("Введите продалжительность  фильма  в минутах: ");
//            int num = input.nextInt();
//            sum = sum + num;
//
//
//        }
//        System.out.println("Общая  продалжительность  всех фильмов  в часах: " + sum /60)  ;
//
//    }
//}


//        System.out.println("Сколько  чисел  обработать ?");
//        int  square =input.nextInt();
//
//        for (int i = 1; i <= square; i=i +1) {
//            System.out.println("Введите " + i + " число ");
//            int  num =input.nextInt();
//            System.out.println("Квадрат числа " + num + " = " + num*num);
//
//
//
//}


//        System.out.println(" ");
//        int number =input.nextInt();
//        int sum =0;
//        for (int i =1; i <= number; i = i + 1 ) {
//            System.out.println("Введите  число: ");
//            int  num = input.nextInt();
//            sum = sum+num;
//        }
//
//
//        System.out.println("Сумма чисел " + sum);


//        int  balance = 10000;
//        int feedPrice =500;
//        int feedInterval =1;
//        int days =0;
//        for (int  i =balance -feedPrice;  i  >= 0; i =i  -feedPrice){
//            days = days +feedInterval;
//            System.out.println("После " + days + "  часов работы останется " + i + " мАч. " );
//        }
//
//        System.out.println("Батареи хватит  на  " + days + "  часов роботы");


//        System.out.println("Введите сумму которую будете экономить ");
//        int num1 =input.nextInt();
//
//
//       System.out.println("Сколько дней  будете откладывать ? ");
//        int num1 =input.nextInt();
//
//        System.out.println("Какую сумму  планируете  откладывать  в день ?");
//        int num2 =input.nextInt();
//
//        int balance =0;
//        for (int i =1; i <= num1; i++){
//            balance =balance + num2;
//            System.out.println("День " + i + " - " + balance + "тг");
//        }


//        int balance = 0;
//        int day =input.nextInt();
//        for (int i = 1; i <= day; i++) {
//            balance = balance + 3000;
//            System.out.println("День " + i + " - " + balance + " тг ");
//
//
//        }    System.out.println("За " + day+ " дней  было собрано "+ balance + "тг");
//
//    }


//        int start =70;
//        while (start  >= 7){
//            System.out.println("До старта  SpaceY  осталось "  + start);
//            start-=7;

//            for(int start =70; start>=0;  start-=7){
//                System.out.println("До старта Spacey осталось "+ start );
//            }
//
//


//        System.out.println("Ввод:");
//        int temperature = input.nextInt();
//
//
//        if (temperature <= -20) {
//            System.out.println("Вывод :Очень холодно");
//
//        } else if (temperature > -20 && temperature <= 0) {
//            System.out.println("Вывод: Холодно");
//        } else if (temperature > 1  &&  temperature<=15) {
//            System.out.println("Прохладно");
//
//        } else if (temperature>16  && temperature<=25) {
//            System.out.println("Тепло");
//
//        } else if (temperature>26  && temperature<=35) {
//            System.out.println("Жарко");
//
