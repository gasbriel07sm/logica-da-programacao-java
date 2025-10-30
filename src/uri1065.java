
import java.util.Scanner;

public class uri1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, totalPar = 0;
        int i;


        for (i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            if (num%2 == 0){
                totalPar++;
            }
        }

        System.out.println(totalPar + " valores pares");

        sc.close();

    }
}
