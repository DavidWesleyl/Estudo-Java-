package Classe;

public class EqualsHashCode
{
    public static void main(String[] args)
    {
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();


        usuario1.nome = "Joabson";
        usuario1.email = "joabson123@gmail.com";


        usuario2.nome = "Joabson";
        usuario2.email = "joabson123@gmail.com";

        System.out.println(usuario1 == usuario2);
        System.out.println(usuario1.equals(usuario2));






    }


}
