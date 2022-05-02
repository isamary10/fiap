package exercicio5;

import java.util.Scanner;

public class TesteElevador {

	public static void main(String[] args) {
		// Estanciamento com valor defaut
		Elevador elevador1 = new Elevador();
		System.out.println(elevador1.getQtdPessoas());
		System.out.println(elevador1.getAndarAtual());
		System.out.println(elevador1.getAndares());
		System.out.println(elevador1.getCapacidade());
		
		// Estanciamento com atribuição dos parâmetros
		System.out.println("====================");
		Elevador elevador2 = new Elevador(10, 15, 5, 6);
		System.out.println("Capacidade: " + elevador2.getCapacidade());
		System.out.println("Quantidade de andares: " + elevador2.getAndares());
		System.out.println("Andar atual: " + elevador2.getAndarAtual());
		System.out.println("Quantidade pessoas no elevador: " + elevador2.getQtdPessoas());
		
		// Criação do Scanner
		System.out.println("==========SCANNER==========");
		Scanner input = new Scanner(System.in);
		System.out.println("Capacidade: ");
		int capaci = input.nextInt();
		System.out.println("Quantidade andares: ");
		int qtdAnd = input.nextInt();
		System.out.println("Andar atual: ");
		int andAtu = input.nextInt();
		System.out.println("Quantidade pessoas: ");
		int qtdPess = input.nextInt();
		Elevador elevador6 = new Elevador (capaci, qtdAnd, andAtu, qtdPess);
		elevador6.setDesce(1);
		elevador6.setEntra(1);
		elevador6.setSai(1);
		elevador6.setSobe(1);
		
		
		// Testando os métodos
		System.out.println("====================");
		Elevador elevador3 = new Elevador(10, 20, 5, 5);
		elevador3.setEntra(2);
		elevador3.setSai(5);
		elevador3.setSobe(6);
		elevador3.setDesce(5);
		
		// Usando entrada de dados
		System.out.println("============IMPOSSÍVEL========");
		Elevador elevador4 = new Elevador();
		elevador4.entradaDados();
		elevador4.setEntra(20);
		elevador4.setSai(20);
		elevador4.setSobe(50);
		elevador4.setDesce(20);
		
		System.out.println("==========POSSÍVEL==========");
		Elevador elevador5 = new Elevador();
		elevador5.entradaDados();
		elevador5.setEntra(2);
		elevador5.setSai(2);
		elevador5.setSobe(3);
		elevador5.setDesce(5);
	}

}
