package contrutores1;

public class TesteCaixa {
	public static void main(String[] args) {
		Caixa c1 = new Caixa();
		System.out.println("Volume c1: " + c1.volumeCaixa());
		
		System.out.println("=================");
		Caixa c2 = new Caixa(10, 20, 15);
		System.out.println("Volume c2: " + c1.volumeCaixa());
		
		c2.setAltura(30);
		System.out.print(c2.getAltura());
	}
}
