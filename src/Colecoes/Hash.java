package Colecoes;

import java.util.HashSet;

public class Hash
{
    public static void main(String[] args)

    {

        HashSet<Usuario> usuarioTeste = new HashSet<Usuario>();


        usuarioTeste.add(new Usuario("James"));
        usuarioTeste.add(new Usuario("Joabson"));
        usuarioTeste.add(new Usuario("João"));
        usuarioTeste.add(new Usuario("Sameson"));









        System.out.println("Nomes existentes: ");

       for(Usuario User: usuarioTeste )
       {

           System.out.println(User.nome);
       }



    }
}
