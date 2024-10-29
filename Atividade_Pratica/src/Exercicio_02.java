/* Atividade 02: adivinhação
 Dev:Gabriel Fakelmann
 */
import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("------------------");
		System.out.println("-----ADIVINHA-----");
		System.out.println("------------------");
		int num = 0, tentativa;

		while (num <= 0 || num > 100) {
			System.out.print("Digite uma número de 1 a 100: ");
			num = sc.nextInt();
			if (num <= 0 || num > 100) {
				System.out.println("Valor inválido, digite um valor entre 1 a 100");
			}
		}

		boolean acerto = false;
		for (int i = 0; i <= 6; i++) {
			System.out.print("Tente acertar o número digitado anteriormente: ");
			tentativa = sc.nextInt();
			if (tentativa > num) {
				System.out.println("O valor digitado é maior que o número oculto ");
				System.out.println("Restam apenas " + (6 - i) + " tentativas \n");
			} else if (tentativa < num) {
				System.out.println("O valor digitado é menor que o número oculto ");
				System.out.println("Restam apenas " + (6 - i) + " tentativas \n");
			} else if (tentativa == num) {
				System.out.println("PARABÉNS!!! Você acertou o número oculto.");
				acerto = true;
				break;
			}
		}
		if (!acerto) {
			System.out.println("Que pena, acabaram suas tentativas :(");
		}
		sc.close();
	}
}
