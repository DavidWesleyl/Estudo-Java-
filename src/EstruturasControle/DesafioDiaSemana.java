package EstruturasControle;

import java.util.Scanner;

public class DesafioDiaSemana
{
    public static void main(String[] args) {

        Scanner entrada_dados = new Scanner(System.in);

        System.out.print("Digite o dia da semana para mostrar o numero: ");
        String dia_da_semana = entrada_dados.next();

        System.out.println();

        switch(dia_da_semana){
            case "Domingo":
                System.out.println("dia 1");
                break;
            case "Segunda":
                System.out.println("dia 2");
                break;
            case "Terça":
                System.out.println("dia 3");
                break;
            case "Quarta":
                System.out.println("dia 4");
                break;
            case "Quinta":
                System.out.println("dia 5");
                break;
            case "Sexta":
                System.out.println("dia 6");
                break;
            case "Sábado":
                System.out.println("dia 7");
                break;

        }


        entrada_dados.close();

    }
}
