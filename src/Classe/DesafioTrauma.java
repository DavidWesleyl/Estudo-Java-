package Classe;

public class DesafioTrauma
{

    int a = 123456789; // não pode mexer aqui

    public static void main(String[] args)
    {
        // Sistema: imprimir o valor de A que está fora do metodo main

        // Resolução

        DesafioTrauma desafio = new DesafioTrauma();

        System.out.println("Executando a var fora de main: " + desafio.a);



    }
}
