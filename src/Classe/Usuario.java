package Classe;

import java.awt.*;

public class Usuario {
    String nome;
    String email;


    @Override
    public boolean equals(Object objeto)
    {
        Usuario outroUsuario = (Usuario) objeto; // Convertendo o tipo genérico object para o tipo usuário
        return super.equals(objeto);
    }
}
