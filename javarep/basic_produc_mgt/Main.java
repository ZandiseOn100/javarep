package basic_produc_mgt;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        productManager.addProduct(new Product("Eggs", 1, 60));
        productManager.addProduct(new Product("Milk", 2, 55.9));
        productManager.addProduct(new Product("Bacon", 3, 70.99));

        // Display all items
        System.out.println("Displaying items:\n");
        productManager.displayAllProducts();

        // Remove item
        productManager.removeProductById(2);
        
        // Display all items after removal
        System.out.println("After Removal:");
        productManager.displayAllProducts();
    }
}
