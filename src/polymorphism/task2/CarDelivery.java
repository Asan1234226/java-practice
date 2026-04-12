package polymorphism.task2;

public class CarDelivery extends Delivery {
    String courierName;

    CarDelivery(String newOrderId, String newAddress, String newCourierName) {
        super(newOrderId,newAddress);
        courierName = newCourierName;
    }

    void deliver() {
        System.out.println("Driver " + courierName + " is delivering order " + orderId + " by car to " + address);
    }

    String getType() {
        return "Car";
    }
}
