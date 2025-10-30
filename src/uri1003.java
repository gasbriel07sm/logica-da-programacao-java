import java.util.Scanner;

public class uri1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int A, B, soma;

        // leitura dos dados
        A = sc.nextInt();
        B = sc.nextInt();

        // processamento de dados
        soma = A + B;

        // saída
        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
