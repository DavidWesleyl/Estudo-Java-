package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado
{
    public static void main(String[] args)

    {

        //Set lista = new HashSet(); Aqui estamos definindo um hashset de list, abaixo vamos defini-lo como string


        Set<String> lista = new HashSet<String>();// Agora ele só poderá receber valores string, diferente de só hashset que recebe valores genéricos


        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Luka");
        lista.add("Pedro");


        for(String candidato: lista) // percorrer um vetor ou array, no caso em .Nt seria => for(string candidato in lista)
        {
            System.out.println(candidato);

        }

    }
}
