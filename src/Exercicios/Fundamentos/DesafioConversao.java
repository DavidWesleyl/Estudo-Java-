package Exercicios.Fundamentos;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class DesafioConversao
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("informe o primeiro salario: ");
        String valor1 = entrada.next().replace(",", "."); // Se o usuário digitar a virgula, será substituida pelo ponto

        System.out.println(" ");


        System.out.print("informe o Segundo salario: ");
        String valor2 = entrada.next().replace(",", ".");

        System.out.println(" ");

        System.out.print("informe o Terceiro salario: ");
        String valor3 = entrada.next().replace(",", ".");

        System.out.println(" ");


        // CONVERTENDO VALORES DE STRING P/ DOUBLE

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor2);



        double media = (salario1 + salario2 + salario3) / 3;

        System.out.println();
        System.out.println("A média dos salários é : " + media);



        entrada.close();





    }
}
