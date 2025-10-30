
import java.util.Scanner;

public class uri1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int num = 1;
        int soma = 0;

        num = sc.nextInt();

        while (num != 0){
            if (num % 2 != 0){
                num += 1;
            }
            
            soma = num + num + 2 + num + 4 + num + 6 + num+ 8;
            System.out.println(soma);
			
			num = sc.nextInt();

            
        }
    }
}
