package lists;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Telephone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        while (true) {
            System.out.println("\n==== ТЕЛЕФОНАЯ КНИГА ====");
            System.out.println("1 - Добавить номер");
            System.out.println("2 - Удалить номер");
            System.out.println("3 - Удалить контакт");
            System.out.println("4 - Найти контакт");
            System.out.println("5 - Показать все контакты");
            System.out.println("6 - Найти контакт по номеру");
            System.out.println("7 - Переименовать контакт");
            System.out.println("8 - Изменить номер контакта");
            System.out.println("0 - Выход");
            System.out.println("Выберите команду:");
            int operation = scanner.nextInt();


            if (operation == 1) {
                addContact(map,scanner);
            } else if (operation == 2) {
                deleteNumber(map, scanner);
            } else if (operation == 3) {
                deleteName(map, scanner);
            } else if (operation == 4) {
                findContact(map, scanner);
            } else if (operation == 5) {
                displayContacts(map);
            } else if (operation == 6) {
                findContactNumber(map, scanner);
            } else if (operation == 7) {
                moveContact(map, scanner);
            } else if (operation == 8) {
                changeContactNumber(map, scanner);
            } else {
                if (operation == 0) {
                    break;
                }
            }
        }
    }

    static void deleteNumber(HashMap<String, ArrayList<String>> map, Scanner scanner) {
        System.out.println("Введите имя контакта:");
        String name = scanner.next();
        System.out.println("Введите номер для удаления:");
        String sum = scanner.next();
        if (!map.containsKey(name)) {
            System.out.println("Контакт не найден");
        } else {
            map.get(name).remove(sum);
            System.out.println("Номер удален");
        }
    }

    static void deleteName(HashMap<String, ArrayList<String>> map, Scanner scanner) {
        System.out.println("Введите контакт для удаления:");
        String name = scanner.next();
        if (!map.containsKey(name)) {
            System.out.println("Контакт не найден");
        } else {
            System.out.println("Контакт удален");
            map.remove(name);

        }
    }

    static void findContact(HashMap<String, ArrayList<String>> map, Scanner scanner) {
        System.out.println("Введите контакт для поиска:");
        String name = scanner.next();
        if (!map.containsKey(name)) {
            System.out.println("Контакт не найден");
        } else {
            System.out.println(name + " -> " + map.get(name));
        }
    }

    static void displayContacts(HashMap<String, ArrayList<String>> map) {
        if (map.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            System.out.println("==== ВСЕ КОНТАКТЫ ====");
            for (String name : map.keySet()) {
                System.out.println(name + " -> " + map.get(name));
            }
        }
    }

    static void findContactNumber(HashMap<String, ArrayList<String>> map, Scanner scanner) {
        System.out.println("Введите номер телефона для поиска:");
        String sum = scanner.next();
        String num = "Контакт с таким номером не найден";
        for (String name : map.keySet()) {
            if (map.get(name).contains(sum)) {
                num = "Номер принадлежит: " + name;
            }
            System.out.println(num);
        }
    }

    static void moveContact(HashMap<String, ArrayList<String>> map, Scanner scanner) {
        System.out.println("Введите текущее имя контакта:");
        String old = scanner.next();
        System.out.println("Введите новое имя конатка:");
        String name = scanner.next();
        if (!map.containsKey(old)) {
            System.out.println("Такого контакта нету");
        } else {
            ArrayList<String> num = map.remove(old);
            map.put(name, num);
            System.out.println("Контакт переминован");
        }
    }

    static void changeContactNumber(HashMap<String, ArrayList<String>> map, Scanner scanner) {
        System.out.println("Введите имя контакта:");
        String name = scanner.next();

        if (!map.containsKey(name)) {
            System.out.println("Такого имени нету");
            return;
        }
        System.out.println("Введите старый номер телефона:");
        String oldNum = scanner.next();

        if (!map.get(name).contains(oldNum)) {
            System.out.println("Такого номера нету");
            return;
        }

        System.out.println("Введите новый номер телефона:");
        String newNum = scanner.next();

        map.get(name).remove(oldNum);
        map.get(name).add(newNum);
        System.out.println("Номер изменен");
    }

    static void addContact(HashMap<String, ArrayList<String>> map, Scanner scanner) {
        System.out.println("Введите имя контакта:");
        String name = scanner.next();
        while (true) {
            System.out.println("Введите номер телефона ( или 0 для завершение ):");
            String sum = scanner.next();
            if (sum.equals("0")) {
                break;
            }

            String num = "";
            for (String name1 : map.keySet()) {
                if (map.get(name1).contains(sum)) {
                    num = "номер уже занят";
                }
            }

            // если num != номер уже занят
            // добваление
            // иначе - вывод "номер уже занят"
            if (map.isEmpty() || !num.equals("номер уже занят")) {
                if (!map.containsKey(name)) {
                    map.put(name, new ArrayList<>());
                }
                map.get(name).add(sum);
                System.out.println("номер добавлен");
            } else {
                System.out.println("номер  уже занят");
            }
        }
    }
}


// map.get(name1).remove(old);

// System.out.println("Введите контакт для удаления:");
// String name = scanner.next();
//             if (!map.containsKey(name)) {
//   System.out.println("Контакт не найден");
//         } else {
//               System.out.println("Контакт удален");
//         map.remove(name);