package Oo.composicao;

public class Motor
{
    double injecaoEletronica = 1;
    boolean ligado;




    public int giros()
    {

        if(!ligado)
        {
            return 0;
        }

        return (int)Math.round(injecaoEletronica * 3000);


    }









}
