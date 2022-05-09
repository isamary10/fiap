package heranca;

public class Cachorro extends Animal {
	private int patas;
	
	//Polimorfismo
	public Cachorro(String especie, String cor, String habitat, int patas) {
		super(especie, cor, habitat);
		this.patas = patas;
	}

	public void fazerBarulho() {
		System.out.println("Au auuu!");
	}
	
	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
}
