import java.util.ArrayList;
public class Task2 {
    public  static void  main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, "прочесть книгу", "NEW"));
        tasks.add(new Task(2, "оплатить квартплату", "NEW"));
        tasks.add(new Task(3, "зайти на созвон", "IN WORK"));
        tasks.add(new Task(4, "заказать новый стул", "DONE"));
        tasks.add(new Task(5, "забрать заказ с почты", "NEW"));

        for (Task task1 : tasks) {
            task1.display();
        }
    }
}