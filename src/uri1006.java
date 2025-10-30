import java.util.Locale;
import java.util.Scanner;

public class uri1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        double x, y, z, med;

        // leitura de dados
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();

        // processamento de dados
        med = (x*2.0+y*3.0+z*5.0) / 10.0;

        // saída
        System.out.printf("MEDIA = %.1f\n", med);

        sc.close();
    }
}

