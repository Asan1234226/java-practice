package polymorphism.task2;

public class Delivery {
    String orderId;
    String address;

    Delivery(String newOrderId, String newAddress) {
        orderId = newOrderId;
        address = newAddress;
    }

    void deliver() {
        System.out.println("Delivering order " + orderId + " to " + address);
    }

    String getType() {
     return  "Standard";
    }
}
