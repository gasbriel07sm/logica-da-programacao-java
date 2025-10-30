import java.util.Scanner;

public class uri1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, i;

        System.out.print("Digite um número: ");
        num = sc.nextInt();


        i = 0;
        for (; i < 6; ) {
            if (num % 2 != 0) {
            System.out.println(num);
            i++;
            }
            num++;
        }


        sc.close();
    }
}
