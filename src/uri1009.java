import java.util.Locale;
import java.util.Scanner;

public class uri1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        double salario, vendas, total;

        // leitura dos dados
        nome = sc.next();
        salario = sc.nextDouble();
        vendas = sc.nextDouble();

        // processamento de dados
        total = salario + vendas * 0.15;

        // saída
        System.out.printf("TOTAL = R$ %.2f%n", total);

        sc.close();
    }
}

