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
                sc.close();
                System.exit(0);
            }

            switch (option) {

                case 1:
                    //Cadastro
                    break;
                case 2:
                    //Exibicao
                    break;
                case 3:
                    //Busca por café
                    break;
                case 4:
                    //Atualizar
                    break;
                case 5:
                    //Deletar
                    break;
                case 6:
                    break;
                default:
                    break;
            }

        }
    }
}