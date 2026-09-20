import java.util.*;

class Product {
    private String productName;
    private int price, quantity;

    public Product(String name, int price, int quantity) {
        this.productName = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getTotal() {
        return price * quantity;
    }

    public String toString() {
        return productName + " x" + quantity + " = " + getTotal();
    }
}

class Order {
    private String orderId;
    private List<Product> products;

    public Order(String id) {
        orderId = id;
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Product p : products)
            sum += p.getTotal();
        return sum;
    }

    public String toString() {
        String res = "Order ID: " + orderId + "\nProducts:\n";
        for (Product p : products)
            res += p + "\n";
        res += "Total: " + calculateTotal();
        return res;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Order o = new Order("ORD101");

        o.addProduct(new Product("Laptop", 50000, 1));
        o.addProduct(new Product("Mouse", 500, 2));
        o.addProduct(new Product("Keyboard", 1500, 1));

        System.out.println(o);
    }
}