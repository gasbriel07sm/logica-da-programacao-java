
import java.util.Scanner;

public class uri1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gremio, inter, novoGrenal = 1;
        int vitoriaGremio = 0;
        int vitoriaInter = 0;
        int empate = 0;
        int totalGrenal = 0;

        while (novoGrenal == 1){
            inter = sc.nextInt();
            gremio = sc.nextInt();

            if (gremio > inter){
                vitoriaGremio += 1;
            } 
            else if (gremio == inter){
                empate += 1;
            } 
            else {
                vitoriaInter += 1;
            }
            totalGrenal += 1;

            System.out.print("Novo Grenal (1-sim 2-nao)  ");
            novoGrenal = sc.nextInt();
        }

        System.out.printf("%d grenais %n", totalGrenal);
        System.out.printf("Inter: %d%n", vitoriaInter);
        System.out.printf("Gremio: %d%n", vitoriaGremio);
        System.out.printf("Empates: %d%n", empate);

        if (vitoriaGremio > vitoriaInter){
            System.out.println("Gremio venceu mais");
        } else if (vitoriaInter > vitoriaGremio){
            System.out.println("Inter venceu mais");
        } else {
            System.out.println("Não houve vencedor");
        }
        

    }
}
