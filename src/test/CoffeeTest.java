package test;

import model.GourmetCoffee;
import model.SpecialCoffe;
import model.Supplier;

public class CoffeeTest {
    public static void main(String[] args) {
        //TESTANDO
        Supplier supplier01 = new Supplier("Rua dos bobo","123525436","CafeBr");

        GourmetCoffee gourmetCoffee = new GourmetCoffee(1,"Café Fresco",
                "Brasil Cafés",
                "Flores","O Café PERFEITO para o seu paladar.", 15.60,1);

        SpecialCoffe specialCoffe = new SpecialCoffe(2, "Café Mega Fresco",
                "Brasil Cafés Especiais","Frutado", 4,
                "Café mega ESPECIAL", 29.90, 2);

    }
}
