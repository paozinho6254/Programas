package programas;

import java.util.Scanner;

public class ExercicioResolvidoMatrizes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da matriz: ");
		int n = input.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				System.out.println("Digite o número ["+(i+1)+"]["+(j+1)+"]: ");
				int x = input.nextInt();
				mat[i][j] = x;
			}
		}
		
		System.out.println("Diagonal principal:");
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(i == j){
					System.out.print(mat[i][j]+", ");
				}
			}
		}	
		System.out.println("Número negativos:");
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[i][j] < 0){
					System.out.print(mat[i][j]);
				}
			}
		}		
		
		
		
	}

}
