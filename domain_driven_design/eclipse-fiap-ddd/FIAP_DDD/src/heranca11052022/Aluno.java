package heranca11052022;

import java.util.Date;


public class Aluno extends Pessoa{
	private String matricula;

	public Aluno(String nome, String cpf, Date data_nascimento) {
		super(nome, cpf, data_nascimento);
		
	}

	public double tirarCopias(int qtde) {
		return 0.07 * qtde;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
