package heranca11052022;

import java.util.Date;

public class Funcionario extends Pessoa {
	private double salario;
	private Date data_admissao;
	private String cargo;

	public Funcionario(String nome, String cpf, Date data_nascimento) {
		super(nome, cpf, data_nascimento);
	}

}
