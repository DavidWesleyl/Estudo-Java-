package Classe;

public class Comida
{
    String Nome;
    double Peso;


    public Comida()
    {
    }

    public Comida(String nome, double peso) {
        this.Nome = nome;
        this.Peso = peso / 1000.0; // Calculo para converter o peso da comida em gramas
    }
}
