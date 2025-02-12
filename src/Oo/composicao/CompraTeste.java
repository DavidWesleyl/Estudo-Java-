package Oo.composicao;

public class CompraTeste
{
    public static void main(String[] args)

    {

        Compra c1 = new Compra();

        c1.cliente = "João Pedro";

        c1.itensCompra.add(new Item("Biscoito", 2, 1.75));
        c1.itensCompra.add(new Item("Borracha", 2, 3.89));
        c1.itensCompra.add(new Item("Caderno", 2, 15.00));


        // adicionando item com metodo criado
       c1.adicionarItem(new Item("Biscoito", 2, 16.98));





        System.out.println(c1.itensCompra.size());
        System.out.println("Valor total das compras: " + c1.getTotalValue());


        c1.removerItem(0);


        System.out.println(c1.itensCompra.get(0).Nome);









    }

}
