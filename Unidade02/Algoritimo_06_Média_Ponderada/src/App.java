import java.util.Locale;
import java.util.Scanner;

public class App {

    public static final double PESO_NOTA_1 = 2.0;
    public static final double PESO_NOTA_2 = 3.0;
    public static final double  SOMA_PESOS = PESO_NOTA_1 + PESO_NOTA_2;
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("*** CALCULADOR DE MÉDIA PONDERADA ***");
        System.out.print("Digite a primeira nota: ");
        double nt1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nt2 = sc.nextDouble();
        double mp = (nt1 * PESO_NOTA_1 + nt2*PESO_NOTA_2) / SOMA_PESOS;
        System.out.printf("Média Ponderada = %.2f", mp);

        sc.close();

    }
}
