import java.util.Locale;
import java.util.Scanner;

public class uri1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int tempo, velocidade;
        double litros;

        // leitura de dados
        tempo = sc.nextInt();
        velocidade = sc.nextInt();

        // processamento de dados
        litros = (double) tempo * velocidade / 12.0;

        // saída
        System.out.printf("%.3f%n", litros);

        sc.close();
    }
}
