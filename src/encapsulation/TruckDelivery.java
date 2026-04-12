package encapsulation;

public class TruckDelivery extends Delivery {
    int loaders;

    public TruckDelivery(String newId, double newDistanceKm, double newWeightKg, boolean newFragile, int newLoaders) {
        super(newId, newDistanceKm, newWeightKg, newFragile);
        loaders = newLoaders;
    }

    public double calculatePrice() {
//        if (weightKg > 30) {
//            return -1;
//        }
        double totalprice = super.calculatePrice();
        if (fragile == true && weightKg > 50) {
            totalprice += 1000;
            }
        return totalprice + loaders * 700;
        }
    }
