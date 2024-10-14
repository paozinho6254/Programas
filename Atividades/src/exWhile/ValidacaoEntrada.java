package exWhile;

import java.util.Scanner;

public class ValidacaoEntrada {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//nota é valor inserido pelo usuário, soma a soma dos números, media é calculada depois
		double nota, soma = 0, media;
		//cont é a contagem dos estudantes, e estudantes são estudantes contabilizados
		int cont, estudantes;
		
		//usuário informa quantos estudantes serão avaliados
		System.out.println("Quantas notas devem ser inseridas: ");
		cont = input.nextInt();
		//estudantes vai guardar a quantidade de cont
		estudantes = cont;
		System.out.println("Insira a notas dos estudantes");
		
		//laço de repetição em que só é terminado até que cont seja chegue a zero
		do {
			System.out.print("Nota: ");
			nota = input.nextDouble();
			//se a nota informada estiver dentro do intervalo ela é validada e a contagem diminui
			if(nota >= 0 && nota <= 10) {
				soma += nota;
				cont--;
			}
			//Se não o usuário precisa informar novamente
			else {
				System.out.println("Número inválido, tente novamente!");
			}
		}while(cont > 0);//assim o laço acaba
		
		//a media será calculada 
		media = soma / estudantes;
		//para então informar o usuário da media da nota dos alunos
		System.out.println("Média dos "+estudantes+" estudantes: "+media);
		
		//fecha Scanner
		input.close();
	}

}
