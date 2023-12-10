import java.util.Scanner;

public class ex901 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numA, numB, numC, somaAB;

        System.out.println("Digite o numero A:");

        numA = leia.nextInt();

        System.out.println("Digite o número B:");

        numB = leia.nextInt();

        System.out.println("Digite o número C:");

        numC = leia.nextInt();

        somaAB = numA + numB;

        if (somaAB == numC) {
            System.out.println("A soma de A + B é igual a C.");

        } else if (somaAB > numC) {
            System.out.println("A soma de A + B é maior que C.");

        } else {
            System.out.println("A soma de A + B é menor que C.");
        }
    }
}
