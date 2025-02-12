package Exercicios.Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora
{
    public static void main(String[] args)
    {
        // ler 2 numeros, escolher a operação (+ - * / )

        System.out.println(" "); // espaço no console

        System.out.println("C A L C U L A D O R A");

        System.out.println(" "); // espaço noconsole

        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        var valor1 = entradaDados.nextDouble();

        System.out.println();

        System.out.print("Digite o segundo valor valor: ");
        var valor2 = entradaDados.nextDouble();

        System.out.println(" "); // espaço no console

        System.out.println("==============================");

        System.out.println("Qual Operação deseja realizar? \n | [ + ] somar \n | [ - ] subtrair  \n | [ * ] multiplicar \n | [ / ] dividir \n ");

        System.out.println(" "); // espaço no console

        System.out.print("Digite o APENAS o símbolo: ");

        var simbolo = entradaDados.next().charAt(0);


        double result; // variável vai armazenar o resultado


        switch (simbolo)
        {
            case '+':
                result = valor1 + valor2;
                System.out.println("A soma dos valores, é: " + result);
                break;

            case '-':
                result = valor1 - valor2;
                System.out.println("A subtração dos valores, é: " + result);
                break;

            case '*':
                result = valor1 * valor2;
                System.out.println("A multiplicação dos valores, é: " + result);
                break;

            case '/':
                result = valor1 / valor2;
                System.out.println("A divisão dos valores, é: " + result);
                break;

        }









    }

}
