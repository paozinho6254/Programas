package testes;

import entidades.Funcionario;
import java.util.Scanner;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario funfa = new Funcionario();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nome: ");
		funfa.nome = input.nextLine();
		
		System.out.print("Salário Bruto: ");
		funfa.salario = input.nextDouble();
		
		System.out.print("Taxação: ");
		double taxa = input.nextDouble();
		
		funfa.taxacao(taxa);
		
		System.out.println(funfa);
		
		System.out.println("Insira o valor em porcentagem para aumentar "
				+ "salário do pobre: ");
		double aumento = input.nextDouble();
		
		funfa.aumento(aumento);
		
		System.out.println(funfa);
		
		input.close();
	}
}
