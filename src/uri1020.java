import java.util.Scanner;

public class uri1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int N, anos, meses, dias, resto;

        // leitura de dados
        N = sc.nextInt();

        // processamento de dados
        anos = N / 365;
        resto = N % 365;
        meses = resto / 30;
        dias = resto % 30;

        // saída
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        sc.close();
    }
}

