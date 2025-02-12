package EstruturasControle;

import java.util.Scanner;

public class DesafioEstrutura {


    public static void main(String[] args) {

        //CRIAR UM LAÇO PARA FICAR REPETINDO, ATÉ O USUÁRIO DIGITAR A PALAVRA "SAIR"

        Scanner entrada_dados = new Scanner(System.in);



        while (true)
        {

            System.out.print("Digite: ");
            var frase = entrada_dados.next().trim().toLowerCase();

            if(frase.equals("sair"))
            {
                System.out.println("Saindo..");
                break;
            }

            else
            {
                System.out.println("Você digitou: " + frase);
            }


        }

        entrada_dados.close();











    }
}
