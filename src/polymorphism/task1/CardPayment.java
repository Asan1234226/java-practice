package polymorphism.task1;

public class CardPayment extends Payment {
    double commissionPercent;


    CardPayment(String newAccount, double newBalance, double newCommissionPercent) {
        super(newAccount, newBalance);
        commissionPercent = newCommissionPercent;

    }
    boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment");
            return false;
        }
        double commission = amount * commissionPercent / 100;
         double totalPrice = amount + commission;
        if (balance < totalPrice) {
            return  false;
        } else  {
             balance -= totalPrice ;
            System.out.println("Card payment " + amount  +  " processed. Commission: " + commission);
            return true;
        }
    }
}
