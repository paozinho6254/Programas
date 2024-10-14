package testes;

import entidades.ListAumento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListAumentoTeste {

	public static void main(String[] args) {
		
		List<ListAumento> lista = new ArrayList<>();

		Scanner input = new Scanner(System.in);

		

		System.out.print("Quantos funcionários serão registrados? ");

		int n = input.nextInt();

	

		for(int i = 0; i < n; i++) {

			System.out.println("Funcionario "+(i+1)+": ");
			System.out.print("ID: ");
			Integer id = input.nextInt();
			System.out.print("Nome: ");
			input.nextLine();
			String nome = input.nextLine();
			System.out.print("Salário: ");
			double salario = input.nextDouble();
			
			ListAumento funcionario = new ListAumento(id, salario, nome);

			lista.add(funcionario);
			
		}

		System.out.print("Digite o id do funcionário que terá um aumento de salário: ");
		int srcID = input.nextInt();
		Integer pos = obterId(lista, srcID);
		if(pos == null) {
			System.out.println("Usuário inválido!");
		}
		else {
			System.out.print("Digite a porcentágem do aumento: ");
			double perc = input.nextDouble();
			lista.get(pos).addSalario(perc);
		}
		
		System.out.println("Funcionários: ");
		for(ListAumento funcionario: lista) {
			System.out.println(funcionario);
		}
		
		input.close();
	}

	
	public static Integer obterId(List<ListAumento> lista, int id) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
}
