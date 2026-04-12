package polymorphism.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Delivery> list = new ArrayList<>();
        list.add(new CarDelivery("#101", "Green Street 12", "Alex"));
        list.add(new BikeDelivery("#102", "Main Avenue 5", "Timur"));
        list.add(new ScooterDelivery("#103", "Park Road 7", "Dana"));

        for (Delivery delivery : list) {
            delivery.deliver();
        }
    }
}
