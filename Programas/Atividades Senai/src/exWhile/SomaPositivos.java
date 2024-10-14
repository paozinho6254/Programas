package exWhile;

import java.util.Scanner;

public class SomaPositivos {

	public static void main(String[] args) {
		//Criação do Scanner
		Scanner input = new Scanner(System.in);
		
		//Variavel cont é a sequência do número. Ex: "Número 1, Número 2...
		int cont = 0;
		//X é o número que o Usuário insere, enquanto a soma é o que acumula os números que o usuário insere 
		double x, soma = 0;
		
		//Usuário é informado do que inserir
		System.out.println("Digite números positivos: ");
		//comando do para que seja executado pelo menos uma vez sem condição, que só vai ser parado após inserir um número negativo
		do  {
			//aqui o cont acrescenta mais um
			++cont;
			//como dito antes, o cont é a contagem de números que o usuário está digitando
			System.out.print("Número "+cont+": ");
			//Leitura do número
			x = input.nextDouble();
			//Se o número informado for positivo, ele é contabilizado, se não o programa para sem contabilizar o negativo informado
			if(x > 0) {
				//soma acumula mais um valor
				soma += x;
			}
		//Programa para após informar um número negativo
		} while(x > 0);
		
		//Programa mostra o resultado da soma de todos os números
		System.out.println("Soma: "+soma);
		
		//fecha o Scanner
		input.close();
	}
}
