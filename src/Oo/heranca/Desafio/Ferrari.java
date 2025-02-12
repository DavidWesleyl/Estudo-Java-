package Oo.heranca.Desafio;

public class Ferrari extends Carro // FERRARI HERDA DA SUPER CLASSE CARRO
{
    private int velocidadeAtual;

    private int aumentoVelocidadePadrao = 15;



    public Ferrari(){};


    public Ferrari(int velocidadeAtual)
    {
        this.velocidadeAtual = velocidadeAtual;
    }


    public  void acelerar()
    {
        velocidadeAtual += aumentoVelocidadePadrao;

    System.out.println("O A ferrari acelerou para: " + velocidadeAtual + "km/h");


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
            System.out.println("A ferrari freou para: " + velocidadeAtual + "km/h");

        }

    }
}
