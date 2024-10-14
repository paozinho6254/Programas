package programas;

import java.util.Scanner;

public class NegativosTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor: ");
		int n = input.nextInt();
		
		int[] vet = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			vet[i] = input.nextInt();
			}
		
		System.out.println("Números negativos: ");
		
		for(int i = 0; i < n; i++) {
			if(vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		
		input.close();
	}
}
