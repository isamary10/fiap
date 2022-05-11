package heranca11052022;

import java.util.Date;

public class Pessoa {
	private String nome;
	private String cpf;
	private Date data_nascimento;
	
	public Pessoa(String nome, String cpf, Date data_nascimento) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setData_nascimento(data_nascimento);
	}
	
	public double tirarCopias(int qtde) {
		return 0.10 * qtde;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	
	
}
