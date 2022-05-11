package heranca11052022;

import java.util.Date;

public class TestaPessoa {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Isa", "12345623", new Date());
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("CPF: " + aluno1.getCpf());
		System.out.println("Data Nascimento: " + aluno1.getData_nascimento());
		System.out.println("Total de impressão: " + aluno1.tirarCopias(25));
	}

}
