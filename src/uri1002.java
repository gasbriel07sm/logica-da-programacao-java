import java.util.Locale;
import java.util.Scanner;

public class uri1002 {
    public static void main(String[] args) {
        // inicialização do Locale para a separação de casas decimais serem o "."
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        double R, A, pi = 3.14159;

        // processamento de dados (raio e área)
        R = sc.nextDouble();
        A = pi * R * R;

        // saída
        System.out.printf("A=%.4f%n", A);

        sc.close();

    }
}