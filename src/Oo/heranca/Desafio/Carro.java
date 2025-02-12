package Oo.heranca.Desafio;

public class Carro // SUPER CLASSE CARRO
{
    int velocidadeAtual;



    public void acelerar(int aceleracao)
    {
        if(aceleracao > 0)
        {
            velocidadeAtual += aceleracao;
            System.out.println("O carro acelerou para: " + velocidadeAtual + "km/h");

        }


    }
    public void frear(int freando)
    {
        if(velocidadeAtual <= 0)
        {
            System.out.println("O carro já está imobilizado, não é possível frear");
        }
        else
        {
            velocidadeAtual -= freando;
            System.out.println("O carro freou para: " + velocidadeAtual + "km/h");

        }



    }















}
