import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("*** CALCULADOR DE DESCONTOS ***");
        System.out.print("Digite o preço: ");
        double prec = sc.nextDouble();
        System.out.print("Digite o percentual do desconto: ");
        double perc = sc.nextDouble();

        double novo = (prec - (prec * perc/100));

        System.out.printf("Novo preço R$%.2f " , novo);

        sc.close();
    }
}
