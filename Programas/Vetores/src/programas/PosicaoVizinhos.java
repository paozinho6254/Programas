package programas;

import java.util.Scanner;

public class PosicaoVizinhos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantas linhas terá a matriz:  ");
		int colun = input.nextInt();
		System.out.print("Quantas colunas terá a matriz: ");
		int linhas = input.nextInt();
		int[][] mat = new int[colun][linhas];
		
		for(int i = 0; i < colun; i++) {
			for(int j = 0; j < linhas; j++) {
				System.out.print("Digite o número ["+i+"]["+j+"]: ");
				int x = input.nextInt();
				mat[i][j] = x;
			}
		}
		
		for(int i = 0; i < colun; i++) {
			for(int j = 0; j < linhas; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Digite um número que apareceu na matriz: ");
		int userNum = input.nextInt();
		for(int i = 0; i < colun; i++) {
			for(int j = 0; j < linhas; j++) {
				if(userNum == mat[i][j]) {
					System.out.println("Posição ["+i+"]["+j+"]:");
					if(i > 0) {
						System.out.println("Esquerda: "+mat[i][j-1]);
					}
					if(j < linhas) {
						System.out.println("Embaixo: "+mat[i+1][j]);
					}

					if(i < colun) {
						System.out.println("Direita: "+mat[i][j+1]);
					}
				}
			}
		}
		

	}

}
