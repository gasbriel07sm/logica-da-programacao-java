import java.util.Scanner;

public class uri1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declração de variáveis
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double total;

        // condicionais
        if (codigo == 1) {
            total = quantidade * 4.0;
        }
        else if (codigo == 2) {
            total = quantidade * 4.5;
        }
        else if (codigo == 3) {
            total = quantidade * 5.0;
        }
        else if (codigo == 4) {
            total = quantidade * 2.0;
        }
        else {
            total = quantidade * 1.5;
        }

        // saída de dados
        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}

