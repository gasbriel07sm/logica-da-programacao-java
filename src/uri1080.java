
import java.util.Scanner;

public class uri1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int posicao = 0;

        for (int i = 1; i <= 10; i++){
            int num = sc.nextInt();

            if (num > maior){
                maior = num;
                posicao = i;
            }
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Posição: " + posicao);
    }
}
