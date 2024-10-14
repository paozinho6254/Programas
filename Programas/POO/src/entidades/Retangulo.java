package entidades;

public class Retangulo {
	public double altura;
	public double largura;
	
	public double area() {
		return altura * largura;
	}
	public double peri() {
		return (largura * 2) + (altura * 2);
	}
	public double diag() {
		return Math.sqrt(Math.pow(2, altura)+Math.pow(2, largura));
	}
	
	public String toString() {
		return "Área = "
				+area()
				+"\nPerímetro = "
				+peri()
				+"\nDiagonal = "
				+diag();
	}

}
