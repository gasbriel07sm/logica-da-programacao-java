import java.util.Scanner;

public class matriz07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] mat = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int linhaEscolhida = sc.nextInt();
        int ultimo = mat[linhaEscolhida][N - 1];

        for (int j = N - 1; j > 0; j--) {
            mat[linhaEscolhida][j] = mat[linhaEscolhida][j - 1];
        }

        mat[linhaEscolhida][0] = ultimo;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%d ", mat[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
