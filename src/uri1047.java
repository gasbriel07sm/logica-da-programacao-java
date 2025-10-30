import java.util.Scanner;

public class uri1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int horaFinal, horaInicial, duracaoTotal, minutoInicial, minutoFinal, duracaoTotalMin, duracaoTotalH;
        duracaoTotalH = 0;
        duracaoTotalMin = 0;

        // leitura de dados
        System.out.print("Hora inicial: ");
        horaInicial = sc.nextInt();
        System.out.print("Minuto inicial: ");
        minutoInicial = sc.nextInt();

        System.out.print("Hora final: ");
        horaFinal = sc.nextInt();
        System.out.print("Minuto inicial: ");
        minutoFinal = sc.nextInt();

        // condicional
        if (horaFinal > horaInicial){
            // tempo emm minutos
            duracaoTotal = (horaFinal*60 + minutoFinal) - (horaInicial*60 + minutoInicial);
            duracaoTotalH = duracaoTotal / 60;
            duracaoTotalMin = duracaoTotal % 60;
            System.out.printf("O jogo durou %d hora(s) e %d minuto (s)", duracaoTotalH, duracaoTotalMin);
        } else if (horaInicial > horaFinal) {
            duracaoTotal = (1440 - (horaInicial*60 + minutoInicial) + (horaFinal*60 + minutoFinal));
            duracaoTotalH = duracaoTotal / 60;
            duracaoTotalMin = duracaoTotal % 60;
            System.out.printf("O jogo durou %d hora(s) e %d minuto (s)", duracaoTotalH, duracaoTotalMin);
        } else {
            duracaoTotalH = 24;
            duracaoTotalMin = 0;
            System.out.printf("O jogo durou %d hora(s) e %d minuto (s)", duracaoTotalH, duracaoTotalMin);
        }
        sc.close();
    }
}
