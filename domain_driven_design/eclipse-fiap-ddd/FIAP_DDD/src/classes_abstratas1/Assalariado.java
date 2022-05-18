package classes_abstratas1;

public class Assalariado extends Empregado {
	private double salario;
	
	public double getSalario() {
		return salario;
	}

	//Quando subscrevemos o construtor da subclasse, se construi um construtor vazio
	public Assalariado() {
		super();
	}

	public Assalariado(String nome, String sobrenome, String cpf, double salario) {
		super(nome, sobrenome, cpf);
		this.setSalario(salario);
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public double vencimento() {
		return this.getSalario();
		
	}
	
}
