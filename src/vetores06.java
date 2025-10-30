import java.util.Scanner;

public class vetores06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] nomes = new String[N];
        int[] idades = new int[N];
        int maior = 0;
        String pessoaMaior = "";

        for (int i = 0; i < N; i++) {
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();

            if (idades[i] > maior){
                maior = idades[i];
                pessoaMaior = nomes[i];
            }
        }

        System.out.printf("Pessoa mais velha: %s%n", pessoaMaior);

        sc.close();
    }
}
