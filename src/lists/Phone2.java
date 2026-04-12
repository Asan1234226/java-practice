package lists;

import java.util.HashMap;
import java.util.Scanner;

public class Phone2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> contacts = new HashMap<>();
        while (true) {
            System.out.println("Телефонная книга");
            System.out.println("1 - Добавить контакт");
            System.out.println("2 - Получить номер");
            System.out.println("3 - Посмотреть все контакты");
            System.out.println("0 - Выход");
            System.out.println("Выберите команду:");
            int num1 = scanner.nextInt();
            if (num1 > 3 || num1 < 0) {
                System.out.println("Такой команды нету");
                continue;
            }

            if (num1 == 1) {
                System.out.println("Введите имя:");
                String name = scanner.next();

                if (!contacts.containsKey(name)) {
                    System.out.println("Введите номер:");
                    int sum = scanner.nextInt();
                    if (!contacts.containsValue(sum)) {
                        System.out.println("Контакт добавлен");
                        contacts.put(name, sum);
                    } else {
                        System.out.println("Данный контакт уже существует " + contacts.get(name));
                    }

                } else {
                        System.out.println("Данный контакт уже существует " + contacts.get(name));
                        System.out.println("Желаете обновить номер ?");
                        String num = scanner.next();
                        if (num.equals("Да")) {
                            System.out.println("Введите номер:");
                            int name1 = scanner.nextInt();
                            if (!contacts.containsValue(name1)) {
                                contacts.put(name, name1);
                                System.out.println("Контакт добавлен");
                            } else {
                                System.out.println("Данные номер уже использывается");
                            }
                        }
                    }



            } else if (num1 == 2) {
                System.out.println("Введите имя:");
                String name = scanner.next();
                if (!contacts.containsKey(name)) {
                    System.out.println("Контакт не найден");
                } else {
                    System.out.println(name + ": " + contacts.get(name));

                }
            } else if (num1 == 3) {
                if (contacts.isEmpty()) {
                    System.out.println("Список пуст");
                } else {
                    for (String num : contacts.keySet()) {
                        System.out.println(num + ":" + contacts.get(num));
                    }
                }

            } else {
                break;
            }
        }
    }
}

//      if (!num.containsValue(sum))   if (!num.containsKey(name)) {