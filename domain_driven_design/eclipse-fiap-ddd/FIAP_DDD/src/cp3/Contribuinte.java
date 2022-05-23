package cp3;

public class Contribuinte {
	private String nome;
	private double renda;
	
	public Contribuinte(String nome, double renda) {
		this.nome = nome;
		this.renda = renda;
	}
	
	private double calcularImposto() {
		double imposto = 0;
		return imposto ;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}
	
}
