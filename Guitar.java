public class Guitar {
    private String brand;
    private String model;
    private String type; // e.g., electric, acoustic
    private double price;
    private int quantity;

    public Guitar(String brand, String model, String type, double price, int quantity) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}