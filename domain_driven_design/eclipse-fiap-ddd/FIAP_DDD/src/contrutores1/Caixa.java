package contrutores1;

public class Caixa {
	private double largura;
	private double altura;
	private double profundidade;
	
	// Construtor
	public Caixa() {
		System.out.println("Contrução da Caixa");
		this.largura = 10;
		this.altura = 10;
		this.profundidade = 10;
	}
	
	// Construtor parametrizado
	public Caixa(double l, double a, double p) {
		largura = l;
		altura = a;
		profundidade = p;
	}
	
	public double volumeCaixa() {
		System.out.println("Calculando o volume da caixa");
		return largura * altura * profundidade;
	}


	public double getLargura() {
		return largura;
	}


	public void setLargura(double largura) {
		this.largura = largura;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getProfundidade() {
		return profundidade;
	}


	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}
	
}
