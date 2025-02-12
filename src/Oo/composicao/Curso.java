package Oo.composicao;

import java.util.ArrayList;

public class Curso
{
    final String Nome;
    final ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public Curso(String nome) {
        Nome = nome;
    }

    public void adicionarAluno(Aluno alunoInformacoes)
    {
        this.alunos.add(alunoInformacoes);
        alunoInformacoes.cursos.add(this);
    }





}
