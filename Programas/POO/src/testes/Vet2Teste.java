package testes;

import java.util.Scanner;
import entidades.Vet;

public class Vet2Teste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int n = input.nextInt();
		Vet[] vetor = new Vet[n];
		
		double somaPrecos = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite os dados do "+(i+1)+"º produto:");
			
			System.out.print("Nome: ");
			String nome = input.nextLine();
			input.nextLine();
			
			System.out.print("Preço: ");
			double preco = input.nextDouble();
			
			somaPrecos += preco;
			
			vetor[i] = new Vet(nome, preco);  
		}
		
		System.out.println("Media do preço dos produtos: "+Vet.media(somaPrecos, n));
		
		input.close();
		
	}
}
