package model;

public class Stock {
    private int amount;
    private SpecialCoffe[] specialCoffe;
    private GourmetCoffee[] gourmetCoffee;

    public Stock(int amount, SpecialCoffe[] specialCoffe) {
        this.amount = amount;
        this.specialCoffe = specialCoffe;
    }

    public Stock(int amount, GourmetCoffee[] gourmetCoffee) {
        this.amount = amount;
        this.gourmetCoffee = gourmetCoffee;
    }
}

