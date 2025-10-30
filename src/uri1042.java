import java.util.Scanner;

public class uri1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int num1, num2, num3, menor, meio, maior;

        // leitura de dados
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        // processamento de dados ordem crescente
        if ((num1 <= num2) && (num1 <= num3)){
            menor = num1;
            if (num2 <= num3){
                meio = num2;
                maior = num3;
            } else {
                meio = num3;
                maior = num2;
            }
        } else if ((num2 <= num1) && (num2 <= num3)){
            menor = num2;
            if (num1 <= num3){
                meio = num1;
                maior = num3;
            } else {
                meio = num3;
                maior = num1;
            }
        } else {
            menor = num3;
            if (num2 <= num1){
                meio = num2;
                maior = num1;
            } else {
                meio = num1;
                maior = num2;
            }
        }

        // Saída em ordem crescente
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        System.out.println();

        // Saída na ordem original
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        sc.close();
    }
}
