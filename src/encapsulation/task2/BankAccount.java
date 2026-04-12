package encapsulation.task2;

public class BankAccount {
    String name;
    double balance;

    BankAccount(String newName, double newBalance) {
        name = newName;
        balance = newBalance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit");
        } else {
            balance += amount;
            System.out.println("<owner> deposited <amount>. Balance: <balance>");
        }
    }

    boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit");
            return false;
        }
        if (balance == 0) {
            System.out.println("Not enough money");
            return false;
        } else {
            balance -= amount;
            System.out.println("<" + name + "> " + "withdrew " +" <" + amount + ">. " + "Balance:" + " <" + balance + ">" );
        }
        return true;
    }

    double calculateMonthlyFee() {
        return 0;
    }

    String getType() {
        return "Base";
    }

    void printReport() {
        System.out.println("Owner:" + " <" + name + ">");
        System.out.println("Type:" + " <" + getType() + ">");
        System.out.println("Balance:" + " <" + balance + ">");
        System.out.println("Mouthly fee:" + " <" + calculateMonthlyFee() + ">");
    }
}
