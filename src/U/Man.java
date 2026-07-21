package U;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Man {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> list = new ArrayList<>();
        double balance = 0;
        double balance1 = 0;
        String n = "Доход:";
        String nn = "Расход:";
        while (true) {
            printMenu(scanner);
            int operation = Integer.parseInt(scanner.nextLine());
            if (operation == 1) {
                System.out.println("Введите доход:");
                int num = Integer.parseInt(scanner.nextLine());

                System.out.println("Введите инфо дохода:");
                String name1 = scanner.nextLine();
                double naLog = num * 0.15;
                balance += naLog;
                list.add(new Task(n, num, name1));
            }
            if (operation == 2) {
                System.out.println("Введите Расход:");
                int num = Integer.parseInt(scanner.nextLine());

                System.out.println("Введите инфо Расход");
                String name1 = scanner.nextLine();

                double naLog = num * 0.15;
                balance1 += naLog;
                list.add(new Task(nn, num, name1));
            }
            if (operation == 3) {
                command(list, balance, balance1);
            }
        }
    }
    public static void printMenu(Scanner scanner) {
        System.out.println("1 - Доход");
        System.out.println("2 - Расход");
        System.out.println("3 - история");
    }

    public static void command(ArrayList<Task> list, double balance, double balance1) {
        System.out.println("Список Дохода");
        for (Task task : list) {
                System.out.println(task.print());
        }
        System.out.println("Список Расхода");
        for (Task task : list) {
                System.out.println(task.print2());
            }
        System.out.println("Итоговая сумма налога: " + (balance - balance1));
    }
}



