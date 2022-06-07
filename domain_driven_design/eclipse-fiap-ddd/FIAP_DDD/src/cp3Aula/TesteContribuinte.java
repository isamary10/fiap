package cp3Aula;

public class TesteContribuinte {

	public static void main(String[] args) {
		Contribuintes contribuinte = new Contribuintes();
		
		PessoaFisica pf1 = new PessoaFisica("PF 1", 1000, "123.456.789-10");
		PessoaFisica pf2 = new PessoaFisica("PF 2", 2000, "124.457.710-11");
		PessoaFisica pf3 = new PessoaFisica("PF 3", 4000, "125.458.711-12");
		
		
		PessoaJuridica pj1 = new PessoaJuridica("PJ1", 8000, "12.345.678/0001-50");
		PessoaJuridica pj2 = new PessoaJuridica("PJ2", 9000, "13.346.679/0001-60");
		PessoaJuridica pj3 = new PessoaJuridica("PJ3", 10000, "14.347.610/0001-70");
		
		contribuinte.adicionarContribuinte(pf1);
		contribuinte.adicionarContribuinte(pf2);
		contribuinte.adicionarContribuinte(pf3);
		contribuinte.adicionarContribuinte(pj1);
		contribuinte.adicionarContribuinte(pj2);
		contribuinte.adicionarContribuinte(pj3);
		contribuinte.apresentarContribuinte();
	}

}
