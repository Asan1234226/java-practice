package Main;

public class Order {
    private int id;
    private String customerName;
    private int itemsCount;
    private double totalPrice;
    private int discountPercent;
    private String status;


    public void setCustomerName(String name) {
        if (name != null && !name.isEmpty()) {
            String num = name.trim();
            customerName = num;
        } else {
            System.out.println("\nНекоректная имя");
        }
    }

    Order(int newId, String newCustomerName) {
        itemsCount = 0;
        totalPrice = 0.0;
        discountPercent = 0;
        status = "NEW";
        id = newId;
        customerName = newCustomerName;
    }


    public void setDiscountPercent(int discountPercent) {
        if (discountPercent >= 0 && discountPercent <= 30) {
            this.discountPercent = discountPercent;
            System.out.println("Скидка установлена: " + discountPercent + "%");
        } else {
            System.out.println("\nНекоректная сумма скидки");
        }
    }

    public void addItem(double price) {
        if (price <= 0) {
            System.out.println("Некоректная сумма");
        }
        if (status.equals("SHIPPED") || status.equals("DELIVERED") || status.equals("CANCELLED")) {
            System.out.println("Нельзя изменить заказ после отправки.");
        } else {
            totalPrice += price;
            itemsCount++;
            System.out.println("Товар добавлен: " + price);
        }
    }

    public void removeItem(double price) {
        if (price > 0) {
            if (status.equals("NEW") || status.equals("CONFIRMED")) {
                if (itemsCount > 0) {
                    if (totalPrice >= price) {
                        System.out.println("Вы удалили на: " + price);
                        totalPrice -= price;
                        itemsCount--;
                    } else {
                        System.out.println("Нельзя удалить товар на: " + price);

                    }
                }
            }
        }
    }

    public double getFinalPrice() {
        return totalPrice * (1 - discountPercent / 100.0);
    }

    public void printOrderInfo() {
        System.out.println("Заказ " + "#" + id);
        System.out.println("Клиент: " + customerName);
        System.out.println("Статус: " + status);
        System.out.println("Количество товаров: " + itemsCount);
        System.out.println("Сумма без скидок: " + totalPrice);
        System.out.println("Скидка: " + discountPercent);
        System.out.println("\nИтого: " + getFinalPrice());
    }


    public void confirm() {
        if (status.equals("NEW")) {
            status = "CONFIRMED";
            System.out.println("заказ потвержден");
        } else {
            System.out.println("\nНельзя отправить заказ. Статус должен быть NEW");
        }
    }

    public void ship() {
        if (status.equals("CONFIRMED")) {
            status = "SHIPPED";
            System.out.println("заказ отправлен");
        } else {
            System.out.println("\nНельзя отправить заказ. Статус должен быть CONFIRMED.");
        }
    }

    public void deliver() {
        if (status.equals("SHIPPED")) {
            status = "DELIVERED";
            System.out.println("Заказ доставлен");
        } else {
            System.out.println("\nНельзя отправить заказ. Статус должен быть SHIPPED.");
        }
    }

    public void cancel() {
        if (status.equals("NEW") || status.equals("CONFIRMED")) {
            status = "CANCEL";
            System.out.println("Заказ отправлен");
        } else {
            System.out.println("\nНельзя отменить заказ со статусом " + status);
        }
    }
}





