package Classe;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoTeste {

    public static void main(String[] args) {

        // DESAFIO => NOME DA LOJA: 25% DE DESCONTO. POLITICA DA LOJA: QUANDO UM DESCONTO É APLICADO,
        // É APLICADO PARA TODOS PRODUTOS. POR PADRÃO É 25%, MAS EM DATAS COMO NATAL, DIAS DAS MÃES, ETC.
        // PODE SER MAIOR, MAS É OBRIGATÓRIAMENTE PARA TODOS OS PRODUTOS SEM EXCEÇÃO


        System.out.println();
        System.out.println("======== S I S T E M A    L O J Ã O  25  =============");



        Produto produto = new Produto();
        Scanner dados = new Scanner(System.in);

        System.out.print("Digite o nome do Produto: ");
        produto.Nome = dados.nextLine();

        System.out.println();

        System.out.print("Digite o valor do Produto: ");
        produto.Preco = dados.nextDouble();


        System.out.print("Desconto de data comemorativa? Digite S ou N: ");

        String verificaDesconto = dados.next();


        if(verificaDesconto.equals("S") || verificaDesconto.equals("s"))
        {
            var descontoData = produto.Desconto = 0.35;

        }


        produto.informacoes();
        System.out.printf("Valor final com desconto: R$ %.2f%n", produto.valorComDesconto());




    }



}
