package arrays;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        double total = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a quantidade de alunos: ");
        int qtdAlunos = entrada.nextInt();
        System.out.println("Informe a quantidade de notas: ");
        int qtdNotas = entrada.nextInt();

        double [][] notasAlunos = new double[qtdAlunos][qtdNotas];

        for (int aluno = 0; aluno < notasAlunos.length; aluno++) {
            for (int notas = 0; notas < notasAlunos[aluno].length; notas++) {
                System.out.printf("Insira a nota %d do aluno %d: ", notas + 1, aluno + 1 );
                notasAlunos[aluno][notas] += entrada.nextDouble();
                total += notasAlunos[aluno][notas];
            }            
        }
        
        System.out.printf("O total de notas da turma é: %f  ", total);
        System.out.println();
        System.out.printf("A média da turma foi: %f", total / (qtdAlunos * qtdNotas));
        System.out.println();
        entrada.close(); 
    }
}
