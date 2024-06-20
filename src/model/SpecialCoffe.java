package model;

import repository.CoffeeRepository;

public class SpecialCoffe extends GourmetCoffee {
    private int intensity;

    public SpecialCoffe(int serialNumber, String name, String brand,
                        String aroma, int intensity, String description, Double price, int type) {
        super(serialNumber, name, brand, aroma, description, price, type);
        this.intensity = intensity;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }
}
