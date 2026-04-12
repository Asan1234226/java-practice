package encapsulation.task2;

public class BusinessAccount extends BankAccount {

    double overdraftLimit;


    BusinessAccount(String newName, double newBalance, double newOverDaRftLimit) {
        super(newName, newBalance);
        overdraftLimit = newOverDaRftLimit;
    }

    boolean withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            return true;
        }
        if (balance - amount <= -overdraftLimit) {
            System.out.println("Overdraft limit exceeded ");
            return false;
        } else {
            balance -= amount;
            System.out.println("<" + name + "> " + "withdrew " + " <" + amount + ">. " + "Balance:" + " <" + balance + ">");
        }
        return true;
    }

    double calculateMonthlyFee() {
        return 1000;
    }

    String getType() {
        return "Business";
    }
}


