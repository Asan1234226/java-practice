package классы_и_объекты;
public class Test {
    public static void main(String[] args) {
        Category juice = new Category();
        juice.name = "Напитки";

        Product cocoCola = new Product("Coco Cola", 780);
        juice.addProduct(cocoCola);

        Product rich = new Product("Rich", 900);
        juice.addProduct(rich);

        Product fanta = new Product("Fanta", 600);
        juice.addProduct(fanta);
        juice.display();

        System.out.println("Сумма всех товаров: " + juice.getProductsSum());
        System.out.println("Средние  стоимость всех товаров: " + juice.getAverageSum());
        System.out.println(juice.contains("Coco Cola"));
        System.out.println(juice.contains("Coco Coff"));
        Product mostExpensiveProduct = juice.getMostExpensiveProduct();
        System.out.println("Самый дорогой товар название : " + mostExpensiveProduct.name);
        System.out.println("Самый дорогой товар цена : " + mostExpensiveProduct.price);
        Product mostCheapProduct = juice.getChepeastProduct();
        System.out.println("Самый дешевый товар название : " + mostCheapProduct.name);
        System.out.println("Самый дешевый товар цена : " + mostCheapProduct.price);


        Category fruits = new Category();
        fruits.name = "Фрукты";

        Product apple = new Product("Apple", 1200);
        fruits.addProduct(apple);

        Product banana = new Product("Banana", 1500);
        fruits.addProduct(banana);
        fruits.display();

        System.out.println("Сумма всех товаров: " + fruits.getProductsSum());
        System.out.println("Средние  стоимость всех товаров: " + fruits.getAverageSum());

    }
}
