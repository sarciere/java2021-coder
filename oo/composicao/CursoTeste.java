package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria");
        Aluno aluno2 = new Aluno("João");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java completo");
        Curso curso2 = new Curso("WEB MODERNO");
        Curso curso3 = new Curso("Java 2022");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);
        
        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno alunos : curso1.alunos) {
            System.out.printf("Estou matriculado no curso %s \n", Integer.toString(1));
            System.out.printf("Meu nome é : %s \n", String.format(alunos.nome));
        }

        Curso cursoEncontrado = aluno1.obterCursoPorNome(curso1.nome);
        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.alunos.toString());
        }else{
            System.out.println("Curso não localizado");
        }        
    }
}
