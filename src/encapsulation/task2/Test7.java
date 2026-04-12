package encapsulation.task2;

public class Test7 {
        public static void main(String[] args) {
            SavingsAccount sa = new SavingsAccount("Ali", 12000, 6);
            CheckingAccount ca = new CheckingAccount("Dana", 1500, 2);
            BusinessAccount ba = new BusinessAccount("Shop", 1000, 5000);

            sa.printReport();
            sa.applyMonthlyInterest();
            sa.withdraw(2000);
            System.out.println();

            ca.printReport();
            ca.withdraw(200);
            ca.withdraw(200);
            ca.withdraw(200); // тут должна быть комиссия
            System.out.println();

            ba.printReport();
            ba.withdraw(5500); // должен уйти в минус, но в пределах лимита
            ba.withdraw(1000); // должен превысить лимит
        }
    }

