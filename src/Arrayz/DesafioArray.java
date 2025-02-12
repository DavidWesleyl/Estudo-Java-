package Arrayz;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray
{
    // calcular a média de um usuário e armazenar em um array


    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);


        System.out.print("Quantas notas você quer informar? ");

        int quantidade = dados.nextInt();


        // declarando o array

        double[] arrayNotas = new double[quantidade];

        double total = 0;

        for(int i = 0; i < arrayNotas.length; i++)

        {

            System.out.print("Digite a nota " + (i + 1) + ": ");

            // para evitar problemas com padrões numéricos, como 2,2 ou 2.2, vamos converter o tipo de entrada

            String entrada = dados.next(); // Lê como texto
            entrada = entrada.replace(",", "."); // Substitui vírgula por ponto
            arrayNotas[i] = Double.parseDouble(entrada); // Converte para double

        }

        System.out.println(); // Quebra de linha no console

        System.out.println("Notas digitadas: ");
        System.out.println("===================");

        for(double notasDigitadas : arrayNotas)
        {
            System.out.println(notasDigitadas);
            total = notasDigitadas += total; // captura todas as notas e soma
        }

        System.out.println();

        System.out.printf("MÉDIA: %.2f%n ", total / quantidade);





    }


}
