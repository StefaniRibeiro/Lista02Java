package lista02;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        float custoFabrica, percDistribuidor, percImpostos, total;

        System.out.println("Informe o custo de fabrica do seu carro: ");
        custoFabrica = sc.nextFloat();

        percDistribuidor = custoFabrica*28/100;
        percImpostos =  custoFabrica*45/100;
        total = custoFabrica+percDistribuidor+percImpostos;

        System.out.println("\nO custo total de seu carro � igual a:  "+ total);

        sc.close();

    }

}