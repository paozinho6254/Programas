package testes;

import java.util.Scanner;

import entidades.Vet;

public class VetTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alturas: ");
		int n = input.nextInt();
		
		double[] vet = new double[n];
		double vetSoma = 0; 
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite a "+(i+1)+"ª altura: ");
			vet[i] = input.nextDouble();
			vetSoma += vet[i];
		}
		System.out.println("Valor da média das alturas = "+String.format("%.2f", Vet.media(vetSoma, n)));
		
		input.close();
	
	}

}
