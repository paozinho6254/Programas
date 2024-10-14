package testes;

import java.util.Scanner;
import entidades.Estoque; 

public class EstoqueTeste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Olá!\nDigite o nome do produto: ");
		String nome = input.nextLine();
		System.out.print("Digite o preço do produto: R$");
		double preco = input.nextDouble();
		Estoque produto = new Estoque(nome,preco);
		
		produto.setName("Receba");
		System.out.println("\nUpdated name: "+produto.getName());
		produto.setPrice(1200);
		System.out.println("\nUpdated price: "+produto.getPrice());
		
		produto.showData();
		
		System.out.print("Digite a quantidade a ser adicionada: ");
		int quantidade = input.nextInt();
		produto.addQtd(quantidade);
		
		produto.showData();
		
		System.out.print("\nDigite a quantidade a ser retirada: ");
		quantidade = input.nextInt();
		produto.minusQtd(quantidade);
		
		produto.showData();
		
		input.close();
	}
}
