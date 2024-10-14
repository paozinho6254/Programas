package programas;

import entidades.Pensionato;
import java.util.Scanner;

public class PensionatoTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Pensionato[] vetor = new Pensionato[10];
		
		System.out.print("Quantidade de estudantes que ocuparão os quartos: ");
		int n = input.nextInt();
		
		
		for(int i = 0; i < n; i++) {
			System.out.println("Qual quarto você deseja?");
			int num = input.nextInt();
			--num;
			System.out.println("Nome do reserva: ");
			input.nextLine();
			String nome = input.nextLine();
			
			System.out.println("Email do reserva: ");
			String email = input.next();
			
			vetor[num] = new Pensionato(nome, email);
			 
		}
		
		System.out.println("Quartos que foram ocupados: ");
		for(int i = 0; i < 10; i++) {
			if(vetor[i] != null) {
			System.out.println((i+1)+": "+vetor[i]);
			}
		}
	
		input.close();
		
	}
}
