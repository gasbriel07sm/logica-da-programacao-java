import java.util.Locale;
import java.util.Scanner;

public class uri1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int n, resultado;

        // leitura de dados
        n = sc.nextInt();

        // processamento de dados
        resultado = 2 * n;

        // saída
        System.out.println(resultado + " minutos");

        sc.close();
    }
}
