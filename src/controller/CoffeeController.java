package controller;

import model.Coffee;
import repository.CoffeeRepository;

import java.util.ArrayList;

public class CoffeeController implements CoffeeRepository {

    private ArrayList<Coffee> coffeeList = new ArrayList<Coffee>();
    int number = 0;

    @Override
    public void viewProducts() {

    }

    @Override
    public void register(Coffee coffee) {
        coffeeList.add(coffee);
        System.out.println("O Café " + coffee.getName() + " foi cadastrado.");
    }

    @Override
    public void update(Coffee coffee) {

    }

    @Override
    public void delete(int serialNumber) {

    }

    @Override
    public void searchBySerialNumber(int serialNumber) {

    }

    public int generateSerialNumber() {
        return ++ number;
    }

    public Coffee searchOnCollection(int serialNumber) {
        for(var coffee: coffeeList) {
            if(coffee.getSerialNumber() == serialNumber) {
                return coffee;
            }
        }
        return null;
    }
}
