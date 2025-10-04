import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("VERIFICADOR DE MÉDIA");
        System.out.println("Digite as notas do aluno");
        System.out.println("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Nota 2: ");
        double nota2 = sc.nextDouble();
        double m = (nota1 + nota2) / 2;
        System.out.printf("Média = %.2f %n", m);
        if (m >= 7) {
            System.out.println("Aprovado.");
        }
        else{
            System.out.println("Reprovado.");
        }

        sc.close();
    }
}
