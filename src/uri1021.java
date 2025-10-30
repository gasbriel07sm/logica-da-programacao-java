import java.util.Locale;
import java.util.Scanner;

public class uri1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        double N;
        int quociente, resto, nota, moeda;

        // leitura de dados
        N = sc.nextDouble();

        // Vamos transformar o valor de double para inteiro multiplicando por 100
        // Logo após somamos 0.5 antes de converter, para arredondar de maneira segura

        // processamento de dados
        resto = (int) (N * 100.0 + 0.5);

        // saída
        System.out.println("NOTAS:");

        // o valor de cada nota deve multiplicar por 100 como acima

        // segue a mesma regra do URI1018
        nota = 100;
        quociente = resto / (nota * 100);
        System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
        resto = resto % (nota * 100);

        nota = 50;
        quociente = resto / (nota * 100);
        System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
        resto = resto % (nota * 100);

        nota = 20;
        quociente = resto / (nota * 100);
        System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
        resto = resto % (nota * 100);

        nota = 10;
        quociente = resto / (nota * 100);
        System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
        resto = resto % (nota * 100);

        nota = 5;
        quociente = resto / (nota * 100);
        System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
        resto = resto % (nota * 100);

        nota = 2;
        quociente = resto / (nota * 100);
        System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
        resto = resto % (nota * 100);

        System.out.println("MOEDAS:");

        // o valor de cada moeda é representado em centavos

        moeda = 100;
        quociente = resto / moeda;
        System.out.println(quociente + " moeda(s) de R$ 1.00");
        resto = resto % moeda;

        moeda = 50;
        quociente = resto / moeda;
        System.out.println(quociente + " moeda(s) de R$ 0.50");
        resto = resto % moeda;

        moeda = 25;
        quociente = resto / moeda;
        System.out.println(quociente + " moeda(s) de R$ 0.25");
        resto = resto % moeda;

        moeda = 10;
        quociente = resto / moeda;
        System.out.println(quociente + " moeda(s) de R$ 0.10");
        resto = resto % moeda;

        moeda = 5;
        quociente = resto / moeda;
        System.out.println(quociente + " moeda(s) de R$ 0.05");
        resto = resto % moeda;

        System.out.println(resto + " moeda(s) de R$ 0.01");

        sc.close();
    }
}