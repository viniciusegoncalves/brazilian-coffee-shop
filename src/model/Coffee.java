package model;

public abstract class Coffee {
    private int serialNumber;
    private String name;
    private String brand;
    private Supplier supplier;
    private String description;
    private int type;

    public void setType(int type) {
        this.type = type;
    }

    private Double price;

    public int getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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

    public void viewAll() {

        String type = "";

        switch(this.type) {
            case 1:
                type = "Café Gourmet";
                break;
            case 2:
                type = "Café Especial";
                break;
        }

        System.out.println("\n\n***********************************************************");
        System.out.println("Lista de Cafés cadastrados:");
        System.out.println("***********************************************************");
        System.out.println("Nome do café: " + name);
        System.out.println("Marca: " + brand);
        System.out.println("Tipo do café: " + type);
        System.out.println("Preço da unidade: " + price);
        System.out.println("Descriçao do produto: " + description);

    }

    public Coffee(int serialNumber, String name, String brand, String description, Double price, int type) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.price = price;
        this.type = type;
    }
}
