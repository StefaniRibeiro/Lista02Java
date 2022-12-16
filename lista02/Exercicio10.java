package lista02;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		float valorA, valorB, valorC;

		System.out.println("Informe um valor: ");
		valorA = sc.nextFloat();

		System.out.println("Informe outro valor: ");
		valorB = sc.nextFloat();

		valorC = valorA;
		valorA = valorB;
		valorB = valorC;

		System.out.printf("\nO valor de A � igual a: %.2f", valorA);
		System.out.printf("\nO valor de B � igual a: %.2f", valorC);

		sc.close();
	}

}