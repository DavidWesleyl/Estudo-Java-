package Oo.composicao;

import java.util.ArrayList;

public class Aluno
{

    final String Nome; // o final antes de declarar a variável, significa que a informação vai ser constante, ou seja, não muda, mas pode ser modificada.
    final ArrayList<Curso> cursos = new ArrayList<Curso>();

    public Aluno(String nome) {
        Nome = nome;
    }

    public void adicionarCurso(Curso cursoAdicionado)
    {
        this.cursos.add(cursoAdicionado);
        cursoAdicionado.alunos.add(this);
    }














}
