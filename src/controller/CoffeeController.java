package controller;

import model.Coffee;
import repository.CoffeeRepository;

import java.util.ArrayList;

public class CoffeeController implements CoffeeRepository {

    private ArrayList<Coffee> coffeeList = new ArrayList<Coffee>();
    int number = 0;

    @Override
    public void viewProducts() {
        for (Coffee coffee : coffeeList) {
            coffee.viewAll();
        }
    }

    @Override
    public void register(Coffee coffee) {
        coffeeList.add(coffee);
        System.out.println("O produto " + coffee.getName() + " foi cadastrado.");
    }

    @Override
    public void update(Coffee coffee) {
        var searchCoffee = searchOnCollection(coffee.getSerialNumber());
        if (searchCoffee != null) {
            System.out.println(coffee.getSerialNumber());
            coffeeList.set(coffeeList.indexOf(searchCoffee), coffee);
            System.out.println("A café de serial number: " + coffee.getSerialNumber() + " foi atualizado com sucesso!");
        } else {
            System.out.println("O café de serial number: " + coffee.getSerialNumber() + " nao foi encontrada!");
        }
    }

    @Override
    public void delete(int serialNumber) {
        var coffee = searchOnCollection(serialNumber);

        if(coffee != null) {
            if(coffeeList.remove(coffee) == true)
                System.out.println("A café de serial numero: " + serialNumber + " foi deletado com sucesso!");
        } else {
            System.out.println("A café de serial numero: " + serialNumber + " nao foi encontrado!" );
        }
    }

    @Override
    public void searchBySerialNumber(int serialNumber) {
        var coffee = searchOnCollection(serialNumber);

        if (coffee != null)
            coffee.viewAll();
        else
            System.out.println("O café com serial number: " + serialNumber + " nao foi encontrado!");
    }

    public int generateSerialNumber() {
        return ++number;
    }

    public Coffee searchOnCollection(int serialNumber) {
        for (var coffee : coffeeList) {
            if (coffee.getSerialNumber() == serialNumber) {
                return coffee;
            }
        }
        return null;
    }
}
