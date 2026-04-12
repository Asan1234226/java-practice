public class Product {
    String name;
    int price;

        void  compareTo(Product otherProduct) {
            if (price  < otherProduct.price) {
                System.out.println  (name + "  дешевле чем " + otherProduct.name + "  на " + (otherProduct.price - price));
            } else if (price > otherProduct.price) {
                System.out.println(name + " дороже чем " + otherProduct.name + " на " + (price - otherProduct.price));
            } else  {

                System.out.println(name + " и " + otherProduct.name + " имеют одинкаковую цену");

            }
        }
    }




