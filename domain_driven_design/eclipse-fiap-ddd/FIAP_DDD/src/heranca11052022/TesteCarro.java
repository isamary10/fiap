package heranca11052022;

public class TesteCarro {
	public static void main(String[] args) {
		Honda carro1 = new Honda(60000,  "Honda Accord", "2.0 Flex");
		System.out.println("----------Carro1------------");
		System.out.println("Preço: " + carro1.getPreco());
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Motor: " + carro1.getMotor());
	}
}
