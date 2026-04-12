package encapsulation;

public class Test5 {
    public static void main(String[] args) {
        CourierDelivery courier1 =
                new CourierDelivery("A-101", 12, 3, false, true);

        CourierDelivery courier2 =
                new CourierDelivery("A-102", 25, 2, false, false);

        PickupDelivery pickup =
                new PickupDelivery("B-201", 5, 6, true, 40);

        TruckDelivery truck1 =
                new TruckDelivery("C-301", 30, 60, true, 2);

        TruckDelivery truck2 =
                new TruckDelivery("C-302", 10, 20, false, 1);


        courier1.printReceipt();
        if (courier1.calculatePrice() == -1) {
            System.out.println("Delivery A-101 is not available.");
        }
        System.out.println();

        courier2.printReceipt();
        if (courier2.calculatePrice() == -1) {
            System.out.println("Delivery A-102 is not available.");
        }
        System.out.println();

        pickup.printReceipt();
        System.out.println();

        truck1.printReceipt();
        System.out.println();

        truck2.printReceipt();
}
}
