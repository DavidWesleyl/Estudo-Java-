package Exercicios.Fundamentos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class base_e_altura
{
    public static void main(String[] args)
    {
        Scanner entrada_dados = new Scanner(System.in);

        // ÁREA DO TRIANGULO

        System.out.print("Digite o valor da base do triangulo: ");
        double base = entrada_dados.nextDouble();

        System.out.println();

        System.out.print("Digite o valor da altura");
        double altura = entrada_dados.nextDouble();

        System.out.println();

        double area = (base * altura) / 2;

        System.out.println("A área do trinagulo é: " + area);







    }
}
