public class Product {
    private double cost;
    private int quantity;
    private String name;

    public Product(double cost, int quantity, String name) {
        this.cost = cost;
        this.quantity = quantity;
        this.name = name;
    }

    public void totalCost() {
        double total = cost * quantity;
        System.out.println("Total cost of " + quantity + " units of " + name + " is $" + total);
    }

    public void printProduct() {
        System.out.println("One unit of " + name + " costs $" + cost + ", " + quantity + " units were purchased");
    }
}

class Main2 {
    public static void main(String[] args) {
        Product product1 = new Product(10.0, 5, "T-shirt");
        product1.printProduct();
        product1.totalCost();
    }
}
