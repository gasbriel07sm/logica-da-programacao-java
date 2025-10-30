
import java.util.Scanner;

public class uri1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qntd = sc.nextInt();

        for (int i = 1; i <= qntd; i++ ){
            int num = sc.nextInt();

            if (num % 2 == 0 && num > 0){
                System.out.printf("EVEN %n");
            } 
            else if (num % 2 == 0 && num < 0) {
                System.out.printf("EVEN NEGATIVE %n");
            } 
            else if (num % 2 != 0 && num > 0){
                System.out.printf("ODD POSITIVE %n");
            }
            else if (num % 2 != 0 && num < 0){
                System.out.printf("ODD NEGATIVE %n");
            } 
            else {
                System.out.printf("NULL %n");
            }
        }
    }
}
