package classes_abstratas1;

public class Horista extends Empregado{
	private  double  precoHora;
	private double horasTrabalhadas;
	
	@Override
	public double vencimento() {
		return this.getHorasTrabalhadas() * this.getPrecoHora();
	}
	
	public double getPrecoHora() {
		return precoHora;
	}
	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}
	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	
}
