import java.util.Scanner;

public class uri1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int A, B, C, D, dif;

        // leitura dos dados
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        // processamento de dados
        dif = A * B - C * D;

        // saída
        System.out.println("DIFERENCA = " + dif);

        sc.close();
    }
}
