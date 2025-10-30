
import java.util.Scanner;

public class uri1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sc.next(); 
        int diaInicial = sc.nextInt();
        int horaInicial = sc.nextInt();
        sc.next(); 
        int minutoInicial = sc.nextInt();
        sc.next(); 
        int segundoInicial = sc.nextInt();

        sc.next(); 
        int diaFinal = sc.nextInt();
        int horaFinal = sc.nextInt();
        sc.next();
        int minutoFinal = sc.nextInt();
        sc.next(); 
        int segundoFinal = sc.nextInt();


        int inicio = (diaInicial * 86400 + horaInicial * 3600 + minutoInicial * 60 + segundoInicial);
        int fim = (diaFinal * 86400 + horaFinal * 3600 + minutoFinal * 60 + segundoFinal);
        int duracaoTotal = fim - inicio;
            
        int duracaoTotalD = duracaoTotal/86400;
        int resto = duracaoTotal%86400;
        int duracaoTotalH = resto/3600;
        resto %= 3600;
        int duracaoTotalMin = resto/60;
        int duracaoTotalSeg = resto%60;

        System.out.println(duracaoTotalD + " dia (s)");
        System.out.println(duracaoTotalH + " hora (s)");
        System.out.println(duracaoTotalMin + " minuto (s)");
        System.out.println(duracaoTotalSeg + " segundo (s)");

        sc.close();

         
    }
}
