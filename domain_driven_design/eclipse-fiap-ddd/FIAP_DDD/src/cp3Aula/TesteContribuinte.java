package cp3Aula;

public class TesteContribuinte {

	public static void main(String[] args) {
		PessoaFisica pf1 = new PessoaFisica("PF 1", 1000, "123.456.789-10");
		PessoaFisica pf2 = new PessoaFisica("PF 2", 2000, "124.457.710-11");
		PessoaFisica pf3 = new PessoaFisica("PF 3", 3000, "125.458.711-12");
		
		
		PessoaJuridica pj1 = new PessoaJuridica("PJ1", 8000, "12.345.678/0001-50");
		PessoaJuridica pj2 = new PessoaJuridica("PJ2", 9000, "13.346.679/0001-60");
		PessoaJuridica pj3 = new PessoaJuridica("PJ3", 10000, "14.347.610/0001-70");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = pf1;
		contribuintes[1] = pf2;
		contribuintes[2] = pf3;
		contribuintes[3] = pj1;
		contribuintes[4] = pj2;
		contribuintes[5] = pj3;
		
		
	}

}
