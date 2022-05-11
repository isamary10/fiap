package heranca11052022;

import java.util.Date;

public class Professor extends Pessoa{
	private double salario;
	private String disciplina;

	public Professor(String nome, String cpf, Date data_nascimento) {
		super(nome, cpf, data_nascimento);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}


}
