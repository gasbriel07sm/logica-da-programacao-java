import java.util.Locale;
import java.util.Scanner;

public class uri1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        double salario, novoSalario = 0, reajuste = 0;

        // leitura de dados
        System.out.print("Digite seu salário: ");
        salario = sc.nextDouble();

        // condicional
        if (salario > 0 && salario <= 400.00){
            reajuste = 0.15;
        } else if (salario > 400.00 && salario <= 800.00){
            reajuste = 0.12;
        } else if (salario > 800.00 && salario <= 1200.00){
            reajuste = 0.10;
        } else if (salario > 1200.00 && salario <= 2000.00){
            reajuste = 0.07;
        } else if (salario > 2000.00) {
            reajuste = 0.04;
        }

        // processamento de dados
        novoSalario = salario + (salario * reajuste);

        // saída de dados
        System.out.printf("Novo salário: %.2f %n", novoSalario);
        System.out.printf("Reajuste de ganho: %.2f %n", reajuste * salario);
        System.out.printf("Em percentual: %.0f%% %n", reajuste * 100);

        sc.close();

    }
}
