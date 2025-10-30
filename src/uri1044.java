import java.util.Scanner;

public class uri1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int num1, num2;

        // leitura de dados
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();

        // condicional + processamento de dados
        if ((num1 % num2 == 0) || (num2 % num1 == 0)){
            System.out.println("São múltiplos");
        } else{
            System.out.println("Não são múltiplos");
        }

        sc.close();
    }
}
