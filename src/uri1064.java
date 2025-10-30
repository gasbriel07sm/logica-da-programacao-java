
import java.util.Scanner;
import  java.util.Locale;
public class uri1064 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int totalValores = 0;
        double valorTotal = 0.0;
        int cont;
        double valor, media;

        for (cont = 1; cont <= 6; cont++) {
            System.out.print("Digite um valor: ");
            valor = sc.nextDouble();

            if (valor > 0){
                totalValores++;
                valorTotal += valor;
            }
        }

        media = (double) valorTotal/totalValores;

        System.out.println(totalValores + " valores positivos");
        System.out.printf("%.1f%n", media);

        sc.close();

    }
}
