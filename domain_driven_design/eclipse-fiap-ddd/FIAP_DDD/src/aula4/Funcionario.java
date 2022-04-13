package aula4;

public class Funcionario {
	private String nome;
	private double salario;
	private String departamento;
	private String admissao;
	private String rg;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getAdmissao() {
		return admissao;
	}
	
	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public double aumentarSalario(double perc) {
		double novoSalario = this.salario + (this.salario * (perc / 100));
		return novoSalario;
	}
	
	public double calculoGanhoReal(double novoSalario) {
		double ganhoReal = novoSalario - salario;
		return ganhoReal;
	}
	
}
	
