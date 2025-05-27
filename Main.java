import java.util.Scanner;

public class Main {

    public static double raizQuadrada(double x) throws NegativeNumber {
        if(x<0) {
            throw new NegativeNumber("Nao e possível calcular a raiz quadrada");
        }
        return Math.sqrt(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double x  = sc.nextDouble();

        try {
            double resultado = raizQuadrada(x);
            System.out.println("A raiz quadrada e: " + resultado);
        } catch(NegativeNumber e) {
            System.err.println("Numero negativo!");
        } finally {
            sc.close();
        }
    }
}
