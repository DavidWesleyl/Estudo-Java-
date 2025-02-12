package Oo.heranca.Desafio;

public class mainTeste
{
    public static void main(String[] args)
    {

        Carro carro1 = new Carro();

        carro1.velocidadeAtual = 30;

        carro1.acelerar(5);

        carro1.frear(20);
        carro1.frear(10);
        carro1.frear(5);
        carro1.frear(2);


        System.out.println();


        Ferrari ferrari = new Ferrari();


        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();


        System.out.println();


        HondaCivic meuHonda = new HondaCivic();

        meuHonda.acelerar();
        meuHonda.acelerar();











    }






}
