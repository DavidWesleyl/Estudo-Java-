package Exercicios.Fundamentos;

import java.util.Scanner;

public class Quadrado_e_Cubo
{
    public static void main(String[] args)
    {
        Scanner entrada_de_dados = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = entrada_de_dados.nextInt();

        System.out.println("================");
        System.out.println(" Ver o valor ao quadrado press 1\n Ver o valor ao cubo press 2");
        System.out.println("================");

        System.out.print("Digite 1 ou 2: ");
        int opcao = entrada_de_dados.nextInt();

        int result;

        switch (opcao)
        {
            case 1:
                result = valor * valor;
                System.out.println("O valor ao quadrado é: " + result);
                break;
            case 2:
                result = valor * valor * valor;
                System.out.println("O valor ao cubo é: " + result);
                break;


        }

        entrada_de_dados.close();




    }
}
