package lista02;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        float celsius, conversaoF;

        System.out.println("Informe a temperatura em graus celsius:");
        celsius = sc.nextFloat();

        conversaoF = (9 * celsius + 160) / 5;

        System.out.printf("\nO resultado da convers�o de Celsius para Fahrenheit � igual a: %.2f", conversaoF);
        sc.close();
    }

}