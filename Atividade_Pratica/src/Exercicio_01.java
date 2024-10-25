// Caio Alves
// Simulador de Caixa eletrônico

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nota_100 = 100, cont_cem = 0;
		int nota_50 = 50, cont_cinquenta = 0;
		int nota_20 = 20, cont_vinte = 0;
		int nota_10 = 10, cont_dez = 0;
		int nota_5 = 5, cont_cinco = 0;
		int nota_2 = 2, cont_dois = 0;

		System.out.print("Qual valor deseja sacar: R$");
		int valor = sc.nextInt();

		if (valor < 0) {
			System.out.println("Valor inválido.");
		} else {
//			Calculando o valor da nota de 100
			while (valor >= nota_100) {
				valor -= nota_100;
				cont_cem++;
			}
			while (valor >= nota_50) {
				valor -= nota_50;
				cont_cinquenta++;
			}
			while (valor >= nota_20) {
				valor -= nota_20;
				cont_vinte++;
			}
			while (valor >= nota_10) {
				valor -= nota_10;
				cont_dez++;
			}
			while (valor >= nota_5) {
				if (valor % 5 == 0) {
					valor -= nota_5;
					cont_cinco++;
				} else {
					while (valor >= nota_2) {
						valor -= nota_2;
						cont_dois++;
					}
				}
			}

			System.out.printf("Notas de 100: %d%n", cont_cem);
			System.out.printf("Notas de 50: %d%n", cont_cinquenta);
			System.out.printf("Notas de 20: %d%n", cont_vinte);
			System.out.printf("Notas de 10: %d%n", cont_dez);
			System.out.printf("Notas de 5: %d%n", cont_cinco);
			System.out.printf("Notas de 2: %d%n", cont_dois);
		}

	}

}
