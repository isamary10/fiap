package estrutura_repeticao;

public class ExemploRepeticao1 {
	public static void main (String[] args) {
		String nome = "José";
		double salario = 1500;
		int cont = 0;
		System.out.println("Salário inicial: " + salario);
		
		while(salario < 5000) { 
			salario = salario + (salario * 0.1);
			System.out.println("Novo salário: " + salario);
			cont++; // é igual a cont = cont + 1
		}
		
		// print - print com formatação (format)
		// %s  String / %d - int / %c - caractere / %f - float ou double
		System.out.printf("%s, seu salário final é de R$ %.2f \n ", nome, salario);
		System.out.printf("%s trabalha a %d meses em nossa empresa\n", nome, cont);
		System.out.println("Tempo: " + cont + " meses");
	}

}
