package contrutores1;

public class TesteCaixa {
	public static void main(String[] args) {
		Caixa c1 = new Caixa();
		System.out.println("Volume c1: " + c1.volumeCaixa());
		
		System.out.println("====================");
		Caixa c2 = new Caixa(10, 20, 15);
		System.out.println("Volume c2: " + c1.volumeCaixa());
		
		c2.setAltura(30);
		System.out.println(c2.getAltura());
		
		System.out.println("====================");
		Caixa c3 = new Caixa();
		c3.entradaDados();
		System.out.println("Volume c3: " + c3.volumeCaixa());
		
		System.out.println("====================");
		
		double largura, altura, profundidade;
		System.out.println("Largura: ");
		largura = c1.entradaDados2(); // Reutilizando o objeto c1
		System.out.println("Altura: ");
		altura = c1.entradaDados2();
		System.out.println("Profundidade: ");
		profundidade = c1.entradaDados2();
		Caixa c4 = new Caixa(largura, altura, profundidade);
		System.out.println("Volume c4: " + c4.volumeCaixa());
	}
}
