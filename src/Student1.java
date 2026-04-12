import java.util.Arrays;

public class Student1 {
    String name;
    double[] orders = new double[10];

    void  show() {
        double sum = 0;
        double count = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != 0) {
                count++;
                System.out.println(" - " + orders[i]);

                sum += orders[i];

            }
        }
        System.out.println("Имя: " + name);
        System.out.println("Средния оценка: " + (sum / count));
    }

    double getMaxScore() {
        double max = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] > max) {
            max = orders[i];
            }
        }
        return  max ;
        }
    }

