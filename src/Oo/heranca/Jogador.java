package Oo.heranca;

import java.lang.runtime.SwitchBootstraps;

public class Jogador
{
    int vida = 100;
    int posicaoX;
    int posicaoY;







    public boolean andar(Direcao direcao)
    {
        switch(direcao)
        {
            case NORTE:
                posicaoY--;
                break;
            case  LESTE:
                    posicaoX++;
                    break;
            case   SUL:
                    posicaoY++;
            case    OESTE:
                posicaoX--;
                break;
        }

        return true;

    };






}
