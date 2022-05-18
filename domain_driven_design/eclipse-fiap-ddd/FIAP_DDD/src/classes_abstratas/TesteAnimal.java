package classes_abstratas;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		dog.fazerBarulho();
		dog.setNome("Bob");
		System.out.println("Nome do doguinho: " + dog.getNome());
		
		System.out.println("=====================================");
		Gato cat = new Gato();
		cat.fazerBarulho();
		cat.setNome("Lady");
		System.out.println("Nome da gatinha: " + cat.getNome());
	}

}
