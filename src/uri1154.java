
import java.util.Locale;
import java.util.Scanner;

public class uri1154 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int idade = 0;
        int totalIdade = 0, somaIdade = 0;
        double media = 0.0;

        while (idade >= 0){
            idade = sc.nextInt();
            totalIdade +=1;
            somaIdade += idade;
        }

        media = somaIdade/totalIdade;
        System.out.printf("%.2f", media);

    }
}
