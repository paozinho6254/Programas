package exWhile;

import java.util.Scanner;

public class TesteSenha {

	public static void main(String[] args) {
		//Abre Scanner
		Scanner input = new Scanner(System.in);
		//Senha pré-fixada, "atemp" tentativa
		String senha = "1234", atemp;
		//Comando de repetição para repetir até que atemp seja igual a senha
		do {
			System.out.println("Digite a senha: ");
			atemp = input.next();
			//Se as senhas não baterem, além de tentar de novo verá a mensagem de tente novamente
			if(!atemp.equals(senha)) {
				System.out.println("Senha errada tente novamente");
			}
		} while(!atemp.equals(senha));
		//Caso o usuário saia do comando de repetição ele é informado que acertou a senha
		System.out.println("Acertou");
		//Fecha Scan
		input.close();
	}

}
