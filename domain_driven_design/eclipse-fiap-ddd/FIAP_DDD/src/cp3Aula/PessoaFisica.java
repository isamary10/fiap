package cp3Aula;

public class PessoaFisica extends Contribuinte{
	private String cpf;
	
	PessoaFisica(String nome, double renda, String cpf) {
		super(nome, renda);
		this.setCpf(cpf);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calcularImposto() {
		double renda = super.getRenda();
		double imposto = 0;
		
		if(renda <= 1500) {
			imposto = 0;
		}else if(renda >=1500.01 && renda <= 3000) {
			return(renda * 0.075) - 100;
		}else if(renda > 3000) {
			return(renda * 0.15) - 225;
		}
		return imposto;
	}
	
	public String toString() {
		return super.toString() + "Pessoa Física \nCPF: "
				+ this.getCpf() + "\nImposto a ser pago R$ " 
				+ this.calcularImposto() + "\n"; 
	}
}
