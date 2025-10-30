import java.util.Scanner;

public class uri1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um número entre 1 e 1000: ");
        num = sc.nextInt();

        int i;

        for ( i = 1; i <= num; i+=2) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
