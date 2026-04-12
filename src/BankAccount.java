public class BankAccount {
    double balance;
    String owner;

    void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Нельзя пополнять на отрицательную сумму");
        } else {
            balance += amount;
        }
    }

    void buy(Product product) {
        if (balance < product.price) {
            System.out.println("Недостатачно средств для покупки");
        } else {
            balance -= product.price;
            System.out.println("Куплен товар " + product.name);
        }
    }

        void withdraw ( int amount){
            if (balance < amount) {
                System.out.println("Недостатачно средств ");
            } else {
                balance -= amount;
            }
        }
        void transfer (BankAccount otherAccount,int amount){
            if (balance < amount) {
                System.out.println("Недостатачно средств");
            } else if (amount <= 0) {
                System.out.println("Нельзя перевести на отрицательную сумму");
            } else {
                balance -= amount;
                otherAccount.balance += amount;
            }
        }
    }


// 2000 - 2500
//  2000 - высшее 2000




