package Oo.composicao;

import java.util.ArrayList;

public class Compra
{
    public String cliente;


    ArrayList<Item> itensCompra = new ArrayList<Item>();




    public void adicionarItem(Item itemAdicinado)
    {
        itensCompra.add(itemAdicinado);

    }

    public void removerItem(int itemRemovido)
    {
        // remover pelo index
        itensCompra.remove(itemRemovido);
    }







    double getTotalValue()
    {
        double total = 0;

        for(Item item: itensCompra)
        {
            total += item.Preco * item.Quantidade;

        }

        return total;

    };









}
