
import java.util.Scanner;

public class uri1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pum = 1;
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.printf("%d %d %d PUM%n", pum, pum+1, pum+2);
            pum += 4;
        }

    }
}
