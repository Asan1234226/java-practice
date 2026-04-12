package классы_и_объекты2;

public class Test {
    public static void main(String[] args) {
        Product[] products = new Product[10];

        products[0] = new Product("Яблоко", 900, "ФРУКТЫ");
        products[1] = new Product("Апельсин", 1200, "ФРУКТЫ");
        products[2] = new Product("Бананы", 1490, "ФРУКТЫ");
        products[3] = new Product("Помидоры", 1290, "ОВОЩИ");
        products[4] = new Product("Ананас", 4290, "ФРУКТЫ");
        products[5] = new Product("Огурцы", 1190, "ОВОЩИ");
        products[6] = new Product("Курица", 3890, "МЯСО");
        products[7] = new Product("Говядина", 5590, "МЯСО");
        products[8] = new Product("Конина", 6290, "МЯСО");

        Product maxProduct = getMaxProduct(products);
        System.out.println(maxProduct.name + " " + maxProduct.price); // Конина 6290

        Product minProduct = getMinProduct(products);
        System.out.println(minProduct.name + " " + minProduct.price); // яблоко 900
        String maxCountTypeName = getMaxCountTypeName(products);
        System.out.println(maxCountTypeName); // ФРУКТЫ
        double productsSum = getProductsSum(products);
        System.out.println(productsSum); // 26130
        int fruitsCount = getProductsCountyByType(products, "ФРУКТЫ");
        System.out.println(fruitsCount);


        int vegetablesCount = getProductsCountyByType(products, "ОВОЩИ");
        System.out.println(vegetablesCount);

        int dairyCount = getProductsCountyByType(products, "МОЛОЧНЫЕ_ИЗДЕЛИЯ");
        System.out.println(dairyCount);
        filterProductsInRange(products, 1000, 3000);





    }
    static void filterProductsInRange(Product[] products, int min, int max) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].price >= min && products[i].price <= max) {
                        System.out.println(products[i].name);
                }
            }
        }
    }

    static double getProductsSum(Product[] products) {
        double sum = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                sum = sum + products[i].price;
            }
        }
        return sum;
    }

    static String getMaxCountTypeName(Product[] products) {
        int fruits = 0;
        int meat = 0;
        int vegetables = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].type.equals("ФРУКТЫ")) {
                    fruits++;
                } else if (products[i].type.equals("МЯСО")) {
                    meat++;
                } else if (products[i].type.equals("ОВОЩИ")) {
                    vegetables++;
                }
            }
        }
        if (fruits > meat && fruits > vegetables) {
            return "ФРУКТЫ";

        } else if (meat > vegetables && meat > fruits) {
            return "МЯСО";

        } else if (vegetables > meat && vegetables > fruits) {
            return "ОВОЩИ";
        }
        return null;
    }

    static Product getMinProduct(Product[] products) {
        Product min = products[0];
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].price < min.price) {
                    min = products[i];
                }
            }
        }
        return min;
    }

    static Product getMaxProduct(Product[] products) {
        Product max = products[0];
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].price > max.price) {
                    max = products[i];
                }
            }
        }
        return max;
    }

    static int getProductsCountyByType(Product[] products, String type) {
        int fruits = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].type.equals(type)) {
                    fruits++;
                }
            }
        }
        return fruits;

    }
}

