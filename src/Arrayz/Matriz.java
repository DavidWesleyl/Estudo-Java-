package Arrayz;

import java.util.Scanner;

public class Matriz
{
    public static void main(String[] args)
    {

        // MATRIZ => ARRAY DENTRO DE OUTRO ARRAY




        Scanner dados = new Scanner(System.in);

        System.out.print("Quantos Alunos? ");

        int notaAlunos = dados.nextInt();

        System.out.println();

        System.out.print("Quantidade de notas: ");

        int quantidadeNotas = dados.nextInt();


        // DECLARAÇÃO DA MATRIZ

        double[][]  notasTurma = new double[notaAlunos][quantidadeNotas];

        double calcTotal = 0;


        // PERCORRENDO A MATRIZ ALUNOS E NOTAS =>
        for(int aluno = 0; aluno < notasTurma.length; aluno++) // PERCORRENDO O ARRAY DE ALUNOS
        {
            for (int notas = 0; notas < notasTurma.length; notas++) // PERCORRENDO O ARRAY DE NOTAS
            {
                System.out.printf("\nInforme a " + (notas + 1) + " nota do aluno " + (aluno + 1) + ": " );
                notasTurma[aluno][notas] = dados.nextDouble();

                calcTotal += notasTurma[aluno][notas];

            }

        }

            System.out.println("Média da turma: " + calcTotal / notasTurma.length);



        dados.close();



















    }
}
