package cp2;

public class ContaBancaria {
	private int numConta;
	private String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public ContaBancaria() {
		saldo = 0;
		status = false;
	}
	
	public void abrirConta(String tipo, double saldo) {
		if (tipo == "cc") {
			setStatus(true);
			this.tipo = "Conta Corrente";
			this.dono = "Maria";
			this.saldo += 50;
			this.numConta = 12345;
		}
		else if (tipo == "cp"){
			setStatus(true);
			this.tipo = "Conta Poupança";
			this.dono = "José";
			this.saldo += 150;
			this.numConta = 678910;
		}
	}
	
	public void estadoAtual(){
		System.out.println("Número da Conta: " + numConta);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Nome do Cliente: " + dono);
		System.out.println("Saldo da Conta: " + saldo);
		System.out.println("Status da Conta: " + status);
	}
	
	public void depositar(double valor) {
		if (status == true) {
			saldo += valor;
			System.out.println("O valor do seu depósito é de " + valor + " e o seu saldo atual é de " + saldo);
		}
	}
	
	public void sacar(double valor) {
		if (saldo > 0 && valor <= saldo && status == true) {
			saldo -= valor;
			System.out.println("O valor do seu saque é de " + valor + " e o seu saldo atual é de " + saldo);
		}else {
			System.out.println("Você não possui saldo o suficiente para sacar");
		}
	}
	
	public void pagarMensalidade() {
		if (status == true && tipo == "cc") {
			saldo -= 12;
		}
		else if (status == true && tipo == "cp"); {
				saldo -= 20;
		}
	}
	
	public void fecharConta() {
		if (status == true && saldo == 0) {
			status = false;
			System.out.println("Conta encerrada!");
		}else {
			System.out.println("Você não pode fechar a sua conta pois seu saldo é " + saldo);
		}
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
