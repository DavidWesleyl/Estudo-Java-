package EstruturasControle;



import java.util.Scanner;

public class DoWhile
{
    public static void main(String[] args) {

        Scanner entrada_dados = new Scanner(System.in);


        var frase = " ";

        do {
            System.out.print("Digite a palavra mágica: ");
            frase = entrada_dados.nextLine();
        }
        while (!frase.equalsIgnoreCase("por favor"));
        {

        System.out.println("** Obrigado! **");








        entrada_dados.close();




    }





}}
