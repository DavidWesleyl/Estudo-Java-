package Exercicios.Fundamentos;

import java.util.Scanner;

public class DesafiosLogicos
{
    public static void main(String[] args)
    {

        /* REQUISITO: TEMOS 2 TRABALHOS, UM NA TERÇA E OUTRO NA QUINTA. SE APENAS 1 TRABALHO DER CERTO, VOCÊ ADQUIRE
        * UMA TV DE 32", SE OS 2 TRABALHOS DEREM CERTO, VOCÊ ADQUIRE A TV DE 50" E NOS DOIS CASOS A FAMÍLIA VAI TOMAR
        * SORVETE NO “SHOPPING”. SE ACONTECER DE NÃO DAR CERTO NENHUM DOS DOIS. VOCÊ NÃO ADQUIRE NADA NEM LEVA A FAMÍLIA
        * PARA TOMAR SORVETE */

        Scanner entradaDados = new Scanner(System.in);


        System.out.print("O trabalho na terça deu certo? True or False: ");
        boolean trabalho1 = entradaDados.nextBoolean();


        System.out.print("O trabalho na quinta deu certo? True or False: ");
        boolean trabalho2 = entradaDados.nextBoolean();

        System.out.println();
        System.out.println("====================== R E S U L T A D O =======================");


        if (trabalho1 && trabalho2 == true)
        {
            System.out.println(" ** Os dois trabalhos deram certo! Você adquiriu a TV de 50 Polegadas e levou sua família para tomar sorvete no shopping! **" );

        }

        else if(trabalho1 || trabalho2 == true)
        {
            System.out.println("Um dos trabalhos deu certo! Você adquiriu uma TV de 32 Polegadas e levou sua família pra tomar sorvete no shopping!");

        }

        else
        {
            System.out.println("Infelizmente os trabalhos não deram certo, você não adquiriu a TV nem levou a família para passear..");

        }

        System.out.println("======================================================================================");

        entradaDados.close();








    }
}
