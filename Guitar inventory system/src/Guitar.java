public class Guitar {
    String brand;
    String model;
    String type;
    double price;
    String serialNumber;

    public Guitar(String brand, String model, String type, double price, String serialNumber) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
        this.serialNumber = serialNumber;
    }


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

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Guitar [Brand=" + brand + ", Model=" + model + ", Type=" + type + ", Price=$" + price + ", SerialNumber=" + serialNumber + "]";
    }
}