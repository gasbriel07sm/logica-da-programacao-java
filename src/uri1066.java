
import java.util.Scanner;

public class uri1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, totalPar = 0, totalImpar = 0, totalPositivo = 0, TotalNegativo = 0;
        int i;


        for (i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();

            if (num%2 == 0){
                    totalPar++;
            }
            else {
                    totalImpar++;
            }

            if (num > 0){
                totalPositivo++;
            }
            else if (num < 0){
                TotalNegativo++;
            } 
        }
        System.out.println(totalPar + " valores par(es)");
        System.out.println(totalImpar + " valores impar(es)");
        System.out.println(totalPositivo + " valores positivo(s)");
        System.out.println(TotalNegativo + " valores negativo(s)");

        sc.close();
    }
}
