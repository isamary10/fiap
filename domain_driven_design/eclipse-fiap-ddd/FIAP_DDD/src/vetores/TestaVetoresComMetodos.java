package vetores;

import java.util.Scanner;

public class TestaVetoresComMetodos {

	public static void main(String[] args) {
		VetorComMetodos vm = new VetorComMetodos();
		int tamanho = vm.tamanhoVetor();
		int[] vetor = vm.criaVetor(tamanho);
		vetor = vm.populaVetor(vetor);
		vm.imprimiVetor(vetor);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Valor do num: ");
		int num = input.nextInt(); 
		int cont = vm.verificarOcorrencias(vetor, num);
		System.out.printf("Quantidade valor vetor[i] é igual ao num %d: %d", num, cont);
	}

}
