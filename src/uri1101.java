
import java.util.Scanner;

public class uri1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma  = 0;
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        while (m != 0 && n != 0){
            if (m > n){
                for (int i = n; i <= m; i++){
                    System.out.print(i + " ");
                    soma += i;
                }
                System.out.println("Soma = " +soma);
            }
            else if (m < n){
                for (int i = m; i <= n; i++){
                    System.out.println(i);
                    soma += i;
                }
                System.out.println("Soma = " +soma);
            }

            m = sc.nextInt();
            n = sc.nextInt();
        }

    }
}
