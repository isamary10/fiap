package cp3;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		System.out.println("==============Pessoa Física=================");
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		String pf = input.nextLine();
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Digite a renda: ");
		double renda = userInput.nextDouble();
		
		PessoaFisica pf1 = new PessoaFisica(pf, renda);
		System.out.println("Nome:" + pf1.getNome());
		System.out.println("Renda:" + pf1.getRenda());
		System.out.println("Imposto retido: " + pf1.calcularImposto());
		
		System.out.println("==============Pessoa Jurídica=================");
		Scanner inputpj = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		String nomePj = inputpj.nextLine();
		
		
		Scanner userInputpj = new Scanner(System.in);
		System.out.println("Digite a renda: ");
		double rendaPj = userInputpj.nextDouble();
		
		PessoaJuridica pj = new PessoaJuridica(nomePj, rendaPj);
		System.out.println("Nome fantasia: " + pj.getNome());
		System.out.println("Renda: " + pj.getRenda());
		System.out.println("Imposto retido: " + pj.calcularImposto());
	}

}
