import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new  Scanner(System.in);

        System.out.println("*** DIVISOR DE NÚMEROS ***");
        System.out.println("Digite dois números");
        System.out.print("Primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Segundo número: ");
        double n2 = sc.nextDouble();
        
        if (n2 == 0) {
            System.out.println("Impossível dividir");
        }
        else{
            double d = n1 / n2;
            System.out.printf("Divisão = %.2f ", d);
        }
        sc.close();
    }
}
