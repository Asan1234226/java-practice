package polymorphism.task1;

public class Main {
    public static void main(String[] args) {

        Payment[] payments = {
                new CardPayment("CARD-001", 5000, 2),
                new BankTransfer("BANK-ABC", 8000, 150),
                new MobilePayment("PHONE-777", 2000, 1000)
        };

        for (Payment payment : payments) {
            payment.printBalance();
            payment.pay(900);
            payment.printBalance();
            System.out.println();
        }
    }
}

