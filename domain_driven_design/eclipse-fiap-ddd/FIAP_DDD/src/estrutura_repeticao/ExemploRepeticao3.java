package estrutura_repeticao;

import java.util.Scanner;

public class ExemploRepeticao3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op = 0;
		boolean continuar = true;
		String nome = "Isa";
		
		while(continuar) {
			System.out.println("1-Domingo");
			System.out.println("2-Segunda");
			System.out.println("3-Terça");
			System.out.println("4-Quarta");
			System.out.println("5-Quinta");
			System.out.println("6-Sexta");
			System.out.println("7-Sábado");
			System.out.println("Opção: ");
			op = input.nextInt();
			if(op <= 7 && op >= 1) {
				continuar = false;
			}
		}
		
		switch(op) {
		case 1:
			System.out.println("Ingresso - R$ 100,00");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("Ingresso - R$ 50,00");
			break;
		case 5:
		case 6:
			System.out.println("Ingresso - R$ 80,00");
			break;
		case 7:
			System.out.println("Fechado!");
			break;
		default:
			System.out.println("Dia da semana inválido");
		}
		
		switch(nome) {
			case "Isa":
			case "isa":
			case "ISA":
				System.out.println("Correto");
				break;
			default:
				System.out.println("Incorreto");
		}
		
	}
}
