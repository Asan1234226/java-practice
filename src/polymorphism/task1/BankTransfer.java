package polymorphism.task1;

public class BankTransfer extends Payment {
    double transferFee;

    BankTransfer(String newAccount, double newBalance, double newTransferFee) {
        super(newAccount,newBalance);
        transferFee = newTransferFee;
    }
    boolean pay(double amount) {
        double totalPrice = amount + transferFee;
        balance -=  totalPrice;
        System.out.println("Bank transfer "+ amount + " completed. Fee: " + transferFee);
        return  true;
    }
}
