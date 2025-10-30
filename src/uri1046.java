import java.util.Scanner;

public class uri1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int horaFinal, horaInicial, duracaoTotal;

        // leitura de dados
        System.out.print("Hora inicial: ");
        horaInicial = sc.nextInt();
        System.out.print("Hora final: ");
        horaFinal = sc.nextInt();

        // condicional
        if (horaFinal > horaInicial){
            duracaoTotal = horaFinal - horaInicial;
            System.out.printf("O jogo durou %d hora(s)", duracaoTotal);
        } else if (horaInicial > horaFinal) {
            duracaoTotal = (24 - horaInicial) + horaFinal;
            System.out.printf("O jogo durou %d hora(s)", duracaoTotal);
        } else {
            duracaoTotal = 24;
            System.out.printf("O jogo durou %d hora(s)", duracaoTotal);
        }

        sc.close();
    }
}
