package cp3Aula;

public abstract class Contribuinte {
	private String nome;
	private double renda;
	
	public Contribuinte(String nome, double renda) {
		this.nome = nome;
		this.renda = renda;
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
	
	@Override
	public String toString() {
		return "Contribuinte \nNome: " + nome + "\nRenda Bruta: R$ " + renda + "\n";
	}
	
	public abstract double calcularImposto();
	
}
