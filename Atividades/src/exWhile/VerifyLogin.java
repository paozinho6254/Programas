package exWhile;

import java.util.*;

public class VerifyLogin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String user = "admin", senha = "1234", atempSenha, atempUser; 
		int atemp = 0;
		
		System.out.print("Nome de usuário: ");
		atempUser = input.next();
		System.out.print("Senha: ");
		atempSenha = input.next();
		
		if(atempUser.equals(user) && atempSenha.equals(senha)) {
			System.out.println("Acesso liberado");
		}
		else if(atempUser != user || atempSenha != senha) {
			while(atemp < 2) {
				System.out.println("Usuário ou senha incorretos");
				System.out.print("Nome de usuário: ");
				atempUser = input.next();
				System.out.print("Senha: ");
				atempSenha = input.next();
				if(atempUser.equals(user) && atempSenha.equals(senha)) {
					atemp = 3;
				}
				else {
					atemp++;
				}
			}
		}
		if(atempUser.equals(user) && atempSenha.equals(senha) && atemp == 3) {
			System.out.println("Acesso liberado");
		}
		else if(atemp == 2) {
			System.out.println("limite de tentativas atingido!");
		}
		input.close();		
	}

}
