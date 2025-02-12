package Oo.Polimorfsmo;

public class Sorvete {
    private double Peso;


    public Sorvete() {

    }


    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            Peso = peso;

        }
    }
}
