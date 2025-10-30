import java.util.Locale;
import java.util.Scanner;

public class vetores04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] vet = new double[N];
        double totalNotas = 0, media = 0;

        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextDouble();
            totalNotas += vet[i];
        }
        media = totalNotas / N;
        System.out.printf("%.3f %n", media);

        for (int i = 0; i < N; i++) {
            if (vet[i] < media){
                System.out.printf("%.1f %n", vet[i]);
            }
        }

        sc.close();
    }
}
