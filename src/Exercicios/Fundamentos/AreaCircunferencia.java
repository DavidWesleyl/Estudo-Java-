package Exercicios.Fundamentos;
import  java.util.Scanner;

public class AreaCircunferencia
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in); // Entrada de dados


        System.out.print("Digite o Raio: ");

        double raio = scanner.nextDouble(); // entrada de dados de valor double

        double valor_de_pi = 3.14159;

        double area = valor_de_pi * raio * raio;

        System.out.println();
        System.out.println("A área da circunferencia é: " + area + " m2");




    }
}
