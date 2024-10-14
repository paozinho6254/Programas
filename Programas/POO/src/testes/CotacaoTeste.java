package testes;

import entidades.Cotacao;
import java.util.Scanner;

public class CotacaoTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Valor do dolar: ");
		double valor = input.nextDouble();
		System.out.print("Quantos dolares serão comprados?");
		double compra = input.nextDouble();
		
		System.out.println("Valor a ser pago em reais = "+Cotacao.cotacao(valor, compra));
		
		
		input.close();	}
}
