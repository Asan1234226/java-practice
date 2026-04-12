package Main;

public class Test {
  public static void main(String[] args) {
      Order order = new Order(1, "Алия");

        order.addItem(1000);
        order.addItem(500);
        order.setDiscountPercent(20);
//
        order.ship();      // ошибка
        order.confirm();
//        order.removeItem(2500);
//        order.removeItem(250);
        order.ship();
//
        order.addItem(200); // ошибка
//
        order.printOrderInfo();
//
        order.cancel();    // ошибка
        order.deliver();
//
        order.printOrderInfo();
    }

}
