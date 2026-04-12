package polymorphism.task2;

public class ScooterDelivery extends Delivery {
    String courierName;

    ScooterDelivery(String newOrderId, String newAddress, String newCourierName) {
        super(newOrderId, newAddress);
        courierName = newCourierName;
    }

    void deliver() {
        System.out.println("Courier " + courierName + " is delivering order " + orderId + " by scooter to " + address);
    }
    String geType() {
        return "Scooter";
    }
}

