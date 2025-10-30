import java.util.Locale;
import java.util.Scanner;

public class uri1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int km;
        double litros, consumo;

        // leitura de dados
        km = sc.nextInt();
        litros = sc.nextDouble();

        // processamento de dados
        consumo = km / litros;

        // saída
        System.out.printf("%.3f km/l%n", consumo);

        sc.close();
    }
}
