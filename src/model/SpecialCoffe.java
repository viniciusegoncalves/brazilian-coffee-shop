package model;

import repository.CoffeeRepository;

public class SpecialCoffe extends GourmetCoffee implements CoffeeRepository {
    private int intensity;

    public SpecialCoffe(int serialNumber, String name, String brand, Supplier supplier,
                        String rostedCoffee, String aroma, int intensity, String description, Double price) {
        super(serialNumber, name, brand, supplier, rostedCoffee, aroma, description, price);
        this.intensity = intensity;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }
}
