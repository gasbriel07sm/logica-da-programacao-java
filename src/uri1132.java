
import java.util.Scanner;

public class uri1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2){
            for (int i = num2; i <= num1; i++){
                if (i % 13 != 0){
                    soma += i;
                }
            }
            System.out.println(soma);
        }
        else if (num2 > num1){
            for (int i = num1; i <= num2; i++){
                if (i % 13 != 0){
                    soma += i;
                }
            }
            System.out.println(soma);
        }
    }
}
