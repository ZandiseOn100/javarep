package basic_produc_mgt;

public class Product {
    private String productName;
    private int productId;
    private double productPrice;

    public Product(String name, int id, double price){
        this.productName = name;
        this.productId = id;
        this.productPrice = price;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return "Product Name = " + productName  + ", Product Id= " + productId + ", Product Price= "+ productPrice ;
    }
}
