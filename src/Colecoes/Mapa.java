package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa
{
    public static void main(String[] args)
    {

        Map<Integer, String> novoMapeamento = new HashMap<>(); // No map podemos usar duas chaves

        novoMapeamento.put(10, "Teste");
        novoMapeamento.put(1, "Joabson");
        novoMapeamento.put(2, "Sapo Lambil");
        novoMapeamento.put(3, "Sem unha");
        novoMapeamento.put(4, "Italado");


        System.out.println("Tamanho: " + novoMapeamento.size());
        System.out.println("Está vazio?: " + novoMapeamento.isEmpty());
        System.out.println("Valores encontrados: " + novoMapeamento.keySet());
        System.out.println("Nomes encontrados: " + novoMapeamento.values());
        System.out.println("Chave e valor ao mesmo tempo: " + novoMapeamento.entrySet());
        System.out.println("Contém o valor 5?: " + novoMapeamento.containsKey(5));
        System.out.println("Contém o nome Italado? : " + novoMapeamento.containsValue("Italado"));

    }

}
