import java.util.Locale;
import java.util.Scanner;

public class uri1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        // peça 1 -> leitura
        cod1 = sc.nextInt();
        qte1 = sc.nextInt();
        preco1 = sc.nextDouble();

        // peça 2 -> leitura
        cod2 = sc.nextInt();
        qte2 = sc.nextInt();
        preco2 = sc.nextDouble();

        // processamento de dados
        total = preco1 * qte1 + preco2 * qte2;

        // saída
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}