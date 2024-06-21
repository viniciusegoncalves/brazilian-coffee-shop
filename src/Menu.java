import controller.CoffeeController;
import model.GourmetCoffee;
import model.SpecialCoffe;
import model.Supplier;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CoffeeController coffees = new CoffeeController();
        String coffeeName, coffeeBrand, coffeeDescription, coffeeAroma;
        Double coffeePrice = 0.0;
        int option, coffeeType, coffeeIntensity = 0, serialNumber;
        boolean success = false;


        //Teste
        Supplier supplier01 = new Supplier("Rua dos bobo","123525436","CafeBr");

        GourmetCoffee gourmetCoffee = new GourmetCoffee(coffees.generateSerialNumber(),"Café Fresco",
                "Brasil Cafés",
                "Flores","O Café PERFEITO para o seu paladar.", 15.60,1);

        SpecialCoffe specialCoffe = new SpecialCoffe(coffees.generateSerialNumber(), "Café Mega Fresco",
                "Brasil Cafés Especiais","Frutado", 4,
                "Café mega ESPECIAL", 29.90, 2);

        coffees.register(gourmetCoffee);
        coffees.register(specialCoffe);



        while (true) {

            System.out.println("Bem vindo ao Brazilian Coffee Shop!!");
            System.out.println("Selecione a opçao desejada");
            System.out.println("*****************************************************");
            System.out.println("1 - Cadastar um produto");
            System.out.println("2 - Exibir produtos");
            System.out.println("3 - Buscar por serial number");
            System.out.println("4 - Atualizar informaçoes de um produto");
            System.out.println("5 - Deletar um produto");
            System.out.println("6 - Sair");
            System.out.println("*****************************************************");

            try {
                option = sc.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Digite valores inteiros!");
                sc.nextLine();
                option = 0;
            }

            if (option == 6) {
                about();
                sc.close();
                System.exit(0);
            }

            switch (option) {
                case 1:
                    System.out.println("Digite o nome do café que deseja cadastrar: ");
                    sc.skip("\\R?");
                    coffeeName = sc.nextLine();
                    System.out.println("Digite a marca do café: ");
                    sc.skip("\\R?");
                    coffeeBrand = sc.nextLine();

                    while (!success) {
                        try {
                            System.out.println("Informe o preço da unidade em reais (R$): ");
                            sc.skip("\\R?");
                            coffeePrice = sc.nextDouble();
                            success = true;
                        } catch (InputMismatchException e) {
                            System.out.println("O valor deve ser número e as casas decimais devem ser separadas por ponto (.)\n");
                            sc.nextLine();
                        }
                    }

                    sc.nextLine();
                    System.out.println("Insira uma descriçao para o produto: ");
                    sc.skip("\\R?");
                    coffeeDescription = sc.nextLine();
                    System.out.println("Insira o Aroma do café: ");
                    sc.skip("\\R?");
                    coffeeAroma = sc.nextLine();
                    do {
                        System.out.println("Para café Gourmet digite 1 ");
                        System.out.println("Para café Especial digite 2 ");
                        coffeeType = sc.nextInt();
                    } while (coffeeType < 1 && coffeeType > 2);

                    switch (coffeeType) {
                        case 1:
                            coffees.register(new GourmetCoffee(coffees.generateSerialNumber(), coffeeName,
                                    coffeeBrand, coffeeAroma, coffeeDescription, coffeePrice, coffeeType));
                            break;
                        case 2:
                            do {
                                try {
                                    System.out.println("Digite a escala de intensidade de 1 a 5 (do mais fraco ao mais forte amargor) :");
                                    coffeeIntensity = sc.nextInt();
                                } catch (InputMismatchException e) {
                                    System.out.println("O valor deve ser um número inteiro de 1 a 5\n");
                                    sc.nextLine();
                                }
                            }
                            while (coffeeIntensity <= 0 || coffeeIntensity > 5);
                            coffees.register(new SpecialCoffe(coffees.generateSerialNumber(), coffeeName,
                                    coffeeBrand, coffeeAroma, coffeeIntensity, coffeeDescription,coffeePrice, coffeeType));
                            break;
                    }
                    keyPress();
                    break;
                case 2:
                    coffees.viewProducts();
                    keyPress();
                    break;
                case 3:
                    System.out.println("Digite o serial number do produto: ");
                    serialNumber = sc.nextInt();
                    coffees.searchBySerialNumber(serialNumber);
                    keyPress();
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Digite o serial number do produto: ");
                    serialNumber = sc.nextInt();
                    var searchCoffee = coffees.searchOnCollection(serialNumber);
                    if (searchCoffee != null) {
                        sc.nextLine();
                        System.out.println("Digite o nome do café que deseja cadastrar: ");
                        sc.skip("\\R?");
                        coffeeName = sc.nextLine();
                        System.out.println("Digite a marca do café: ");
                        sc.skip("\\R?");
                        coffeeBrand = sc.nextLine();
                        System.out.println("Informe o preço da unidade: ");
                        sc.skip("\\R?");
                        coffeePrice = sc.nextDouble();
                        System.out.println("Insira uma descriçao para o produto: ");
                        sc.skip("\\R?");
                        coffeeDescription = sc.nextLine();
                        System.out.println("Insira o Aroma do café: ");
                        sc.skip("\\R?");
                        coffeeAroma = sc.nextLine();

                        do {
                            System.out.println("Para café Gourmet digite 1 ");
                            System.out.println("Para café Especial digite 2 ");
                            coffeeType = sc.nextInt();
                        } while (coffeeType < 1 && coffeeType > 2);

                        switch (coffeeType) {
                            case 1:
                                coffees.update(new GourmetCoffee(serialNumber, coffeeName,
                                        coffeeBrand, coffeeAroma, coffeeDescription, coffeePrice, coffeeType));
                                break;
                            case 2:
                                do {
                                    System.out.println("Digite a escala de intensidade de 1 a 5 (do mais fraco ao mais forte amargor) :");
                                    coffeeIntensity = sc.nextInt();
                                }
                                while (coffeeIntensity <= 0 || coffeeIntensity > 5);
                                coffees.update(new SpecialCoffe(serialNumber, coffeeName,
                                        coffeeBrand, coffeeAroma, coffeeIntensity, coffeeDescription, coffeePrice, coffeeType));
                                break;
                        }
                    } else {
                        System.out.println("Serial number inválido!");
                    }
                    keyPress();
                    break;
                case 5:
                    System.out.println("Digite o serial number do produto : ");
                    serialNumber = sc.nextInt();
                    coffees.delete(serialNumber);
                    keyPress();
                    break;
                default:
                    keyPress();
                    break;
            }

        }
    }

    public static void about() {
        System.out.println("Este projeto foi desenvolvido por: Vinícius Gonçalves");
        System.out.println("https://github.com/viniciusegoncalves");
    }

    public static void keyPress() {
        try {
            System.in.read();
        } catch (IOException e) {
            System.out.println("Voce deve pressionar a tecla enter!");
        }
    }
}