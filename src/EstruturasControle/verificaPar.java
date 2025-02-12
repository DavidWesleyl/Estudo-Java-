package EstruturasControle;

import java.util.Scanner;

public class verificaPar
{
    // Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;


    public static void main(String[] args) {

        Scanner entrada_dados = new Scanner(System.in);

        System.out.print("Digite um valor");

        int valor = entrada_dados.nextInt();

        if(valor < 0 || valor > 10)
        {
            System.out.print("O valor não está entre 0 e 10 ");

        }

        else if(valor % 2 == 0)
        {
            System.out.println("O valor digitado é Par");

        }

        else
        {
            System.out.println("O valor digitado é ímpar");

        }



    }

























}
