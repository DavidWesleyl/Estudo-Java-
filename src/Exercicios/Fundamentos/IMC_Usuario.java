package Exercicios.Fundamentos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IMC_Usuario
{
    public static void main(String[] args)
    {
        /*  Passos para calcular o IMC:
            Meça a altura da pessoa em metros (m).
            Meça o peso da pessoa em quilogramas (kg).
            Divida o peso pelo quadrado da altura.

            Exemplo de cálculo:
            Peso: 70 kg
            Altura: 1,75 m

            IMC = 70 / 1.75² = 70 / 3,0625 = 22,86

            Interpretação do IMC (segundo a OMS):
            Menor que 18,5: Abaixo do peso
            18,5 a 24,9: Peso normal
            25 a 29,9: Sobrepeso
            30 a 34,9: Obesidade grau 1
            35 a 39,9: Obesidade grau 2
            40 ou mais: Obesidade grau 3 (mórbida)
        */


        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite o Peso: ");
        double peso = entradaDados.nextDouble();

        System.out.println(" ");

        System.out.print("Digite a altura: ");
        float altura = (float)entradaDados.nextDouble();

        double imc = peso / (altura * altura);




        System.out.println(" ");

        System.out.printf("Seu IMC é: %.2f%n", imc);


        if(imc < 18.5)
        {
            System.out.println("Abaixo do Peso");

        }
        else if (imc > 18.5 && imc <= 24.9)
        {
            System.out.println("Peso normal");

        }
        else if (imc >= 25 && imc <= 29.9 )
        {
            System.out.println("Sobrepeso");

        }
        else if(imc == 30 && imc <= 34.9)
        {
            System.out.println("Obesidade grau 1");

        }
        else if(imc == 35 && imc <= 39.9)
        {
            System.out.println("Obesidade grau 2");

        }
        else if(imc >= 40)
        {
            System.out.println("Obesidade grau 3");

        }

    }
}
