package encapsulation;

public class PremiumSubscription extends  Subscription {
    boolean familyAccess;


    public PremiumSubscription(String newUserName, int newDurationMonths, boolean newAutoRenew, boolean newFamilyAccess) {
        super(newUserName, newDurationMonths, newAutoRenew);
        familyAccess = newFamilyAccess;
    }
    public double calculatePrice() {
        double totalPrice = super.calculatePrice() + (durationMonths * 500);
        if (familyAccess == true) {
            totalPrice += durationMonths * 300;
        }
        return  totalPrice;
    }

    public  String getType() {
        return  "Premium";
    }
}
