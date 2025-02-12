package Oo.composicao;

public class CursoTeste
{
    public static void main(String[] args)
    {

        // instanciando as classes

        Aluno al1 = new Aluno("João");
        Aluno al2 = new Aluno("Marcos");
        Aluno al3 = new Aluno("Gabriel");


        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("C#");
        Curso curso3 = new Curso("Phyton");



        // relacionando as classes


        curso1.adicionarAluno(al1);
        curso1.adicionarAluno(al2);

        curso2.adicionarAluno(al2);
        curso2.adicionarAluno(al3);

        curso3.adicionarAluno(al2);

        // listando todos os alunos do curso 1


        System.out.println("ALUNOS DO CURSO 1");

        System.out.println("Nome do curso: " + curso1.Nome);
        for(Aluno alunos: curso1.alunos)
        {

            System.out.println("Nome do Aluno: " + alunos.Nome);
        }

        System.out.println();

        System.out.println("ALUNOS DO CURSO 2");


        System.out.println("Nome do curso: " + curso2.Nome);
        for(Aluno alunos: curso2.alunos)
        {

            System.out.println("Nome do Aluno: " + alunos.Nome);
        }

        System.out.println();

        System.out.println("ALUNOS DO CURSO 3");

        System.out.println("Nome do curso: " + curso3.Nome);

        for(Aluno alunos: curso3.alunos)
        {

            System.out.println("Nome do Aluno: " + alunos.Nome);
        }
        }




    }

