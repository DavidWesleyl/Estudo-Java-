package Oo.composicao;

public class CarroTeste
{
    public static void main(String[] args)

    {

        Carro meuCarro = new Carro();




        // Carro está ligado?
        System.out.println(meuCarro.estaLigado());


        // ligar Carro

        meuCarro.ligar();

        System.out.println(meuCarro.estaLigado());

        // quantos rpm (rotações por minuto)

        System.out.println(meuCarro.motor.giros());

        // acelerar Carro e mostrar giros do motor

        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();

        System.out.println(meuCarro.motor.giros());


        // frear

        meuCarro.frear();

        System.out.println(meuCarro.motor.giros());









    }
}
