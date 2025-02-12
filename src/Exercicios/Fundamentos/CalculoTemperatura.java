package Exercicios.Fundamentos;
import java.util.Scanner;


public class CalculoTemperatura
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // FORMULA => C == ( F - 32 ) / 1,8

        System.out.print("Informe um valor em Fahreinheit para converter em Celcius:  ");

        double fahrenheit = scanner.nextDouble();

        double conversaoCelcius = (fahrenheit - 32) / 1.8;

        System.out.println();
        System.out.println("A temperatura de F para C, é: " + conversaoCelcius);

        scanner.close();


    }
}
