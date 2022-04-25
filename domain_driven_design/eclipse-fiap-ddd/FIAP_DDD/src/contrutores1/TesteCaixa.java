package contrutores1;

public class TesteCaixa {
	public static void main(String[] args) {
		Caixa c1 = new Caixa();
		System.out.println(c1);
		System.out.println("Altura: " + c1.getAltura());
		System.out.println("Largura: " + c1.getProfundidade());
		System.out.println("Profundidade: " + c1.getProfundidade());
		System.out.println("Volume: " + c1.volumeCaixa());
		// Alterando as especificações da caixa
		c1.setAltura(15);
		c1.setLargura(20);
		c1.setProfundidade(15);
		System.out.println("------Nova caixa------");
		System.out.println(c1.getAltura());
		System.out.println(c1.getLargura());
		System.out.println(c1.getProfundidade());
		System.out.println(c1.volumeCaixa());
	}
}
