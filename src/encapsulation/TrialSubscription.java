package encapsulation;

public class TrialSubscription extends Subscription {
    int trialDays;

    public TrialSubscription(String newUserName, int newDurationMonths, boolean newAutoRenew, int newTrialDays) {
        super(newUserName, newDurationMonths, newAutoRenew);
        trialDays= newTrialDays;
    }


    public double calculatePrice() {
        double totalPrice = 0;
        if (trialDays > 0) {
        }
        if (trialDays == 0) {
            durationMonths = 0;
        }
        return totalPrice;
    }


    public String getType() {
        return "Trial";
    }
}
