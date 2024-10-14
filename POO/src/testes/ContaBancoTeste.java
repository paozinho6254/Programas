package testes;

import java.util.Scanner;
import entidades.ContaBanco;

public class ContaBancoTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bem vindo!\nPrimeiramente inicie seu cadastro digitando seu nome.\nNome: ");
		String nome = input.nextLine();
		System.out.print("Número da conta: ");
		int num = input.nextInt();
		
		ContaBanco conta = new ContaBanco(nome, num);
		
		System.out.print("Deseja fazer um depósito inicial (S/N): ");
		char resp = input.next().charAt(0);
		
		if(resp == 'S' || resp == 's') {
			System.out.print("Digite um depósito inicial: R$");
			conta.setSaldoConta(input.nextDouble());
		}
		
		System.out.println(conta);
		
		System.out.print("\nDigite um valor de depósito: ");
		double valor = input.nextDouble();
		
		conta.deposito(valor);
		
		System.out.println(conta);
		
		System.out.print("\nDigite um valor do extrato: ");	
		valor = input.nextDouble();
		conta.extrato(valor);
		
		System.out.println(conta);
			
		input.close();
	}
}
