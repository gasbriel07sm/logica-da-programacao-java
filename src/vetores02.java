import java.util.Locale;
import java.util.Scanner;

public class vetores02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int totalPar = 0;
        int N = sc.nextInt();
        int[] vet = new int[N];

        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (vet[i] % 2 == 0){
                System.out.printf("%d ", vet[i]);
                totalPar++;
            }
        }
        System.out.printf("%n%d %n", totalPar);

        sc.close();
    }
}
