import java.util.Locale;
import java.util.Scanner;

public class uri1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        double a,b,c, aux;

        // leitura de dados
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        // condicionais com processamento de dados
        if (b > a && b > c){
            aux = a;
            a = b;
            b = aux;
        } else if (c > a && c > b){
            aux = a;
            a = c;
            c = aux;
        }

        if (a >= b + c){
            System.out.println("Não forma triângulo");
        } else if (Math.pow(a,2) == Math.pow(b,2) + Math.pow(c,2)){
            System.out.println("TRIÂNGULO RETÂNGULO");
        } else if (Math.pow(a,2) > Math.pow(b,2) + Math.pow(c,2)){
            System.out.println("TRIÂNGULO OBSTUSÂNGULO");
        } else if (Math.pow(a,2) < Math.pow(b,2) + Math.pow(c,2)){
            System.out.println("TRIÂNGULO ACUTÂNGULO");
        }

        if (a == b && b == c){
            System.out.println("TRIÂNGULO EQUILÁTERO");
        } else if ((a == b && a != c) || (b == c && b != a) || (a == c && a != b)){
            System.out.println("TRIÂNGULO ISÓCELES");
        } else {
            System.out.println("TRIÂNGULO ESCALENO");
        }

        sc.close();

    }
}
