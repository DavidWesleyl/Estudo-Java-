package Oo.composicao.Desafio;

import java.util.ArrayList;

public class Compra

{

  final ArrayList<Item> itens= new ArrayList<Item>();

  // adicionando itens pelas informações, precisando instanciar diretamente

    public void adicionarItem(Produto produtoInfo, int quantidade)
    {
        this.itens.add(new Item(produtoInfo, quantidade));

    }



  // adicionando itens diretamente pelas informações com a instância separada

  public void adicionarItem(String nome, double preco, int quantidade)
  {
      var adicionandoProdutos = new Produto(nome, preco);

      this.itens.add(new Item(adicionandoProdutos, quantidade));

  }


  public double obterValorTotal()
  {
      double total = 0;

      for(Item item: itens)
      {
          total += item.Quantidade * item.Produtos.Preco;
      }

      return total;

  }



























}







