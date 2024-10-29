// Exercício 03 - 29/10/24
// DEV: Caio Alves

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int soma = 0;

		System.out.print("Digite um número: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				soma = soma + i;
			}
		}
		System.out.printf("A soma dos números pares entre 1 e " + num + " é: %d", soma);

		sc.close();
	}

}
