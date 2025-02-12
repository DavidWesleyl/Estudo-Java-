package Arrayz;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args)
    {

        double[] notasAlunos = new double[3];

        notasAlunos[0] = 6.5;
        notasAlunos[1] = 7.5;
        notasAlunos[2] = 5.5;

        //System.out.println(Arrays.toString(notasAlunos));


        // PERCORRER ARRAY

        double total = 0;
        for(int i = 0; i < notasAlunos.length; i++){
            total += notasAlunos[i];

            System.out.println(total);
        }


        double[] notasAlunoB =  {8.8, 9.9, 5.5, 6.6};

         






    }
}
