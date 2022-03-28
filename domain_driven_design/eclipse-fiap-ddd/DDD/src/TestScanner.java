import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		
		// declaração de variáveis
		double n1, n2, media;
		// Criação de objeto para trabalhar com método
		Scanner input = new Scanner(System.in);
		
		System.out.println("*-- Calcula média --*");
		
		// método do Scanner
		System.out.println("Nota 1: ");
		n1 = input.nextDouble();
		
		System.out.println("Nota 2: ");
		n2 = input.nextDouble();
		
		// processamento
		media = (n1 + n2) / 2;
		System.out.println("Média: " + media);
	}
}
