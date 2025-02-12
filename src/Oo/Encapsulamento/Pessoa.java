package Oo.Encapsulamento;

public class Pessoa
{
   private int idade = 80;






    public int getIdade()
    {
        System.out.println("A pessoa tem " + idade + " Anos de idade");
        return idade;
    }

    public void setIdade(int idadeAlterada)
    {
        System.out.println();
        System.out.println("Idade de " + idade + " anos alterada");
        System.out.println("Agora a pessoa tem " + idadeAlterada + " anos de idade");
    }




}
