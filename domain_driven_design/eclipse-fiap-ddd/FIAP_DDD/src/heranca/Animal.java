package heranca;

public class Animal {
	private String especie;
	private String cor;
	private String habitat;
	
	public Animal(String especie, String cor, String habitat) {
		this.especie = especie;
		this.cor = cor;
		this.habitat = habitat;
	}
	
	public void fazerBarulho() {
		System.out.println("Fazer barulho");
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
}
