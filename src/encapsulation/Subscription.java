package encapsulation;

public class Subscription {
    String userName;
    int durationMonths;
    boolean autoRenew;

    public Subscription(String newUserName, int newDurationMonths, boolean newAutoRenew) {
        userName = newUserName;
        durationMonths = newDurationMonths;
        autoRenew = newAutoRenew;
    }
    public  double calculatePrice() {
        double totalPrice = 1000 * durationMonths;
        return  totalPrice;
    }

    public  boolean isActive() {
        if (durationMonths > 0) {
        }
        return true;
    }
    public String getType() {
        return "Basic";
    }

    public void printInfo(){
        System.out.println("User " + " <" + userName + ">");
        System.out.println("Type " + " <" + getType() + ">");
        System.out.println("Duration " + " <" + durationMonths + "> " + "months" );
        System.out.println("Auto renew " + " <" + autoRenew + ">");
        System.out.println("Price " + " >" + calculatePrice() + ">");
        System.out.println("Active " + " >" + isActive() + ">");
    }
}
