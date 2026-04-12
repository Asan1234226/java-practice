package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("1.Добавить");
            System.out.println("2.Распечатать");
            System.out.println("3.Удалить задачу");
            System.out.println("4.Обновить задачу");
            System.out.println("5.Отметить задачу как выполненную / невыполненную");
            System.out.println("0.Выйти");
            int operation = scanner.nextInt();

            if (operation == 1) {
                System.out.println("Введите...");
                String str = scanner.next();
                if (!list.contains(str)) {
                    list.add(str);
                } else {
                    System.out.println("Данное задача уже есть в списке");
                }

            } else if (operation == 2) {
                if (list.isEmpty()) {
                    System.out.println("Список пуст");
                } else {
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println("Список задач");
                        System.out.println(i + 1 + "." + "[] " + list.get(i));
                    }
                }

            } else if (operation == 3) {
                if (list.isEmpty()) {
                    System.out.println("Список пуст");
                } else {
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(i + 1 + "." + list.get(i));
                    }
                    System.out.println("Введите  номер задачи  для удаление");
                    int num = scanner.nextInt();
                    if (num < 1 || num > list.size()) {
                        System.out.println("Некоректный номер задачи");
                    } else {
                        System.out.println("Задача " + num + " Удалена");
                        list.remove(num - 1);

                    }
                }

            } else if (operation == 4) {
                if (list.isEmpty()) {
                    System.out.println("Список пуст");
                } else {

                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(i + 1 + "." + list.get(i));
                    }
                    System.out.println("Введите номер для обновление");
                    int num = scanner.nextInt();
                    if (num < 1 || num > list.size()) {
                        System.out.println("Некоректный номер ");
                    } else {
                        System.out.println("Введите  новое название  задачи [" + num + "] ");
                        String num1 = scanner.next();
                        list.set(num - 1, num1);

                        System.out.println("Задача обновлена");
                    }
                }
            } else if (operation == 5) {
                if (list.isEmpty()) {
                    System.out.println("Список пуст");
                } else {
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(i + 1 + "." + "[] " + list.get(i));
                    }
                    System.out.println("Введите номер  задачи");
                    int num = scanner.nextInt();
                    if (num < 1 || num > list.size()) {
                        System.out.println("Некоректный номер ");

                    }

                }


            } else if (operation == 0) {
                break;
            }
        }
    }
}


//        list.add("Java");
//        list.add("Php");
//        list.add("Go");
//        list.add("JavaScript");
//        list.add("Python");
//
//
//        for (int i = 0; i < list.size(); i++) {
//                System.out.println(" - " + list.get(i));
//
//
//            }
//    }
//}