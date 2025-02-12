package Oo.composicao;

public class Carro
{

    Motor motor = new Motor();






    public void ligar()
    {
        motor.ligado = true;

    }

    public void desligar()
    {
        motor.ligado = false;
    }

    public boolean estaLigado()
    {
        return motor.ligado;
    }





    public void acelerar()
    {
        motor.injecaoEletronica += 0.4;
    }

    public void frear()
    {
        motor.injecaoEletronica -= 0.4;
    }











}
