package Classe;

import java.util.Scanner;

public class Jantar {

    public static void main(String[] args)
    {

        Comida primeiroPrato = new Comida("Arroz", 150.0);

        Comida segundoPrato = new Comida("Macarrão", 200.0);


        Pessoa primeiraPessoa = new Pessoa();

        Scanner dados = new Scanner(System.in);

        System.out.print("Nome da pessoa: ");
        primeiraPessoa.Nome = dados.nextLine();


        System.out.print("Peso: ");
        primeiraPessoa.Peso = dados.nextDouble();

        System.out.println();

        System.out.println("RESULTADO: ");
        System.out.println("======================");

        System.out.println("PESO antes de comer: " + primeiraPessoa.Peso);


        System.out.print("\nAgora você está pesando: ");
        System.out.println(primeiraPessoa.Comer(primeiroPrato));






    }
}
