package model;

public class Supplier {
    private String adress;
    private String cnpj;
    private String name;

    public String getName() {
        return name;
    }

    public Supplier(String adress, String cnpj, String name) {
        this.adress = adress;
        this.cnpj = cnpj;
        this.name = name;
    }
}
