package encapsulation;

public class Delivery {
    String id;
    double distanceKm;
    double weightKg;
    boolean fragile;


    public Delivery(String newId, double newDistanceKm, double newWeightKg, boolean newFragile) {
        id = newId;
        distanceKm = newDistanceKm;
        weightKg = newWeightKg;
        fragile = newFragile;
    }

    public String getId() {
        return id;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public boolean getFragile() {
        return fragile;
    }

    public double calculatePrice() {
        double totalPrice = distanceKm * 60 + weightKg * 120;
    if (fragile == true) {
            totalPrice += 500;
        }
    return totalPrice;
    }

    public  String getType() {
        return  "Delivery";
    }

    void printReceipt() {
        System.out.println("ID: " + " <" + id + "> ");
        System.out.println("Type: " + " <" + getType() + "> ");
        System.out.println("Distance: " + " <" + distanceKm + "> " + " km");
        System.out.println("Weight: " + " <" + weightKg + "> " + " kg");
        System.out.println("Fragile: " + " <" + fragile + "> ");
        System.out.println("Price: " + " <" + calculatePrice() + "> ");
    }
}