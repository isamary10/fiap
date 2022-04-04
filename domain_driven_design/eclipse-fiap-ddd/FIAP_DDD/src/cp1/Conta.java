package cp1;

public class Conta {
	String nome = "Isa";
	int conta = 12345;
	float saldo = 5000;
	
	public void setDepositar(float valor) {
		saldo += valor;
	}
	
	public void setSacar(float valor) {
		saldo -= valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getConta() {
		return conta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.getNome();
		System.out.println(conta1.getNome());
		System.out.println(conta1.getSaldo());
		conta1.setDepositar(50);
		System.out.println(conta1.saldo);
		conta1.setSacar(200);
		System.out.println(conta1.saldo);
	}
}
