package classes_abstratas1;

public abstract class Empregado {
	private String nome;
	private String sobrenome;
	private String cpf;
	
	public Empregado() {
		
	}
	
	public Empregado(String nome, String sobrenome, String cpf) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setCpf(cpf);
	}
	
	public abstract double vencimento();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
