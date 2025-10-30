import java.util.Locale;
import java.util.Scanner;

public class vetores08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int totalHomens = 0;
        int totalMulheres = 0;
        double menor = 0;
        double maior = 0;
        int N = sc.nextInt();
        double[] altura = new double[N];
        char[] sexo = new char[N];
        double media = 0;

        for (int i = 0; i < N; i++) {
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
        }

        menor = altura[1];
        for (int i = 0; i < N; i++) {
            if (altura[i] > maior){
                maior = altura[i];
            }
            else if (altura[i] < menor){
                menor = altura[i];
            }

            if (sexo[i] == 'F'){
                media += altura[i];
                totalMulheres++;
            }
            else {
                totalHomens++;
            }
        }
        media /= totalMulheres;

        System.out.printf("Menor altura: %.2f %n", menor);
        System.out.printf("Maior altura: %.2f %n", maior);
        System.out.printf("Média das alturas das mulheres: %.2f %n", media);
        System.out.printf("Número de homens: %d %n", totalHomens);

    }
}
