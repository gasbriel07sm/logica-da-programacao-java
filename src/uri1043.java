import java.util.Locale;
import java.util.Scanner;

public class uri1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        double l1, l2, l3, area, perimetro;

        // leitura de dados
        l1 = sc.nextDouble();
        l2 = sc.nextDouble();
        l3 = sc.nextDouble();

        // condicional
        if ((l1 + l2 > l3) && (l2 + l3 > l1) && (l2 < l1 + l3)){
            perimetro = l1 + l2 + l3;
            System.out.printf("Perimetro = %.1f%n",perimetro);
        } else {
            area = ((l1 +l2)*l3)/2;
            System.out.printf("Area = %.1f%n",area);
        }

        sc.close();

    }
}
