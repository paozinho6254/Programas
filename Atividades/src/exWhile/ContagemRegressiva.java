package exWhile;

import java.util.Scanner;

public class ContagemRegressiva {

	public static void main(String[] args) {
		//abre Scanner
		Scanner input = new Scanner(System.in);
		
		//Contagem vai começar a partir desse número
		int numero;
		
		System.out.print("Digite um número: ");
		numero = input.nextInt();
		//Enquanto o número que o usuário inseriu for maior que 0 a contagem vai continuar
		while(numero > 0) {
			System.out.println(numero);
			//Aqui a contagem diminui
			numero--;
		}
		//O sistema saiu do laço de repetição
		System.out.println("fim");
		//Fecha o Scanner
		input.close();
	}

}
