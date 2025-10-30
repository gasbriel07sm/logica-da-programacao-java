import java.util.Scanner;

public class uri1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int N, quociente, resto, nota;

        // leitura de dados
        N = sc.nextInt();
        System.out.println(N);

        // processamento de dados e saída
        resto = N;

        // quociente é o valor da quantidade de notas equivalente ao valor lido
        // valor/nota (essa é a operação, porém como queremos o quociente fazemos a expressão abaixo:)
        nota = 100;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;

        nota = 50;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;

        nota = 20;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;

        nota = 10;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;

        nota = 5;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;

        nota = 2;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;

        System.out.println(resto + " nota(s) de R$ 1,00");

        sc.close();
    }
}

