package Oo.Polimorfsmo;

public class Pessoa {

    private double Peso;


    public Pessoa(double peso)
    {
        setPeso(peso);

    }

    public void comer()
    {

    }



    public double getPeso()
    {
        return Peso;
    }

    public void setPeso(double peso)
    {
        if (peso >= 0) {
            Peso = peso;

        }

    }
}
