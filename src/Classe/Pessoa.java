package Classe;

public class Pessoa {


    String Nome;
    double Peso;

    Comida comida = new Comida();


    public Pessoa()
    {

    }

    public Pessoa(String nome, double peso){
        Nome = nome;
        Peso = peso;

    }





    public double Comer(Comida comida)
    {
        var pesoComida = comida.Peso;
        return pesoComida + Peso;

    }



}
