package Classe;

import java.lang.reflect.Constructor;

public class Produto {


    // DESAFIO => NOME DA LOJA: 25% DE DESCONTO. POLITICA DA LOJA: QUANDO UM DESCONTO É APLICADO,
    // É APLICADO PARA TODOS PRODUTOS. POR PADRÃO É 25%, MAS EM DATAS COMO NATAL, DIAS DAS MÃES, ETC.
    // PODE SER MAIOR, MAS É OBRIGATÓRIAMENTE PARA TODOS OS PRODUTOS SEM EXCEÇÃO

    String Nome;
    double Preco;
    static double Desconto = 0.25;


    // Construtor

    Produto(){}









    public void informacoes()
    {
        System.out.println();
        System.out.println("==== LOJÃO 25% DE DESCONTO ====");
        System.out.println();
        System.out.println("PRODUTO: " + Nome);
        System.out.println("VALOR: " + Preco);
        System.out.println("DESCONTO APLICADO: " + Desconto + "%");
        System.out.println();
        System.out.println("========================");
    }


    public double valorComDesconto()
    {
        return Preco * (1 - Desconto);

    }







}
