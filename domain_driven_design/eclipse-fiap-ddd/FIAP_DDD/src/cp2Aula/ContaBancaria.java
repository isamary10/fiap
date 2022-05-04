package cp2Aula;

public class ContaBancaria {
	private int numConta;
	private String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	// Método Contrutor
	public ContaBancaria() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	// Métodos operacionais / personalizados
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if(tipo.equals("cc")) {
			this.setSaldo(50);
		} else if(tipo.equals("cp")) {
			this.setSaldo(150);
		}
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("A conta não pode ser encerrada. Conta com saldo positivo de " + this.getSaldo());
		}else if(this.getSaldo() < 0) {
			System.out.println("A conta não pode ser encerrada. Conta com saldo negativo de " + this.getSaldo());
		}else {
			this.setStatus(false);
			System.out.println("Conta encerrada com sucesso!");
		}
	}
	
	public void depositar(float valor) {
		if(isStatus() == true) {
			this.saldo += valor;
			System.out.println("Depósito realizado na conta de: " + this.getDono() + " no valor de " + valor);
		}else {
			System.out.println("Não foi possível realizar o depósito. Conta esta ATIVA!");
			//System.out.println("Não foi possível realizar o depósito. " + (this.isStatus()? "Conta ativa":"Conta Inativa"));
		}
	}
	
	public void sacar(float valor) {
		if(isStatus()) {
			if(this.getSaldo() > valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado com sucesso no valor de " + valor);
			}else {
				System.out.println("Saldo insuficiente para saque!");
			}
		}else {
			System.out.println("Conta inativa!");
		}
	}
	
	public void pagarMensalidade() {
		float valor = 0;
		if(tipo.equals("cc")) {
			valor = 12;
		}else if(tipo.equals("cp")) {
			valor = 20;
		}
		if(this.isStatus()) {
			this.saldo -= valor;
			System.out.println("Obrigado " + this.getDono() + ". Mensalidade paga com sucesso.");
		}
		else {
			System.out.println("Conta inativa");
		}
	}
	
	public void estadoAtual() {
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Titular: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + (this.isStatus()? "Ativa":"Inativa"));
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

