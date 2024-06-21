package model;

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

    @Override
    public void viewAll() {
        super.viewAll();
        System.out.println("Grau de intensidade/Amargor: " + getIntensity() + "/5");
    }
}
