package encapsulation;

public class CourierDelivery extends Delivery {
    boolean express;


    public CourierDelivery(String newId, double newDistanceKm, double newWeightKg, boolean newFragile, boolean newExpress) {
        super(newId,newDistanceKm,newWeightKg,newFragile);
        express = newExpress;
    }
    public double calculatePrice() {
        if (distanceKm > 20) {
            return - 1;
        }
        double totalPrice = super.calculatePrice();
        if (express == true) {
            totalPrice *= 1.5;
        }
        return totalPrice;
    }

    public String getType(){
        return "Courier";
    }
}




