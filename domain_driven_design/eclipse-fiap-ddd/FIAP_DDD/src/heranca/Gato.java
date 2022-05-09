package heranca;

public class Gato extends Animal{

	public Gato(String especie, String cor, String habitat) {
		super(especie, cor, habitat);
	}
	
	public void fazerBarulho() {
		System.out.println("Miauuu!");
	}
	
}
