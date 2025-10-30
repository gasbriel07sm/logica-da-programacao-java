
import java.lang.classfile.attribute.SourceFileAttribute;
import java.util.Scanner;

public class uri1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dentro = 0;
        int fora = 0;
        int qntd = sc.nextInt();

        for (int i = 1; i <= qntd; i++){
            int num = sc.nextInt();
            if (num >= 10 && num <= 20){
                dentro += 1;
            } else {
                fora += 1;
            }
        }
        System.out.printf("%d in %n", dentro);
        System.out.printf("%d out %n", fora);
    }
}
