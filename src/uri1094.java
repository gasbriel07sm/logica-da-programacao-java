
import java.util.Locale;
import java.util.Scanner;

public class uri1094 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int totalC = 0, totalR = 0, totalS = 0, total = 0;
        int qntd = sc.nextInt();
        char caractere;

        for (int i = 1; i <= qntd; i++){
            int num = sc.nextInt();
            caractere = sc.next().charAt(0);
            total += num;

            if (caractere == 'C'){
                totalC += num;
            }
            else if (caractere == 'S'){
                totalS += num;
            }
            else if (caractere == 'R'){
                totalR += num;
            }
        }

        System.out.printf("Total: %d cobaias %n", total);
        System.out.printf("Total de coelhos: %d%n", totalC);
        System.out.printf("Total de rato: %d%n", totalR);
        System.out.printf("Total de sapo: %d%n", totalS);
        double totalX = totalC + totalR + totalS;

        System.out.printf("Percentual de coelhos:%.2f %% %n", (totalC/totalX)*100);
        System.out.printf("Percentual de ratos: %.2f %% %n", (totalR/totalX)*100);
        System.out.printf("Percentual de sapos: %.2f %% %n", (totalS/totalX)*100);

    }
}
