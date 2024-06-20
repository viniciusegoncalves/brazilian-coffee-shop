package model;

import repository.CoffeeRepository;

public class GourmetCoffee extends Coffee {
    private String aroma;

    public GourmetCoffee(int serialNumber, String name, String brand,
                         String aroma, String description, Double price, int type) {
        super(serialNumber, name, brand, description, price, type);
        this.aroma = aroma;
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }
}
