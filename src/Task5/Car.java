package Task5;

public class Car {
    private String make;
    private String model;
    private int year;
    private int speed;

    Car(String newMake, String newModel, int newYear) {
        make = newMake;
        model = newModel;
        year = newYear;
        speed = 0;
    }

    public void accelerate(int increment) {
        if (increment > 0) {
            speed = increment;
            System.out.println("\nАвтомобиль ускорился на " + increment + "км/ч");
        } else {
            System.out.println("\nЗначение ускорения должно быть положительным.");
        }
    }

    public void brake(int decrement) {
        if (decrement > 0) {
            speed = decrement;
            System.out.println("\nАвтомобиль замедлился на " + decrement + "км/ч.");
        } else {
            System.out.println("\nЗначение замедления должно быть положительным.");
        }
    }

    public void setMake(String str) {
        if (str.equals("")) {
            System.out.println("\nМарка не может быть пустой.");
        } else {
            make = str;
        }
    }

    public void setModel(String str) {
        if (str.equals("")) {
            System.out.println("\nМодель не может быть пустой");
        } else {
            model = str;
        }
    }

    public void setYear(int str) {
        if (str > 2000) {
            year = str;
        }
        System.out.println("\nНекорректный год выпуска.");
    }


    public void printCarInfo() {
        System.out.println("\nМарка: " + make);
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
        System.out.println("Текущая скорость: " + speed);
    }
}
