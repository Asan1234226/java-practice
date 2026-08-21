package task;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Path path = Path.of("list.txt");
        List<String> list = Files.readAllLines(path);
        while (true) {
            System.out.println("Загружено задач  из файла: " + list.size());
            System.out.println("1. Добавить задачу");
            System.out.println("2. Распечатать все задачи");
            System.out.println("3. Удалить задачу");
            System.out.println("4. Обновить задачу");
            System.out.println("0. Завершить");
            int command = Integer.parseInt(scanner.nextLine());
            if (command == 1) {
                System.out.println("Введите задачу");
                String task = scanner.nextLine();
                if (list.contains(task)) {
                    System.out.println("Данная задача уже есть в списке");
                } else {
                    list.add(task);
                    System.out.println("Задача успешно добавлена");
                }
            } else if (command == 2) {
                if (list.isEmpty()) {
                    System.out.println("Список пуст");
                    continue;
                }
                System.out.println("Список задач:");
                for (String string : list) {
                    System.out.println(" - " + string);
                }
            } else if (command == 3) {
                if (list.isEmpty()) {
                    System.out.println("Список пуст");
                    continue;
                }
                System.out.println();
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(i + 1 + ". " + list.get(i));
                }
                System.out.println("Введите номер задачи для удаления");
                int idx = Integer.parseInt(scanner.nextLine());
                if (idx >= 1 && idx <= list.size()) {
                    String removed = list.remove(idx - 1);
                    System.out.println("Задача '" + removed + "' удалена");
                } else {
                    System.out.println("Некорректный номер задачи");
                }
            } else if (command == 4) {
                if (list.isEmpty()) {
                    System.out.println("Список пуст");
                    continue;
                }
                System.out.println();
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(i + 1 + ". " + list.get(i));
                }
                System.out.println("Введите номер задачи для обновления");
                int idx = Integer.parseInt(scanner.nextLine());
                if (idx >= 1 && idx <= list.size()) {
                    System.out.printf("Введите новое название задачи [%s]\n", list.get(idx - 1));
                    list.set(idx - 1, scanner.nextLine());
                    System.out.println("Задача обновлена");
                } else {
                    System.out.println("Некорректный номер задачи");
                }
            } else if (command == 0) {
                FileWriter writer = new FileWriter("list.txt");
                for (String s : list) {
                    writer.write(s + "\n");
                }
                writer.close();
                break;
            } else {
                System.out.println("Некорректная команда");
            }
            System.out.println();
        }
    }
}
