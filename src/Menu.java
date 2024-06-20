import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;

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
                    //Cadastro
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

    public static void about(){
        System.out.println("Este projeto foi desenvolvido por: Vinícius Gonçalves");
        System.out.println("https://github.com/viniciusegoncalves");
    }

    public static void keyPress(){
        try {
            System.in.read();
        }
        catch (IOException e) {
            System.out.println("Voce deve pressionar a tecla enter!");
        }
    }
}