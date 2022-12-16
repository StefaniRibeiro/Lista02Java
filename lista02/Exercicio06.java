package lista02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner sc = new Scanner (System.in);
	
	float fahrenheit, conversaoC;
	
	System.out.println("Informe a temperatura em fahrenheit");
	fahrenheit = sc.nextFloat();
	
	conversaoC = ((fahrenheit - 32)*5)/9;
	
	System.out.printf("\nO resultado da convers�o de celsius para fahrenheit � igual a: %.2f", conversaoC);
	sc.close();
			
			
	}

}