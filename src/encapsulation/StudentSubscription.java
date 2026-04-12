package encapsulation;

public class StudentSubscription extends Subscription {
    double discountPercent;


    public StudentSubscription(String newUserName, int newDurationMonths, boolean newAutoRenew, double newDiscountPercent) {
        super(newUserName, newDurationMonths, newAutoRenew);
        discountPercent = newDiscountPercent;
    }
    public double calculatePrice() {
        double totalPrice = super.calculatePrice();
        if (discountPercent > 50) {
            discountPercent = 50;
        }
        totalPrice = totalPrice - (totalPrice * discountPercent / 100);
        if (durationMonths >= 12) {
            totalPrice = totalPrice - totalPrice * 0.1;
        }
        return totalPrice;
    }

    public  String getType() {
        return  "Student";
    }
}
