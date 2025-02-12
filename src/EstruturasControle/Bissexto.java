package EstruturasControle;

import java.util.Scanner;

public class Bissexto {

    public static void main(String[] args) {


        Scanner dados = new Scanner(System.in);


        System.out.print("Digite o ano atual para saber se é ou não bissexto: ");

        int anoAtual = dados.nextInt();

        System.out.println();

        if(anoAtual % 4 == 0 && anoAtual % 100 != 0 || anoAtual % 400 == 0)
        {
            System.out.println("O ano digitado é bissexto ");
        }
        else{
            System.out.println("O ano digitado não é bissexto");
        }







    }




}
