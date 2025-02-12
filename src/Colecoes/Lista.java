package Colecoes;

import java.util.ArrayList;

public class Lista

{

    public static void main(String[] args)
    {


        ArrayList<Usuario> usuarioLista = new ArrayList<Usuario>();


        //Usuario usuario1 = new Usuario("João Luzx"); jeito 1 de adicionar a lista

        usuarioLista.add(new Usuario("João Luzx"));
        usuarioLista.add(new Usuario("Bia"));
        usuarioLista.add(new Usuario("Carlos"));
        usuarioLista.add(new Usuario("Manu"));
        usuarioLista.add(new Usuario("Pedro"));



        for(Usuario u : usuarioLista)
        {
            System.out.println(u.nome);

        }

        System.out.println("Obtendo pelo ID: " + usuarioLista.get(3).nome);











    }
}
