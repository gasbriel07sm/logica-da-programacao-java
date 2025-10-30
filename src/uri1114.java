
import java.util.Scanner;

public class uri1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 0;

        int senhaCorreta = 2002;

        while (senha != senhaCorreta){
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
            if (senha == senhaCorreta){
                System.out.print("Acesso permitido");
                break;
            } else {
                System.out.print("Senha inválida \n");
            }
        }
    }
    
}
