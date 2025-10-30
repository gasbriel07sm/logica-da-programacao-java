import java.util.Scanner;

public class uri1001 {
    public static void main(String[] args) {
        // inicialização do Scanner para a leitura de dados do teclado pelo System.in
        Scanner sc = new Scanner(System.in);

        // leitura dos dados
        int A = sc.nextInt();
        int B = sc.nextInt();

        // processamento de dados
        int X = A + B;

        // saída
        System.out.println("X = " + X);

        sc.close();
    }
}

