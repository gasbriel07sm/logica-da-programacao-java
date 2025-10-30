import java.util.Locale;
import java.util.Scanner;

public class vetores09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] nomes = new String[N];
        double[] precoCompra = new double[N];
        double[] precoVenda = new double[N];
        double valorTotalCompra = 0;
        double valorTotalVenda = 0;
        double lucroTotal = 0;
        double[] lucro = new double[N];
        int lucroBaixo = 0;
        int lucroEntre = 0;
        int lucroAcima = 0;

        for (int i = 0; i < N; i++) {
            nomes[i] = sc.next();
            precoCompra[i] = sc.nextDouble();
            precoVenda[i] = sc.nextDouble();

            valorTotalVenda += precoVenda[i];
            valorTotalCompra += precoCompra[i];
        }

        for (int i = 0; i < N; i++) {
            lucro[i] = ((precoVenda[i] - precoCompra[i]) / precoCompra[i]) * 100;

            if (lucro[i] < 10){
                lucroBaixo++;
            }
            else if (lucro[i] >= 10 && lucro[i] <= 20){
                lucroEntre++;
            }
            else if (lucro[i] > 20){
                lucroAcima++;
            }
        }

        lucroTotal = valorTotalVenda - valorTotalCompra;
        System.out.printf("Lucro abaixo de 10%%: %d%n", lucroBaixo);
        System.out.printf("Lucro entre 10%% e 20%%: %d%n", lucroEntre);
        System.out.printf("Lucro acima de 20%%: %d%n", lucroAcima);
        System.out.printf("Valor total da compra: %.2f%n", valorTotalCompra);
        System.out.printf("Valor total da venda: %.2f%n", valorTotalVenda);
        System.out.printf("Lucro total: %.2f%n", lucroTotal);

        sc.close();
    }
}
