import java.util.Locale;
import java.util.Scanner;

public class uri1051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        double valor, novoValor = 0;

        // leitura de dados
        valor = sc.nextDouble();

        // condicional
        if (valor > 0.00 && valor <= 2000.00){
            System.out.println("Isento");
        } else if (valor > 2000.00 && valor <= 3000.00){
            novoValor = (valor - 2000) * 0.08;
        } else if (valor > 3000.00 && valor <= 4500.00){
            novoValor = (valor - 3000) * 0.18 + 1000 * 0.08;
        } else if (valor > 4500.00){
            novoValor = (valor - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
        System.out.printf("R$ %.2f%n", novoValor);
        sc.close();
    }
}
