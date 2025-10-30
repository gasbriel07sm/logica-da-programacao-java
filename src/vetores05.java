import java.util.Locale;
import java.util.Scanner;

public class vetores05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vet = new int[N];
        int valorPar = 0, totalPar = 0;
        double media;

        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();
            if (vet[i] % 2 == 0){
                valorPar += vet[i];
                totalPar++;
            }
        }

        if (totalPar == 0) {
            System.out.println("Nao havia nenhum numero par");
        }
        else {
            media = valorPar / totalPar;
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
