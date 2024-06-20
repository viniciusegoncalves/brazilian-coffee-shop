package model;

import repository.CoffeeRepository;

public class GourmetCoffee extends Coffee implements CoffeeRepository {
    private String rostedCoffee;
    private String aroma;

    public GourmetCoffee(int serialNumber, String name, String brand, Supplier supplier,
                         String rostedCoffee, String aroma, String description, Double price) {
        super(serialNumber, name, brand, supplier, description, price);
        this.rostedCoffee = rostedCoffee;
        this.aroma = aroma;
    }

    public String getRostedCoffee() {
        return rostedCoffee;
    }

    public void setRostedCoffee(String rostedCoffee) {
        this.rostedCoffee = rostedCoffee;
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    @Override
    public void viewProducts() {

    }

    @Override
    public void register(Coffee coffee) {

    }

    @Override
    public void update(Coffee coffee) {

    }

    @Override
    public void delete(int serialNumber) {

    }

    @Override
    public void registerSupplier(Supplier supplier) {

    }
}
