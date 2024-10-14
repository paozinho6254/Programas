package exWhile;

import java.util.*;



public class CadastroProdutos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome, resp;
		double preco;

		do {
			System.out.println("Insira o nome do produto: ");
			nome = input.next();
			System.out.println("Insira o preço: ");
			preco = input.nextDouble();
			System.out.println("Deseja sair?(S/N)");
			resp = input.next();
		}while(!resp.equals("S"));
		
		
		input.close();
	}
}
