import java.util.Locale;
import java.util.Scanner;

public class uri1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntd = sc.nextInt();
        double nota1, nota2, nota3, media = 0;

        for (int i = 1; i <= qntd; i++){
            nota1 = sc.nextDouble();
            nota2 = sc.nextDouble();
            nota3 = sc.nextDouble();
            media = (nota1*2 + nota2*3 + nota3*5)/10.0;

            System.out.printf("média = %.1f%n", media);
        }
        
    }
}
