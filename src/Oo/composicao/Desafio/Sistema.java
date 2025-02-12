package Oo.composicao.Desafio;

public class Sistema
{
    public static void main(String[] args)
    {



        Compra compra1 = new Compra();
        Compra compra2 = new Compra();



        // utilizando o metodo de instância onde colocamos todas as informações diretamente

        compra1.adicionarItem("Caneta bic", 1.75, 1);

        // utilizando o metodo de instância onde colocamos as infomações precisando instanciar

        compra1.adicionarItem(new Produto("Caneca porcelana", 10.00), 2);





        // utilizando o metodo de instância onde colocamos todas as informações diretamente

        compra2.adicionarItem("Monitor LG Ultragear", 1500, 1);

        // utilizando o metodo de instância onde colocamos as infomações precisando instanciar

        compra2.adicionarItem(new Produto("Impressora HP", 10.00), 2);


        Cliente cliente = new Cliente("Joabson");


        cliente.comprasCliente.add(compra1);
        cliente.adicionarCompra(compra2);


        System.out.println(cliente.obterValorTotal());











        /*for(Item listandoCompras: comprasUser.itensDoCliente)
        {
            System.out.print("\nProduto: " + listandoCompras.Produtos.Nome);
            System.out.print("\nPreço: "+ listandoCompras.Produtos.Preco);
        }*/





















    }

}
