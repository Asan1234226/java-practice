package encapsulation;

public class PickupDelivery extends Delivery {
    double discountPercent;

    public PickupDelivery(String newId, double newDistanceKm, double newWeightKg, boolean newFragile, double newDiscountPercent) {
        super(newId, newDistanceKm, newWeightKg, newFragile);
        discountPercent = newDiscountPercent;
    }

    public double calculatePrice() {
        double price = super.calculatePrice();
        if (discountPercent > 30) {
         discountPercent = 30;
            price -= price * (discountPercent / 100);
        }
        return price;
    }

    public  String getType() {
        return  "Pickup";
    }
}
