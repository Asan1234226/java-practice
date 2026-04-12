package encapsulation.task2;

public class SavingsAccount extends BankAccount {
    double interestPercent;

    SavingsAccount(String newName, double newBalance, double newInterestingPercent) {
        super(newName, newBalance);
        interestPercent = newInterestingPercent;

        double calculateMonthlyFee = 0;

    }

    void applyMonthlyInterest() {
        interestPercent = balance += balance * (interestPercent / 100) / 12;
        System.out.println("Interest applied. Balance:" + " <" + balance + ">");
    }

    String getType() {
        return  "Savings";
    }
}

