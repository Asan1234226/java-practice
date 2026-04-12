package polymorphism.task2;

public class BikeDelivery extends Delivery {
    String courierName;

    BikeDelivery(String newOrderId, String newAddress, String newCourierName) {
        super(newOrderId, newAddress);
        courierName = newCourierName;
    }

    void deliver() {
        System.out.println("Courier " + courierName + " is delivering order " + orderId + " by bike to " + address);
    }
    String getType() {
        return "Bike";
    }
}
