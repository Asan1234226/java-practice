package polymorphism.task1;

public class MobilePayment extends Payment {
    double dailyLimit;

    MobilePayment(String newAccount, double newBalance,double newDailyLimit) {
        super(newAccount,newBalance);
        dailyLimit = newDailyLimit;
    }

    boolean pay(double amount) {
        if (amount > dailyLimit) {
            System.out.println("Payment exceeds daily limit");
            return  false;
        } else  {
            balance -= amount;
            System.out.println("Mobile payment " + amount + " successful");
            return  true;
        }
    }
}
