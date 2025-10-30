import java.util.Locale;
import java.util.Scanner;

public class uri1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        double x1, y1, x2, y2, distancia;

        // leitura dos dados
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        // processamento dos dados
        distancia = Math.sqrt(Math.pow((x2-x1), 2.0) + Math.pow((y2-y1), 2.0));

        // saída
        System.out.printf("%.4f\n", distancia);

        sc.close();
    }
}
