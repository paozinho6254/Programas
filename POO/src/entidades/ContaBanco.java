package entidades;

public class ContaBanco {
	private int numConta;
	private String nomeConta;
	private double saldoConta;
	
	public ContaBanco() {
		
	}

	public ContaBanco(String nome, int num, double valor) {
		this.nomeConta = nome;
		this.numConta = num;
		this.saldoConta = valor;
	}
	
	public ContaBanco(String nome, int num) {
		this.nomeConta = nome;
		this.numConta = num;
		this.saldoConta = 0;
	}
	
	
	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public String toString() {
		return "\nDados da conta:\n"
				+"Titular "
				+nomeConta
				+", Saldo R$"
				+saldoConta
				+", Conta "
				+numConta;
	}
	
	public double deposito(double valor) {
		return this.saldoConta += valor;
 	}
	
	public double extrato(double valor) {
		return this.saldoConta -= 5+valor;
 	}
	
}
