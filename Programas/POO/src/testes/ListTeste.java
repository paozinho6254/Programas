package testes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListTeste {

	public static void main(String[] args) {
		
		//Como inicia a lista
		List<String> lista = new ArrayList<>();
	
		//Aqui os itens são adicionados a lista
		lista.add("Antônio");
		lista.add("Pãozinho");
		lista.add("Bora Bill");
		lista.add("Receba");
		lista.add("Amostradinho");
		
		//Escreve o tamanho da lista
		System.out.println(lista.size());
		
		/*comando for each, onde "x" é como um índice que vai ler a lista, 
		basicamente não precisa ter um tamamho específico, lerá todos que estiverem no array
		*/
		for(String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------------");
		//Qual quer nome na lista que comece com R ("CharAt(0)") será removido da lista
		lista.removeIf(x -> x.charAt(0) == 'R');
		
		System.out.println(lista.size());
		
		for(String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------------");
		
		//Aqui mostra a posição de onde o item está na lista
		System.out.println("index of Amostradinho = "+lista.indexOf("Amostradinho"));
		
		System.out.println("-------------------------------------");
		
		//É um filtro que só mostrará nome com a letra "A"
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------------");
		
		/*Este comando irá filtrar para que apareça o primeiro nome com a letra "P", em que caso ele não encontre
		o sistema irá informar "null" (nulo)
		*/
		String name = lista.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);	
		System.out.println(name);
		
	}	
}
