package encapsulation.task2;

public class CheckingAccount extends BankAccount {

    int freeWithdrawals;
    int withdrawalsThisMonth;


    CheckingAccount(String newName, double newBalance, int newFreeWithdrawals) {
        super(newName, newBalance);
        freeWithdrawals = newFreeWithdrawals;
        withdrawalsThisMonth = 0;

    }

    boolean withdraw(double amount) {
        if (amount <= balance && amount == 0) {
            return true;

        }

        if (balance >= 0) {
            balance += amount;
            balance += 200;
            System.out.println("Withdrawal canceled: fee would overdraw account");
        } else {
            withdrawalsThisMonth++;
            System.out.println("<" + name + "> " + "withdrew " + " <" + amount + ">. " + "Balance:" + " <" + balance + ">");
            if (withdrawalsThisMonth > freeWithdrawals) {
                balance -= 200;
                System.out.println("Fee charged 200. Balance:" + " <" + balance + ">");
            }
        }
        return true;
    }


    double calculateMonthlyFee() {
        if (balance < 1000) {
            return 300;
        } else {
            return 0;
        }
    }

    String getType() {
        return "Checking";
    }
}


//  double newInterestingPercent,