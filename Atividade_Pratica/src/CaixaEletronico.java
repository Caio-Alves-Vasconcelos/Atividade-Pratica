import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Notas disponíveis
        int nota100 = 100;
        int nota50 = 50;
        int nota20 = 20;
        int nota10 = 10;
        int nota5 = 5;
        int nota2 = 2;

        System.out.print("Digite o valor que deseja sacar: ");
        int valorSaque = scanner.nextInt();

        // Variável para armazenar o valor restante a ser sacado
        int valorRestante = valorSaque;

        // Cálculo da quantidade de notas de 100
        int quantidade100 = valorRestante / nota100;
        valorRestante %= nota100;

        // Cálculo da quantidade de notas de 50
        int quantidade50 = valorRestante / nota50;
        valorRestante %= nota50;

        // Cálculo da quantidade de notas de 20
        int quantidade20 = valorRestante / nota20;
        valorRestante %= nota20;

        // Cálculo da quantidade de notas de 10
        int quantidade10 = valorRestante / nota10;
        valorRestante %= nota10;

        // Cálculo da quantidade de notas de 5
        int quantidade5 = valorRestante / nota5;
        valorRestante %= nota5;

        // Cálculo da quantidade de notas de 2
        int quantidade2 = valorRestante / nota2;
        valorRestante %= nota2;

        // Exibindo a quantidade de notas
        System.out.println("Resultado do saque de R$ " + valorSaque + ":");
        if (quantidade100 > 0) {
            System.out.println(quantidade100 + " nota(s) de R$ 100");
        }
        if (quantidade50 > 0) {
            System.out.println(quantidade50 + " nota(s) de R$ 50");
        }
        if (quantidade20 > 0) {
            System.out.println(quantidade20 + " nota(s) de R$ 20");
        }
        if (quantidade10 > 0) {
            System.out.println(quantidade10 + " nota(s) de R$ 10");
        }
        if (quantidade5 > 0) {
            System.out.println(quantidade5 + " nota(s) de R$ 5");
        }
        if (quantidade2 > 0) {
            System.out.println(quantidade2 + " nota(s) de R$ 2");
        }

        scanner.close();
    }
}