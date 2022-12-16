package lista02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double raio, altura, volume;

		System.out.println("Informe o raio da lata: ");
		raio = sc.nextDouble();
		
		System.out.println("Informe o raio da lata: ");
		altura = sc.nextDouble();
		
		volume = Math.PI * Math.pow(raio, 2) * altura;
		
		System.out.printf("O volume da lata � igual a: %.2f" , volume);
		sc.close();
		
	}

}