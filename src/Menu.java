import controller.CoffeeController;
import model.GourmetCoffee;
import model.SpecialCoffe;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CoffeeController coffees = new CoffeeController();
        String coffeeName, coffeeBrand, coffeeDescription, coffeeAroma;
        Double coffeePrice;
        int option, coffeeType, coffeeIntensity;

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

            option = sc.nextInt();

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
                            coffees.register(new GourmetCoffee(coffees.generateSerialNumber(), coffeeName,
                                    coffeeBrand, coffeeAroma, coffeeDescription, coffeePrice, coffeeType));
                        case 2:
                            do {
                                System.out.println("Digite a escala de intensidade de 1 a 5 (do mais fraco ao mais forte amargor) :");
                                coffeeIntensity = sc.nextInt();
                            }
                            while (coffeeIntensity <= 0 || coffeeIntensity > 5);
                            coffees.register(new SpecialCoffe(coffees.generateSerialNumber(), coffeeName,
                                    coffeeBrand, coffeeAroma, coffeeIntensity, coffeeDescription, coffeePrice, coffeeType));
                    }
                    keyPress();
                    break;
                case 2:
                    //Exibicao
                    keyPress();
                    break;
                case 3:
                    //Busca por café
                    keyPress();
                    break;
                case 4:
                    //Atualizar
                    keyPress();
                    break;
                case 5:
                    //Deletar
                    keyPress();
                    break;
                default:
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