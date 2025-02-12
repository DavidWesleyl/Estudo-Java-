package Oo.composicao.Desafio;

import java.util.ArrayList;

public class Cliente
{
    final String Nome;

    ArrayList<Compra> comprasCliente = new ArrayList<Compra>();

    public Cliente(String nome) {
        Nome = nome;
    }


    public void adicionarCompra(Compra compra)
    {
        this.comprasCliente.add(compra);
    }





    public double obterValorTotal()
    {
        double total = 0;


        for(Compra compras: comprasCliente)
        {
            total += compras.obterValorTotal();
        }

        return total;

    }










}
