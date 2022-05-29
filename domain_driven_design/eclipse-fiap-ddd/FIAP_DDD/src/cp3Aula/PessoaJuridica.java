package cp3Aula;

public class PessoaJuridica extends Contribuinte {
	private String cnpj;
	
	public PessoaJuridica(String nome, double renda, String cnpj) {
		super(nome, renda);
		this.setCnpj(cnpj);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public double calcularImposto() {
		return super.getRenda() * 0.1;
	}
	
	public String toString() {
		return super.toString() 
				+ "Pessoa Jurídica \nCNPJ: " 
				+ this.getCnpj() 
				+ "\nImposto a ser pago R$ " 
				+ this.calcularImposto() + "\n"; 
	}
}
