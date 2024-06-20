package model;

public abstract class Coffee {
    private int serialNumber;
    private String name;
    private String brand;
    private Supplier supplier;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private Double price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Coffee(int serialNumber, String name, String brand, Supplier supplier, String description, Double price) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.brand = brand;
        this.supplier = supplier;
        this.description = description;
        this.price = price;
    }
}
