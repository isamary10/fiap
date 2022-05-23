package cp3;

public class PessoaFisica extends Contribuinte{

	public PessoaFisica(String nome, double renda) {
		super(nome, renda);
	}
	
	public double calcularImposto() {
		double imposto = 0;
		if(this.getRenda() <= 1500) {
			System.out.println("Isento de Imposto");
		}else if(this.getRenda() > 1500 && this.getRenda() <= 3000){
			imposto = (this.getRenda() * 7.5) / 100;
		}else {
			imposto = (this.getRenda() * 15) / 100;
		}
		return imposto;
	}
	
}
