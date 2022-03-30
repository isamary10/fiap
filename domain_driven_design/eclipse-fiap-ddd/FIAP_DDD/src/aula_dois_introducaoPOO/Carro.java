package aula_dois_introducaoPOO;

public class Carro {
	String modelo;
	String marca;
	String cor;
	String placa;
	int anoFabr;
	byte qtdPortas;
	int potencia;
	
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	// Intância a classe carro
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.setModelo("Fiat");
		System.out.println(carro1.getModelo());
	}
	
}
