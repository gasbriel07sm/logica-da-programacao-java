import java.util.Locale;
import java.util.Scanner;

public class matriz06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[][] mat = new double[N][N];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }

        double somaPositivos = 0.0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] > 0.0) {
                    somaPositivos += mat[i][j];
                }
            }
        }
        System.out.printf("SOMA DOS POSITIVOS: %.1f%n", somaPositivos);

        int linhaEscolhida = sc.nextInt();
        System.out.print("LINHA ESCOLHIDA: ");
        for (int j = 0; j < N; j++) {
            System.out.printf("%.1f ", mat[linhaEscolhida][j]);
        }
        System.out.println();

        int colunaEscolhida = sc.nextInt();
        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < N; i++) {
            System.out.printf("%.1f ", mat[i][colunaEscolhida]);
        }
        System.out.println();

        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < N; i++) {
            System.out.printf("%.1f ", mat[i][i]);
        }
        System.out.println();

        System.out.println("MATRIZ ALTERADA:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] < 0.0) {
                    mat[i][j] = Math.pow(mat[i][j], 2.0);
                }
                System.out.printf("%.1f ", mat[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
