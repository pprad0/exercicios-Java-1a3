import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        // a fazer
        Scanner leia = new Scanner(System.in);

        float salario, novoSalario, abono;

        System.out.println("Digite o salário:");

        salario = leia.nextFloat();

        System.out.println("Digite o abono:");

        abono = leia.nextFloat();

        novoSalario = salario + abono;

        System.out.println("\nNovo salário: " + novoSalario);
    }
}
