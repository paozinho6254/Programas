package entidades;

public class Estoque {
	
	private String nomeProduto;
	private int quantidadeProduto;
	private double precoProduto;
	
	public Estoque(String nome, int quantidade, double preco) {
		this.nomeProduto = nome;
		this.quantidadeProduto = quantidade;
		this.precoProduto = preco;
	}
	
	public Estoque(String nome, double preco) {
		this.nomeProduto = nome;
		this.precoProduto = preco;
	}
	
	public String getName() {
		return nomeProduto;
	}
	
	public void setName(String name) {
		this.nomeProduto = name;
	}
	
	public double getPrice() {
		return precoProduto;
	}
	
	public void setPrice(double price) {
		this.precoProduto = price;
	}
	
	
	
	public void showData() {
		System.out.println("\nDados do Produto:\n"+nomeProduto
		+", "+quantidadeProduto
		+" unidades, R$"+String.format("%.2f", precoProduto)
		+" cada, Valor total no estoque = R$"+String.format("%.2f", precoProduto*quantidadeProduto));
	}
	
	//Observe o seguinte: "this" é usado para se referir ao atributo do OBJETO,
	//Enquanto o "quantidade" é o valor q obetemos na classe Estoque Teste
	public int addQtd(int quantidade){
		return this.quantidadeProduto += quantidade;
	}
	
	public int minusQtd(int quantidade) {
		return this.quantidadeProduto -= quantidade;
	}
}
