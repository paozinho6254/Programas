package testes;

import entidades.NotaAluno;
import java.util.Scanner;

public class NotaAlunoTeste {
	public static void main(String[] args) {
		NotaAluno aluno = new NotaAluno();
		Scanner input = new Scanner(System.in);
		double nota;
		
		System.out.println("Aluno: ");
		aluno.nome = input.nextLine();
		for(int i = 0; i < 3; i++) {
			System.out.println("Insira a nota do "+(i+1)+"º Trimeste: ");
			nota = input.nextDouble();
			aluno.somarNota(nota);
		}
		
		aluno.result();
		
		input.close();
	}
}
