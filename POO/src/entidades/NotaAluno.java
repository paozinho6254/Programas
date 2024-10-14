package entidades;

public class NotaAluno {
	
	public String nome;
	public double nota;
	
	public double somarNota(double nota) {
		return this.nota += nota;
	}
	
	public void result() {
		if(nota > 60){
			System.out.println("Nota final = "+nota+"\nAprovado!");
		}
		else {
			System.out.println("Nota final = "+nota+"\nReprovado!\nPontos para passar = "+(60-nota));
		}
		
	}
	
}
