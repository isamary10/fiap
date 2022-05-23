package cp3;

public class PessoaJuridica extends Contribuinte {
	public PessoaJuridica(String nome, double renda) {
		super(nome, renda);
	}
	
	public double calcularImposto() {
		double calculo = 0;
		calculo = (this.getRenda()/100) * 10;
		return calculo;
	}
}
