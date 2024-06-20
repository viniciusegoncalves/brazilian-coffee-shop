package test;

import model.GourmetCoffee;
import model.SpecialCoffe;
import model.Supplier;

public class CoffeeTest {
    public static void main(String[] args) {
        //TESTANDO
        Supplier supplier01 = new Supplier("Rua dos bobo","123525436","CafeBr");

        GourmetCoffee gourmetCoffee = new GourmetCoffee(1,"Café Fresco",
                "Brasil Cafés", supplier01, "Média",
                "Flores","O Café PERFEITO para o seu paladar.", 15.60);

        SpecialCoffe specialCoffe = new SpecialCoffe(2, "Café Mega Fresco",
                "Brasil Cafés Especiais", supplier01, "Intensa",
                "Frutado", 4,"Café mega ESPECIAL", 29.90);


        System.out.println(gourmetCoffee.getSerialNumber());
        System.out.println(gourmetCoffee.getName());
        System.out.println(gourmetCoffee.getBrand());
        System.out.println(gourmetCoffee.getSupplier().getName());
        System.out.println(gourmetCoffee.getRostedCoffee());
        System.out.println(gourmetCoffee.getAroma());
        System.out.println(gourmetCoffee.getDescription());
        System.out.println(gourmetCoffee.getPrice());

        System.out.println("*************************************************");

        System.out.println(specialCoffe.getSerialNumber());
        System.out.println(specialCoffe.getName());
        System.out.println(specialCoffe.getBrand());
        System.out.println(specialCoffe.getSupplier().getName());
        System.out.println(specialCoffe.getRostedCoffee());
        System.out.println(specialCoffe.getAroma());
        System.out.println(specialCoffe.getDescription());
        System.out.println(specialCoffe.getPrice());
        System.out.println(specialCoffe.getIntensity());
    }
}
