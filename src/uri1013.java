import java.util.Scanner;

public class uri1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int x, y, z, k, t;

        // leitura de dados
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        // processamento de dados (k = maior de xy e o t é o maior de xy com z)
        k = (x + y + Math.abs(x - y)) / 2; // maior de x e y
        t = (k + z + Math.abs(k - z)) / 2; // maior de k e z, logo maior de x,y e z

        // saída
        System.out.println(t + " eh o maior");

        sc.close();
    }
}
