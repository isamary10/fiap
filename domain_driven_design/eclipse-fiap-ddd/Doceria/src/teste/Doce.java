package teste;

public class Doce {
	private int leite;
	private int acucar;
	
	Doce(){
		
	}
	
	Doce(int recebeLeite, int recebeAcucar){
		this.leite = recebeLeite;
		this.acucar = recebeAcucar;
	}
	
	public int getLeite() {
		return leite;
	}
	public void setLeite(int leite) {
		this.leite = leite;
	}
	public int getAcucar() {
		return acucar;
	}
	public void setAcucar(int acucar) {
		this.acucar = acucar;
	}
	
}
