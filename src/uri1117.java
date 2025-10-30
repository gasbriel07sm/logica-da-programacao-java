
import java.util.Locale;
import java.util.Scanner;

public class uri1117 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double media = 0, nota = 0;
        int qntd = 0;

        while (qntd < 2){
            System.out.print("Nota: ");
            nota = sc.nextDouble();
            
            if (nota < 0 || nota > 10){
                System.out.println("Nota inválida");
            } else {
                media += nota;
                qntd++;
            }
        }
        media /= 2;
        System.out.printf("Media = %.2f", media);
    }
}
