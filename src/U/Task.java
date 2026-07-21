package U;

import java.util.Scanner;

public class Task {
    private String name;
    private double price;
    private String name2;


    Task(String name, double price, String name2) {
        this.name = name;
        this.price = price;
        this.name2 = name2;

    }


    public String print() {
        if (name.equals("Доход:")) {
            return name + " " + price + " " + name2;
        }
        return " ";
    }

    public String print2() {
        if (name.equals("Расход:")) {
            return name + " " + price + " " + name2;
        }
        return " ";
    }
}
