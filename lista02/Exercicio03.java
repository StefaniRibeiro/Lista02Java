package lista02;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Testando mudar o nome do scanner pra obj ao inv�s de sc 

        Scanner obj = new Scanner(System.in);

        float salario, reajuste, percReajuste, salarioAjustado;


        System.out.printf("Informe seu sal�rio: ");
        salario = obj.nextFloat();

        System.out.printf("Informe quanto deseja de reajuste: ");
        reajuste = obj.nextFloat();


        percReajuste = reajuste / 100 * salario;
        salarioAjustado = salario + percReajuste;

        System.out.printf("\nO seu novo sal�rio � igual a:  %.2f", salarioAjustado);

        obj.close();
    }

}