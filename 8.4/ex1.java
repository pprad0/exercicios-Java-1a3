import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

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
