package классы_и_объекты;

public class Category {
    String name;
    Product[] products = new Product[10];


    Product getChepeastProduct() {
        Product minProduct = products[0];
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].price < minProduct.price) {
                    minProduct = products[i];
                }
            }
        }
        return minProduct;
    }



Product getMostExpensiveProduct() {
    Product maxProduct = new Product(null, 0);
    for (int i = 0; i < products.length; i++) {
        if (products[i] != null) {
            if (products[i].price > maxProduct.price) {
                maxProduct = products[i];

            }
        }
    }
    return maxProduct;
}

void display() {
    for (int i = 0; i < products.length; i++) {
        if (products[i] != null) {
            System.out.println("Категорий: " + name + " товары: " + products[i].name);
        }
    }
}

void addProduct(Product product) {
    for (int i = 0; i < products.length; i++) {
        if (products[i] == null) {
            products[i] = product;
            break;
        }
    }
}

void removeProduct(Product product) {
    for (int i = 0; i < products.length; i++) {
        if (products[i] == product) {
            products[i] = null;
            break;

        }
    }
}

boolean contains(String productname) {
    for (int i = 0; i < products.length; i++) {
        if (products[i] != null) {
            if (products[i].name == productname) {
                return true;
            }
        }
    }
    return false;

}

double getProductsSum() {
    double sum = 0;
    for (int i = 0; i < products.length; i++) {
        if (products[i] != null) {
            sum = sum + products[i].price;
        }
    }
    return sum;
}

double getAverageSum() {
    double sum = 0;
    double num = 0;
    for (int i = 0; i < products.length; i++) {
        if (products[i] != null) {
            num++;
            sum = sum + products[i].price;
        }
    }
    return sum / num;
}
}