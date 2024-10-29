/* Exercicio 04
 DEV: Gabriel Fakelmann
 */
import java.util.Scanner;

public class Exercicio_04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		System.out.print("Digite um número inteiro (maior que zero): ");
		int numero = sc.nextInt();

		int soma = 1;
		boolean Impar = false;

		for (int i = 1; i <= numero; i++) {
			if (i % 2 != 0) {
				soma *= i;
				Impar = true;
			}
		}

		if (Impar) {
			System.out.println("A soma dos números ímpares entre 1 e " + numero + " é: " + soma);
		} else {
			System.out.println("Não há números ímpares entre 1 e " + numero);
		}

		sc.close();
	}
}