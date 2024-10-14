package entidades;

public class Funcionario {
	
	public String nome;
	public double salario; 
	
	public double taxacao(double taxa) {
		return this.salario -= taxa;
	}
	public String toString() {
		return "\n"
				+nome
				+", $"
				+String.format("%.2f", salario);
	}
	
	public double aumento(double aumento){
		return salario *= ((aumento/100)+1);
	}
	
}
