package vetores;

import java.util.Scanner;

public class VetorComMetodos {
	//Método informa o tamanho do vetor
	public int tamanhoVetor() {
		System.out.println("*---TAMANHO DO VETOR---*");
		Scanner input = new Scanner(System.in);
		System.out.println("Qual o tamanho do vetor: ");
		int tamanho = input.nextInt();
		return tamanho;
	}
	
	//Método para criar o vetor com o tamanho declarado no método tamanhoVetor
	public int[] criaVetor(int tamanho) {
		System.out.println("*---CRIA O VETOR---*");
		int[] vetor = new int[tamanho];
		return vetor;
	}
	
	//Método para popular o vetor criado
	public int[] populaVetor(int[] vetor) {
		System.out.println("*---POPULA O VETOR---*");
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i < vetor.length; i++) {
			System.out.printf("vetor[%d]: ", i);
			vetor[i] = input.nextInt();
		}
		return vetor;
	}
	
	//Método para imprimir o vetor populado
	public void imprimiVetor(int[] vetor) {
		System.out.println("*---IMPRIME O VETOR---*");
		for(int i=0; i<vetor.length; i++) {
			System.out.printf("vetor[%d]: %d \n", i, vetor[i]);
		}
	}
	
	//Método para verificar quantas vezes o n aparece no vetor populado
	public int verificarOcorrencias(int[] vetor, int num) {
		System.out.println("*---VERIFICA QUANTIDADES IGUAIS AO NUM---*");
		int cont = 0;
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i] == num) {
				cont++;
			}
		}
		return cont;
	}
}
