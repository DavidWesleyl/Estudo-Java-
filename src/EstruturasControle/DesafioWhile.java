package EstruturasControle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        // calcular média de X alunos na turma, usuário vai digitar uma nota de 0 a 10, armazenar a nota numa var total.
        // sempre q usuário digitar uma nota, ele vai somar as notas digitadas em outra variável e vai identificar
        // quantas notas válidas foram identificadas. No final vai mostrar a média após o usuário digitar -1.


        Scanner entrada_dados = new Scanner(System.in);


        double valor;
        int contador = 0;
        double armazenamento_e_soma =  0;

        do{
            System.out.print("\n=> Digite um valor (press -1 p/ sair): ");
            valor = entrada_dados.nextDouble();


            if(valor < 0 || valor > 10){
                System.out.print("** Valor inválido **");
            }
            else
            {
                System.out.print("\nNOTAS VÁLIDAS ARMAZENADAS: ");
                System.out.println(contador+=1);
                System.out.print("\nSOMA DO VALORES VÁLIDOS ATÉ O MOMENTO: ");
                System.out.println(armazenamento_e_soma += valor);

            }


        }

        while(valor != -1);{
            System.out.println("\n======================================================");
            System.out.println("fim do programa");
            System.out.println("A MÉDIA CALCULADA FOI:" + armazenamento_e_soma / contador);
        }

        entrada_dados.close();












    }
}
