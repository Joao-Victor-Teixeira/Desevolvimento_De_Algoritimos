import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("*** AJUSTAR SALÁRIO ***");  
        System.out.print("Digite o salário atual: ");
        double salAtual = sc.nextDouble();
        double novoSal = 0.0;
        if (salAtual <= 500.0) {
             novoSal = salAtual * 1.20;
        }
        else{
            novoSal = salAtual * 1.10;
        }
        System.out.printf("Novo salário R$ %.2f ." , novoSal);
        sc.close();
    }
}
