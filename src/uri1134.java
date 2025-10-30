import java.util.Scanner;

public class uri1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (opcao != 4){
            opcao = sc.nextInt();

            if (opcao == 1){
                alcool += 1;
            } else if (opcao == 2){
                gasolina += 1;
            } else if (opcao == 3){
                diesel += 1;
            } else if (opcao == 4){
                break;
            }

        }
            System.out.println("MUITO OBRIGADO");
            System.out.printf("Alcool: %d%n", alcool);
            System.out.printf("Gasolina: %d%n", gasolina);
            System.out.printf("Diesel: %d%n", diesel);
    }
}
