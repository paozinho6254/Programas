package entidades;

public class ListAumento {

	private Integer id;
	private String nome;
	private double salario;
	

	public ListAumento() {

		

	}

	public ListAumento(Integer id, double salario, String nome) {

		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}


	public Integer getId() {

		return id;

	}

	public void setId(Integer id) {

		this.id = id;

	}

	

	public double getSalario() {

		return salario;

	}

	public void setSalario(double salario) {

		this.salario = salario;

	}

	

	public String getNome() {

		return nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	
	public String toString() {
		return id 
				+", "
				+nome
				+", R$"
				+salario;	
				}
	
	public double addSalario(double valor) {

		return salario += ((valor/100)*salario);

	}
	
}
