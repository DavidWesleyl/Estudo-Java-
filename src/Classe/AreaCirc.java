package Classe;

public class AreaCirc {

    double Raio;
    static final double Pi = 3.14; // o STATIC permite que o membro se torne parte da classe, e não da instancia.
                            // não precisamos instanciar e depois atribuir o valor, basta chamar a classe e
                           // ele estará disponível para uso, ex AreaCirc.Pi, porém ela ainda pode ser modificada no main
                          //  para torna-lo uma constante, adicionaremos o "Final". Com isso, não será possível altera-lo.
                         //  Apenas leitura




    public AreaCirc(double raio) {
        Raio = raio;


    }

    public double CalculoArea()
    {
        return Raio * Raio * Pi;

    };









}
