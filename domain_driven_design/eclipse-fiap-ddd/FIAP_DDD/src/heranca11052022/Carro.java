package heranca11052022;

public class Carro {
	private String cor;
	private double preco;
	private String modelo;
	
	public Carro() {
		
	}

	public Carro(double preco, String modelo) {
		this.cor = "PRETO";
		this.setPreco(preco);
		this.setModelo(modelo);
	}
	
	public Carro(String cor, String modelo, double preco) {
		this.setCor(cor);
		this.setModelo(modelo);
		this.setPreco(preco);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
