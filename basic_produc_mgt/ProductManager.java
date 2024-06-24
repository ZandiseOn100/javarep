package basic_produc_mgt;

import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProductById(int productId) {
        products.removeIf(product -> product.getProductId() == productId);
    }

    public void displayAllProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
