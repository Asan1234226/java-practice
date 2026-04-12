public class Treasurechest {
    String owner;
    double balance;
    String status = "закрыт";

    void  show() {
        System.out.println("Сундук пользователя " + owner);
        System.out.println("Монет " + balance);
        System.out.println("Состяние " + status);
    }
    void open() {
        status = "открыт";
        System.out.println("Сундук открыт");
    }
    void close() {
        status = "закрыт";
        System.out.println("Сундук закрыт ");
    }
    void  addCoin(int coin) {
        if (status.equals("открыт") ) {
            balance += coin;
        }else {
            System.out.println("Сундук закрыт нельзя положить монеты");
        }
    }
    void  shake() {
        System.out.println("ДЗИНЬ-ДЗИНЬ Монеты звенят");
    }
}
