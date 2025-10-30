import java.util.Scanner;

public class uri1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        String palavra1, palavra2, palavra3;

        // leitura de dados
        System.out.println("Digite a primeira palavra: ");
        palavra1 = sc.next();
        System.out.println("Digite a segunda palavra: ");
        palavra2 = sc.next();
        System.out.println("Digite a terceira palavra: ");
        palavra3 = sc.next();

        // condicional
        if (palavra1.equals("vertebrado")){
            if (palavra2.equals("ave")){
                if (palavra3.equals("carnivoro")){
                    System.out.println("Aguia");
                } else if (palavra3.equals("onivoro")){
                    System.out.println("Pomba");
                }
            } else if (palavra2.equals("mamifero")){
                if (palavra3.equals("onivoro")){
                    System.out.println("Homem");
                } else if (palavra3.equals("herbivoro")){
                    System.out.println("Vaca");
                }
            }
        } else if (palavra1.equals("invertebrado")){
            if (palavra2.equals("inseto")){
                if (palavra3.equals("hematofogo")){
                    System.out.println("Pulga");
                } else if (palavra3.equals("herbivoro")){
                    System.out.println("Largata");
                }
            } else if (palavra2.equals("anelideo")){
                if (palavra3.equals("hematofogo")){
                    System.out.println("Sanguessuga");
                } else if (palavra3.equals("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }
        sc.close();
    }
}
