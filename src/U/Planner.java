package U;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Planner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] shopingList = new String[100];
        int newID = 0;
        int count = 0;
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. - Добавить продукт");
            System.out.println("2. - Вывести все продукты");
            System.out.println("3. - Удалить все продукты");
            System.out.println("0. - Выйти");
            int operation = Integer.parseInt(scanner.nextLine());

            if (operation == 1) {
                System.out.println("Введите название продукта для добавление в корзину:");
                String name = scanner.nextLine();

                shopingList[count] = name;
                newID++;
                count++;
            } else if (operation == 2) {
                if (count == 0) {
                    System.out.println("Корзина пуста");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + " " + shopingList[i]);
                    }
                }
            } else if (operation == 3) {
                if (count == 0) {
                    System.out.println("Корзина пуста");
                } else {
                    System.out.println("Введите номер продукта, который вы хотите удалить:");
                    int num = Integer.parseInt(scanner.nextLine());

                    if (newID == num) {
                        shopingList[count - 1]  = null;
                        count --;
                        System.out.println("продукт удален");
                    } else {
                        System.out.println("Неверный код");
                    }
                }
             } else if (operation == 0) {
                System.out.println("Выход");
                break;
            }
        }
    }
}



