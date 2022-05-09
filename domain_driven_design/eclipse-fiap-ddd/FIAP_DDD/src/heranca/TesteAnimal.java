package heranca;

public class TesteAnimal {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Viralata", "Preto", "Doméstico", 4);
		Gato cat = new Gato("Persa", "Branco", "Doméstico");
		
		System.out.println(dog);
		System.out.println("Espécie: " + dog.getEspecie());
		System.out.println("Cor: " + dog.getCor());
		System.out.println("Habitat: " + dog.getHabitat());
		System.out.println("Patas: " + dog.getPatas());
		dog.fazerBarulho();
		System.out.println("===============================");
		System.out.println(cat);
		System.out.println("Espécie: " + cat.getEspecie());
		System.out.println("Cor: " + cat.getCor());
		System.out.println("Habitat: " + cat.getHabitat());
		cat.fazerBarulho();
	}
}
