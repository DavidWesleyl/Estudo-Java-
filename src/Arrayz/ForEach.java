package Arrayz;

public class ForEach {

    public static void main(String[] args) {


        double[] notas = {9.9, 8.7, 7.2, 9.4};


        // no Java não se declara o foreach, apenas o FOR

        // EXEMPLO FOR


        for(int i = 0; i < notas.length; i++) // Nesse caso ele vai percorrer incrementando e apontando pro índice / posição
        {
            System.out.println(notas[i]);

        }

        System.out.println();


        // EXEMPLO FOREACH

        for(double nota: notas) // aqui ele já recebe as posições e apenas armazena cada posição em "nota"
        {
            System.out.println(nota);
        }







    }

}
