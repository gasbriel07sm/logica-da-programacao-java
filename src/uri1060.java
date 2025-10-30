import java.util.Scanner;
import  java.util.Locale;

public class uri1060 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int totalValores = 0;
        int cont;
        double valor;

        for (cont = 1; cont <= 6; cont++) {
            System.out.print("Digite um valor: ");
            valor = sc.nextDouble();

            if (valor > 0){
                totalValores++;
            }
        }

        System.out.println(totalValores + " valores positivos");

        sc.close();
    }
}
