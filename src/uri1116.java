import java.util.Locale;
import java.util.Scanner;

public class uri1116 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntd = sc.nextInt();
        
        for (int i = 1; i <= qntd; i++){
            double num1 = sc.nextInt();
            double num2 = sc.nextInt();

            if (num2 == 0){
                System.out.println("divisão impossível");
            }

            double resultado = num1/num2;
            System.out.printf("%.1f%n", resultado);
            
        }
    }
}
