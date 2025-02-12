package EstruturasControle;

import java.util.Scanner;

public class Media
{

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        var n1 = dados.nextDouble();

        System.out.println();


        System.out.print("Digite a segunda nota: ");
        var n2 = dados.nextDouble();

        double media = (n1 + n2) / 2;


        if(media >= 7.0)
        {
            System.out.println();
            System.out.println("---------------------------");
            System.out.println("Aprovado! Média: "+ media);
        }

        else if (media > 4.0 && media < 7.0 )
        {
            System.out.println();
            System.out.println("---------------------------");
            System.out.println("Recuperação! Média: " + media);
            
        }
        else
        {
            System.out.println();
            System.out.println("---------------------------");
            System.out.println("Reprovado! Média: " + media);
        }




    }


}
