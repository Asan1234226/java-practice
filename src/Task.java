public class Task {
    int sum;
    String name;
    String status;

    Task(int newSum, String newName, String newStatus) {
        name = newName;
        sum = newSum;
        status = newStatus;
    }


    void display() {
        if (status.equals("NEW")) {
            System.out.println("- " + name);
        }
    }
}
