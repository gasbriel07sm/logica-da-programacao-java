import java.util.Locale;
import java.util.Scanner;

public class uri1004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int x, y, prod;

        // leitura de dados
        x = sc.nextInt();
        y = sc.nextInt();

        // processamento de dados
        prod = x*y;

        // saída
        System.out.println("PROD = " + prod);

        sc.close();
    }
}
