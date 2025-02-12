package Classe;

public class Data {

    int Dia;
    int Mes;
    int Ano;



    // Construtor Padrão, se não for passada nenhuma informação, mostrar:

    public Data()
    {
        this.Dia = 01;
        this.Mes = 01;
        this.Ano = 1970;

    }

    // COnstrutor 2, se for passada informação, mostrar:

    public Data(int dia, int mes, int ano) {
        Dia = dia;
        Mes = mes;
        Ano = ano;
    }



    void DataEscolhida()
    {

        System.out.println(Dia + "/" + Mes + "/" + Ano);
    }


}
