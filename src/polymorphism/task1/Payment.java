package polymorphism.task1;

public class Payment {
    String account;
    double balance;

    Payment(String newAccount, double newBalance) {
        account = newAccount;
        balance = newBalance;
    }

      boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment");
            return false;
        }
        if (balance < amount) {
            System.out.println("Payment failed: insufficient funds");
            return  false;
        } else  {
            balance -= amount;
            System.out.println("Payment of " + amount + " from " + account + " successful");
            return  true;
        }
    }

    void printBalance() {
        System.out.println("Account: " + account + ",  Balance: " + balance);
    }
}
