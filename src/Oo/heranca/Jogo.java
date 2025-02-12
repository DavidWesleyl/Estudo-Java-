package Oo.heranca;

public class Jogo
{
    public static void main(String[] args)

    {
        Jogador jogador1 = new Jogador();

        jogador1.posicaoX = 0;
        jogador1.posicaoY = 2;


        jogador1.andar(Direcao.NORTE);
        jogador1.andar(Direcao.NORTE);
        jogador1.andar(Direcao.NORTE);
        jogador1.andar(Direcao.SUL);
        jogador1.andar(Direcao.OESTE);
        jogador1.andar(Direcao.NORTE);





        System.out.println(jogador1.posicaoX);
        System.out.println(jogador1.posicaoY);





    }









}
