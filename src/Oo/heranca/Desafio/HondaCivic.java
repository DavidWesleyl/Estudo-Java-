package Oo.heranca.Desafio;

public class HondaCivic // SUBCLASSE CIVIC HERDA DE CARRO
{
    private int velocidadeAtual;

    private int aumentoVelocidadePadrao = 5;



    public HondaCivic(){};


    public HondaCivic(int velocidadeAtual)
    {
        this.velocidadeAtual = velocidadeAtual;
    }


    public  void acelerar()
    {
        velocidadeAtual += aumentoVelocidadePadrao;

        System.out.println("O Honda Civic acelerou para: " + velocidadeAtual + "km/h");


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
            System.out.println("O Honda Civic freou para: " + velocidadeAtual + "km/h");

        }

    }
}
