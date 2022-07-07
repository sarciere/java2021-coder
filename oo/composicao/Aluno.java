package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {  
      
    final String nome;        
    final List<Curso> cursos = new ArrayList<Curso>();//O final na lista, impede que ela seja atribuida uma nova instância, mas pode ter seus valores modificados;

    Aluno(String nome){
        this.nome = nome;
    }

    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCursoPorNome(String nome){
        for (Curso curso : this.cursos) {
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso;                
            }
        }
        return null;
    }

    public String toString(){
        return nome;
    }
}
