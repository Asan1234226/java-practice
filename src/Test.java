//        классы_и_объекты.Product1[] goods = new классы_и_объекты.Product1[5];
//
//        классы_и_объекты.Product1 iphone14 = new классы_и_объекты.Product1();
//        iphone14.name = "Айфон";
//        iphone14.price = 650000;
//        goods[0] = iphone14;
//
//
//        классы_и_объекты.Product1 redmi = new классы_и_объекты.Product1();
//        redmi.name = "Редми";
//        redmi.price = 120000;
//        goods[1] = redmi;
//
//
//        классы_и_объекты.Product1 laptop = new классы_и_объекты.Product1();
//        laptop.name = "Ноутбук";
//        laptop.price = 250000;
//        goods[2] = laptop;
//
//
//
//
//
//        double num = 0;
//        double sum = 0;
//        double max = 0;
//        double min = goods[0].price;
//        String mm = "";
//        String mn = "";
//        for (int i = 0; i < goods.length; i++) {
//            if (goods[i] != null) {
//                num++;
//                System.out.println("Товар: " + goods[i].name + " Цена: " + goods[i].price);
//                sum = sum + goods[i].price;
//                if (goods[i].price > max) {
//                    max = goods[i].price;
//                    mm = goods[i].name;
//
//
//                }
//                if (goods[i].price < min) {
//                    min = goods[i].price;
//                    mn = goods[i].name;
//                }
//            }
//        }
//        System.out.println("Самый  дорогой товар : " + max + " " + mm);
//        System.out.println("Самый  дешевый товар : " + min + " " + mn);
//        System.out.println("Сумма всех товаров " + sum);
//        System.out.println("Средния сумма: " + (sum / num));
//
//
//    }
//}

//        Bus bus = new Bus();
//        bus.number = 70; // номер Автобуса
//        bus.sellTicket("Иван", 1);
//        bus.sellTicket("Анна", 12);
//        bus.sellTicket("Мария", 3);
//        bus.sellTicket("Пётр", 1);
//        bus.sellTicket("Ольга", 25);
//        bus.showSeating();
//
//
//
//    }
//}
// у автобуса будет 20 мест
//            Bus bus = new Bus();
//            bus.number = 70; // номер автобуса
//
//            bus.sellTicket("Иван", 1);   // Билет продан: Иван - место 1
//            bus.sellTicket("Анна", 12);  // Билет продан: Анна - место 12
//            bus.sellTicket("Мария", 3);  // Билет н:     Мария - место 3
//            bus.sellTicket("Пётр", 1);   // Место 1 уже занято!
//            bus.sellTicket("Ольга", 25); // Место должно быть от 1 до 20!
//
//            bus.showSeating();
// Автобус 70 | Продано: 3 из 20
// 1: Иван
// 2: [свободно]
// 3: Мария
// 4: [свободно]
// 5: [свободно]
// 6: [свободно]
// 7: [свободно]
// 8: [свободно]
// 9: [свободно]
// 10: [свободно]
// 11: [свободно]
// 12: Анна
// 13: [свободно]
// 14: [свободно]
// 15: [свободно]
// 16: [свободно]
// 17: [свободно]
// 18: [свободно]
// 19: [свободно]
// 20: [свободно]

//            System.out.println("Свободно мест: " + bus.getFreeSeats());
// Свободно мест: 17

//        double[] arr = new double[50];
//        arr[0] = 67;
//        arr[1] = 89;
//        arr[2] = 90;
//        arr[3] = 55;
//
//        int ii = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                    ii++;
//                }
//            }
//        System.out.println(ii);
//    }
//}
//        Student1 alexey = new Student1();
//        alexey.name = "Алексей";
//        alexey.orders[1] = 89;
//        alexey.orders[0] = 67;
//       alexey.orders[2] = 45;
//        alexey.orders[3] = 77;
//        alexey.show();
//        System.out.println("Максмальное число " + alexey.getMaxScore());
//
//
//
//        Student1 igor = new Student1();
//        igor.name = "Игорь";
//        igor.orders[0] = 99;
//        igor.orders[1] = 97;
//        igor.orders[2] = 89;
//        igor.orders[3] = 96;
//        igor.orders[4] = 94;
//        igor.show();
//        System.out.println("Максмальное число " + igor.getMaxScore());
//
//    }
//}

//            Elevator lift = new Elevator();
//            lift.currentFloor = 1;
//            lift.totalFloors = 10;
//            lift.doorsOpen = "Открыты";
//
//            lift.status();
//            lift.closeDoors();
//            lift.goUp();
//            lift.goUp();
//            lift.openDoors();
//            lift.status();
//            lift.goUp();        // не поедет!
//            lift.closeDoors();
//            lift.goUp();
//            lift.status();
//            lift.closeDoors();
//            lift.goDown();
//            lift.goDown();
//            lift.goDown();
//            lift.openDoors();
//            lift.status();
//    }
//}
// Магический сундук
//            Treasurechest chest = new Treasurechest();
//            chest.owner = "Миша";
//
//            chest.show();
//            // Сундук пользователя Миша
//            // Монет: 0
//            // Состояние: закрыт
//
//            chest.open();      // Сундук открыт!
//            chest.addCoin(10); // Положил 10 монет! Теперь: 10
//            chest.shake();     // ДЗЫНЬ-ДЗЫНЬ! Монеты звенят!
//            chest.close();     // Сундук закрыт!
//            chest.addCoin(5);  // Сундук закрыть, нельзя положить монеты!
//
//            chest.show();
//            // Сундук пользователя Миша
//            // Монет: 10
//            // Состояние: закрыт
//
//            chest.open();      // Сундук открыт!
//            chest.addCoin(5);  // Положил 5 монет! Теперь: 15
//
//            chest.show();
//            // Сундук пользователя Миша
//            // Монет: 15
//            // Состояние: открыт
//
//            chest.close();     // Сундук закрыт!
//
//            chest.show();
// Сундук пользовател


//        BankAccount ansar = new  BankAccount();
//        ansar.owner = "Ансар";
//        ansar.deposit(500);
//        ansar.deposit(1500);
//       ansar.deposit(-500);
//       System.out.println(ansar.balance);
//
//        Product product = new Product();
//        product.name = "Кола";
//        product.price = 20 ;
//
//       ansar.buy(product);
//
//        Product second = new Product();
//        second.name = "Чай";
//        second.price = 50;
//
//        product.compareTo(second);
//        second.compareTo(product);
//
//        Product third = new Product();
//        third.name = "Апельсиновый напиток";
//        third.price = 50;
//
//        third.compareTo(second);
//
//
//        System.out.println(  "Баланс " + ansar.balance);
//    }
//}

//        BankAccount dima = new BankAccount();
//        dima.owner = "Дима";
//        dima.deposit(600);
//
//        dima.transfer(ansar, -1500);
//
//
//        System.out.println(ansar.balance);
//        System.out.println(dima.balance);
//    }
//}
//        Phone apple = new Phone();
//        apple.name = "Apple";
//        apple.model = "iPhone 14";
//        apple.battery = 45;
//        apple.showInfo();
//        apple.call();
//        apple.call();
//        apple.charge();
//        apple.call();
//
//
//
//    }
//}


//} else {
//             System.out.println("Недостатачно заряда для звонка!");

//
//ДОМАШКА 1 -----------------------------------------------
//        Student student = new Student();
//        student.name = "Дима";
//        student.group = 202;
//        student.grade = 5;
//        student.display();
//       student.study();
//        String res1 = student.getResult(student.grade);
//        System.out.println(res1);
//    }
//}
// ДОМАШКА 1 --------------------------------------


// ДОМАШКА 2 -----------------------------------------
//        Car car = new Car();
//        car.brand = "Mercedes";
//        car.model = "competition";
//        car.color = "Черный";
//        car.display();
//        car.start();
//        car.stop();
//
//        }
//    }
// ДОМАШКА 2 ------------------------------------------

//        Product iPhone15  = new Product();
//        iPhone15.name = "Айфон 15";
//        iPhone15.weight = 170;
//        iPhone15.price = 456_000;
//        iPhone15.category = "Смартфон";
//        iPhone15.display();
//
//
//        Product nike = new Product();
//        nike.name = "Кроссовки найк";
//        nike.weight = 350;
//        nike.price = 120_000;
//        nike.category = "Кроссовки";
//        nike.display();
//
//        Product adidas = new Product();
//        adidas.name = "Кроссовки Адидас";
//        adidas.weight = 400 ;
//        adidas.price = 80_000 ;
//        adidas.category = "Кроссовки";
//        adidas.display();
//    }
//}
//        int[] result1 = fizzArray(4);
//        System.out.println(Arrays.toString(result1));
//        int[] result2 = fizzArray(10);
//        System.out.println(Arrays.toString(result2));
//        int[] result3 = fizzArray(8);
//        System.out.println(Arrays.toString(result3));
//    }
//    public static  int[] fizzArray(int n) {
//        int[] result = new  int[n];
//        for (int i = 1; i < n; i++) {
//            result[i] = i;
//        }
//       return  result;
//    }
//}
// обьекты
//        int[] arg1 = {1, 2, 3};
//        System.out.println(no14(arg1));
//        int[] arg2 = {1, 2, 3, 4};
//        System.out.println(no14(arg2));
//        int[] arg3 = {2, 3, 4};
//        System.out.println(no14(arg3));
//    }

//    public static boolean no14(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1 && nums[i] == 4) {
//                return false;
//            } else if (nums[i] == 1) {
//                return true;
//            } else if (nums[i] == 4) {
//                return true;
//            } else {
//                return true;
//            }
//        }
//    }
//}
//       int[] arr = {1, 2, 3};
//        System.out.println(sameFirstLast(arr));
//        int[] arr2 = {1, 2, 3, 1};
//        System.out.println(sameFirstLast(arr2));
//        int[] arr3 = {1, 2, 1};
//        System.out.println(sameFirstLast(arr3));
//    }
//    public static boolean sameFirstLast(int[] nums) {
//        int last = nums[nums.length - 1];
//        int first = nums[0];
//
//
//        if (first == last ) {
//            return true;
//        } else {
//          return false;
//        }
//    }
//}
//    public static void main(String[] args) {
//        System.out.println(twoAsOne(5, 2, 7));
//        System.out.println(twoAsOne(15, 3, 6));
//        System.out.println(twoAsOne(20, 10, 9));
//        System.out.println(twoAsOne(7, 7, 14));
//    }
//
//    public static boolean twoAsOne(int a, int b, int c) {
//        if (a + b == c) {
//            return true;
//        } else if (c + a == b) {
//            return true;
//        } else if (c + b == a) {
//            return true;
//        } else {
//            return false;
//
//        }
//    }
//}
//    public static void main(String[] args) {
//        int[] nums = {50, 123, 45, 7, 67, 7, 1, 2, 45};
//        int max = getmax(nums);
//        System.out.println(max);
//        int sum = getSum(nums);
//        System.out.println(sum);
//        double avg = getAverage(nums);
//        System.out.println(avg);
//        int[] firstAndLast = getFirstAndLast(nums);
//        System.out.println(Arrays.toString(firstAndLast));
//
//
//
//
//
//
//
//    public static int getmax(int[] nums) {
//
//        int max = nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > max) {
//                max = nums[i];
//            }
//        }
//        return max;
//    }
//
//    public static int getSum(int[] nums) {
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//
//
//            sum = sum + nums[i];
//        }
//        return sum;
//    }
//
//    public static double getAverage(int[] nums) {
//        double avg = 0;
//
//
//        for (int i = 0; i < nums.length; i++) {
//
//
//            avg = avg + nums[i];
//
//
//        }
//        return avg / nums.length;
//    }


//    public static int[] getFirstAndLast(int[] nums) {
//
//        int[] result = (nums = );
//        return result;


//        int count = 5;
//        String district = "Нура";
//        String pizza = "Четыре сыра";
//        double deliveryPrice = calculatedDeliver(district);
//        double pizzaPrice = getPizzePrice(pizza) * count;
//        double total = pizzaPrice + deliveryPrice;
//        System.out.println("Стоимость пиццы  " + pizzaPrice);
//        System.out.println("Доствака : " + deliveryPrice);
//        System.out.println("Итог : " + total);
//    }
//    public static int getPizzePrice(String pizza) {
//
//        if (pizza.equals("Маргарита")) {
//            return 2100;
//        } else if (pizza.equals("Пепперони")) {
//            return 2400;
//        } else if (pizza.equals("Четыре сыра")) {
//            return 3200;
//        } else {
//         return 2700;
//        }
//    }
//    public static int calculatedDeliver(String district) {
//        if (district.equals("Алматинский")) {
//            return 1500;
//        } else if (district.equals("Есиль")) {
//            return 800;
//        } else if (district.equals("Сарыакинский")) {
//            return 1200;
//        } else if (district.equals("Нура")) {
//            return 1800;
//        } else {
//            return 3000;
//        }
//    }
//}


//        procressOrder("Астана", "Наушники", 189_990);
//        procressOrder("Алматы", "Ноутбуки", 829_990);
//    }
//     public  static  void  procressOrder(String city, String category, double productPrice)  {
//        double discountPrice = calculateDicount( category, productPrice);
//        double delivery = calculateDelivery(city);
//        double total = discountPrice + delivery;
//
//        System.out.println("Стоимость товара " + discountPrice);
//        System.out.println("Доставка  " + delivery);
//        System.out.println("Итого " + total);
//
//    }
//
//    public static double calculateDelivery(String city) {
//        if (city.equals("Астана")) {
//            return 800;
//        } else if (city.equals("Алматы")) {
//            return 1500;
//        } else {
//            return 2500;
//        }
//    }
//
//
//    public  static  double calculateDicount(String category, double price) {
//        if (category.equals("Ноутбуки")) {
//            return  price * 0.85;
//        } else if (category.equals("Наушники")) {
//            return  price * 0.8;
//        } else  {
//            return  price;
//        }
//    }
//}


// 2
//        String postIndex1 = getPostIndex("Астана");
//        System.out.println(postIndex1);
//        String postIndex2 = getPostIndex("Алматы");
//        System.out.println(postIndex2);
//        String postIndex3 = getPostIndex("Актобе");
//        System.out.println(postIndex3);
//        String postIndex4 = getPostIndex("chefw");
//        System.out.println(postIndex4);
//
//    }
//    public static  String getPostIndex(String post) {
//
//        if (post.equals("Астана")) {
//            return "0100000";
//        } else if (post.equals("Алматы")) {
//            return "0500000";
//        } else if (post.equals("Актобе")) {
//            return "0300000";
//        } else {
//            return "город не найден";
//        }
//    }
//}


//        int  result1 = calculateDiscount(100000, "Наушники");
//        int  result2 = calculateDiscount(650000, "Ноутбуки");
//        int  result3 = calculateDiscount(439990, "Смартфоны");
//
//
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//
//    }
//
//
//    public  static int   calculateDiscount(int discount, String result1) {
//        if (result1.equals("Наушники")) {
//            return discount - discount * 15 /  100;
//        } else if (result1.equals("Ноутбуки")) {
//            return discount - discount * 20 / 100;
//        } else {
//            return  discount;
//        }
//    }
//}


//    public  static  int getMax(int num , int num1 , int num2) {
//
//        if (num < num1 ) {
//            return num1;
//        } else if (num  > num1 ) {
//            return num;
//
//        } else if (num1 > num2) {
//            return  num1;
//        } else {
//            return num2; //  НА дом
//
//
//        }
//    }
//}
//       String age11 = getAgeGroup(16);
//        System.out.println(age11);
//
//    }
//
//    public  static  String getAgeGroup(int age) {
//            if (age > 21)  {
//                return "Взрослый";
//             } else if (age > 12) {
//                return "Подросток";
//            } else {
//                return "Ребенок";
//            }
//    }
//}


//        formatFriendsCount(1);
//        formatFriendsCount(2);
//        formatFriendsCount(3);
//        formatFriendsCount(4);
//        formatFriendsCount(5);
//        formatFriendsCount(7);
//        formatFriendsCount(9);

//        welcomeUser(24);

//        shoInfo(" Иван " , " Иванов " , 45);

//        showDate(2025, 1, 3);
//        showDate(2025, 10, 1);
//        showDate(2025, 11, 27);


//        int[] scores = {85, 92, 78, 93, 88, 95, 82};
//
//        findSecondMax(scores);
//
//    }
//    public  static  void findSecondMax(int[] scores) {
//
//
//        for (int i = 0; i < scores.length; i++) {
//
//
//        }
//        System.out.println("Второй максимум  : " + scores[1]  );
//    }
//}

//        int[] balance = {150, -50, 200, -30, -80, 100, -20, 300};
//
//        countPositiveNegative(balance);
//    }
//    public  static  void countPositiveNegative(int[] balance) {
//        int balance1 = 0;
//        int  balance2 = 0;
//        for (int i = 0; i < balance.length; i++) {
//
//            if (balance[i] > 0) {
//                balance1++;
//            } else if ( balance[i] < 0) {
//                balance2++;
//
//            }
//        }
//        System.out.println("Положительные число  : " + balance1);
//        System.out.println("Отрицательные число   : " + balance2);
//    }
//}

//        int[] temperatures = {18, 22, 25, 19, 28, 23, 30, 21, 26, 24};
//
//        findMaxTemp(temperatures);
//    }
//    public  static  void findMaxTemp(int[] temperatures) {
//        int tempe = temperatures[0];
//         for (int i = 0; i < temperatures.length; i++) {
//
//
//                if ( temperatures[i] > tempe) {
//                    tempe = temperatures[i];
//                }
//         }
//        System.out.println("Максимальная  температура  : " + tempe);
//
//    }
//}


//        String[] week1 = {"Солнечно", "Облачно", "Солнечно", "Пасмурно", "Пасмурно", "Облачно", "Облачно"};
//        String[] week2 = {"Солнечно", "Солнечно", "Солнечно", "Солнечно", "Солнечно", "Облачно", "Облачно"};


//            countSunnyDays(week1);
//            countSunnyDays(week2);
//    }
//    public  static  void countSunnyDays(String[] week1) {
//       int  weather = 0;
//       int   weather1 = 0;
//
//        for (int i  = 0; i < week1.length; i ++) {
//
//            if (week1[i].equals("Солнечно")) {
//                weather++;
//            } else if (week1[i].equals("Облачно")) {
//                weather1++;
//
//            }
//        }
//        System.out.println("Количество  Солнечных дней  : " + weather);
//        System.out.println("Количество  Облачных  дней  : " + weather1);
//    }
//}


//    }
//
//
//    public static  void countSunnyDays(String[] week) {
//
//
//
//        if (week.equals("")) {
//    }


//        int[] may2022 = {26, 19, 13, 17, 20, 24, 12, 17, 21, 19, 20, 23, 26, 25, 24, 27, 26, 18, 20, 25, 31, 20, 22, 28, 30, 34, 31, 16, 27, 30, 24};
//        int[] may2023 = {12, 12, 15, 17, 22, 25, 27, 29, 21, 24, 27, 21, 25, 13, 20, 23, 24, 12, 19, 23, 24, 26, 24, 25, 27, 22, 23, 23, 29, 33, 33};
//
//        avg(may2023);
//        avg(may2022);


//    public static void avg(int[] year) {
//        double sum = 0;
//        for (int i = 0; i < year.length; i++) {
//
//
//            sum = sum + year[i];
//
//        }
//
//            System.out.println("Средния температура : " + sum / year.length);
//        }


//
//        comfortCount(may2022);
//        comfortCount(may2023);
//
//    }
//    public static void comfortCount(int[] year) {
//        int weather = 0;
//
//        for (int i  = 0; i < year.length; i ++) {
//
//            if (year[i] >= 17 && year[i] <= 20) {
//                weather++;
//
//            }
//        }
//        System.out.println(" Количество дней с комфортной температурой : " + weather);
//


//    String[] week1 = {"Солнечно", "Облачно", "Солнечно", "Пасмурно", "Пасмурно", "Облачно", "Облачно"};
//    String[] week2 = {"Солнечно", "Солнечно", "Солнечно", "Солнечно", "Солнечно", "Облачно", "Облачно"};
//
//}
//
//    public  static  void  countSunnyDays(String[] week1) {
//        int  weather = 0;
//
//        for (int i  = 0; i < week1.length; i ++) {
//
//            if (week1[i].equals("Солнечно")) {
//                weather++;
//            }
//        }
//        System.out.println("Количество  солнечных дней : " + weather );
//    }
//

//
//        printMonthDays(1);
//        printMonthDays(2);
//        printMonthDays(8);
//        printMonthDays(4);
//        printMonthDays(3);
//    }
//
//    public static void printMonthDays(int month ) {
//        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
//            System.out.println("В этом месяце " + " 31 " + "Дней ");
//        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//            System.out.println("В этом месяце " + " 30 " + "Дней");
//        } else {
//            System.out.println("В этом месяце  28/29 Дней");
//        }
//    }

//
//        printSeason(1);
//        printSeason( 7);
//    }

//    public static void printSeason(int months) {
//        if ( months ==  12  ||  months==1  ||  months == 2  ) {
//            System.out.println("Зима");
//        } else if (months == 3  ||  months == 4   || months == 5) {
//            System.out.println("Весна");
//        } else if (months == 6  ||  months == 7  ||  months == 8) {
//            System.out.println("Лето");
//        } else if (months == 9  ||  months == 10   ||  months == 11) {
//            System.out.println("Осень");
//
//        }
//}
//


//        printMultipcation(1);
//    }
//
//    public static void printMultipcation(int muiti) {
//
//        System.out.println("1 * 1  = " + 1   );
//
//
//

//        showDate(1);
//
//        }
//    public static void showDate(int year, int month, int day) {
//        if (month < 10 && day < 10) {
//            System.out.println(" Дата " + year + "." + "0" + month + "." + "0" + day);
//        } else if (month < 10) {
//            System.out.println(" Дата " + year + "." + "0" + month + "." + day);
//        } else if (day < 10) {
//            System.out.println("Дата " + year + "." + month + "." + "0" + day);
//        } else {
//            System.out.println("Дата: " + year + "." + month + "." + day);
//        }
//    }
//
//
//    public static void shoInfo(String name, String lastname, int age) {
//        System.out.println("  Имя: " + name);
//        System.out.println("  Фамилия: " + lastname);
//        System.out.println("  Возраст: " + age);
//    }
//
//
//    public static void welcomeUser(int time) {
//        if (time >= 0 && time < 6) {
//            System.out.println("Доброй ночи ");
//        } else if (time > 6 && time < 12) {
//            System.out.println("Доброе утро ");
//        } else if (time > 12 && time < 18) {
//            System.out.println("Добрый день ");
//        } else if (time > 18 && time < 23) {
//            System.out.println("Добрый вечер");
//        } else {
//            System.out.println("Доброй ночи");
//        }
//    }
//
//    public static void formatFriendsCount(int number) {
//
//        if (number == 1) {
//            System.out.println("У вас " + number + " друг");
//
//        } else if (number >= 2 && number < 5) {
//            System.out.println("У вас " + number + " друга");
//
//        } else {
//            System.out.println("У вас " + number + " друзей");
//
//        }
//    }
//}
//
