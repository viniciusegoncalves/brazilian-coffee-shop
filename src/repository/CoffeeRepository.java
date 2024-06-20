package repository;

import model.Coffee;
import model.Supplier;

public interface CoffeeRepository {
    public void viewProducts();
    public void register(Coffee coffee);
    public void update(Coffee coffee);
    public void delete(int serialNumber);
    public void searchBySerialNumber(int serialNumber);
}
