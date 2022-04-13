package aula4;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		f1.setNome("Diogo");
		f1.setAdmissao("13/04/2021");
		f1.setDepartamento("Tecnologia");
		f1.setRg("12.345.678-2");
		f1.setSalario(6000.00);
		
		f2.setNome("Nicolas");
		f2.setAdmissao("24/11/2020");
		f2.setDepartamento("Comercial");
		f2.setRg("25.452.289-7");
		f2.setSalario(5000.00);
		
		System.out.println("------------------ FUNCIONÁRIO 1 ------------------------");
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Departamento: " + f1.getDepartamento());
		System.out.println("RG: " + f1.getRg());
		System.out.println("Admissão: " + f1.getAdmissao());
		System.out.println("Salário: " + f1.getSalario());
		
		double novoSalario = f1.aumentarSalario(15);
		System.out.println("Novo Salário: " + novoSalario);
		double r1 = f1.calculoGanhoReal(novoSalario);
		System.out.println("Ganho Real: " + r1);
		
		System.out.println("------------------ FUNCIONÁRIO 2 ------------------------");
		System.out.println("Nome: " + f2.getNome());
		System.out.println("Departamento: " + f2.getDepartamento());
		System.out.println("RG: " + f2.getRg());
		System.out.println("Admissão: " + f2.getAdmissao());
		System.out.println("Salário: " + f2.getSalario());
		
		double novoSalario2 = f2.aumentarSalario(10);
		System.out.println("Novo Salário: "  + novoSalario2);
		double r2 = f2.calculoGanhoReal(novoSalario2);
		System.out.println("Ganho Real: " + r2);
		
	}

}
