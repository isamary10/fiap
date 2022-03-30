package aula_dois_introducaoPOO;

/* os atributos não podem ser acessados dessa forma, somente através dos métodos.
 * Olhar a classe Carro que esta correta. 
 */

public class Caes {
	// Atributos ou variáveis
	String nome;
	String raca;
	int idade;
	float peso;
	String corOlhos;
	char sexo;
	
	// Métodos
	public void andar() {
		System.out.println("ANDAR...");
	}
	
	public void parar() {
		System.out.println("PARAR...");
	}
	
	public void dormir() {
		System.out.println("DORMIR...");
	}
	
	public void latir() {
		System.out.println("LATIR...");
	}
	
	public void comer() {
		System.out.println("COMER...");
	}
	
	public static void main(String args[]) {
		// criação do objeto cachorro1
		Caes cachorro1 = new Caes();
		cachorro1.nome = "Pluto";
		cachorro1.corOlhos = "azuis";
		cachorro1.idade = 5;
		cachorro1.peso = 10.2f; // casting para float / o f força ser do tipo float
		cachorro1.raca = "Pitbull";
		cachorro1.sexo = 'M';
		
		Caes cachorro2 = new Caes();
		cachorro2.nome = "Scooby";
		cachorro2.corOlhos = "castanhos";
		cachorro2.idade = 10;
		cachorro2.peso = 6.4f;
		cachorro2.raca = "Buldogue";
		cachorro2.sexo = 'M';
		
		// imprimindo as informacões dos objetos (cachorro1 e cachorro2)
		System.out.println("Nome " + cachorro1.nome);
		System.out.println("Raça " + cachorro1.raca);
		System.out.println("Sexo " + cachorro1.sexo);
		System.out.println("Cor dos olhos " + cachorro1.corOlhos);
		System.out.println("O cachorro tem " + cachorro1.idade + " anos e pesa " + cachorro1.peso);
		cachorro1.latir();
		
		
		System.out.println("");
		System.out.println("Nome: " + cachorro2.nome);
		System.out.println("Raça: " + cachorro2.raca);
		System.out.println("Sexo: " + cachorro2.sexo);
		cachorro2.andar();
	}
}
