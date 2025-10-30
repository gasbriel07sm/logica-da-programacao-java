import java.util.Locale;
import java.util.Scanner;

public class vetores07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] nota1 = new double[N];
        double[] nota2 = new double[N];
        double[] media = new double[N];
        String[] nomes = new String[N];

        for (int i = 0; i < N; i++) {
            nomes[i] = sc.next();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < N; i++) {
            media[i] = (nota1[i] + nota2[i])/2;

            if (media[i] >= 6.0){
                System.out.printf("%s%n", nomes[i]);
            }
        }
        sc.close();
    }
}
