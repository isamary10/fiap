package exercicio5;

import java.util.Scanner;

public class Elevador {
	private int andarAtual;
	private int andares;
	private int capacidade;
	private int qtdPessoas;
	
	// Construtor com valores default
	public Elevador() {
		this.andarAtual = 0;
		this.andares = 12;
		this.capacidade = 8;
		this.qtdPessoas = 0;
	}
	
	// Construtor com parâmetro
	public Elevador(int cap, int qtdAndares, int andAtual, int qtdP) {
		capacidade = cap;
		andares = qtdAndares;
		andarAtual = andAtual;
		qtdPessoas = qtdP;
	}
	
	public void entradaDados() {
		System.out.println("Entrada de Dados");
		Scanner input = new Scanner(System.in);
		System.out.print("Capacidade: ");
		int capacidade = input.nextInt();
		System.out.print("Andares: ");
		int qtdAndar = input.nextInt();
		System.out.print("Andar atual: ");
		int andarAtual = input.nextInt();
		System.out.print("Quantidade pessoas elevador: ");
		int qtdPessoa = input.nextInt();
		setCapacidade(capacidade);
		setAndares(qtdAndar);
		setAndarAtual(andarAtual);
		setQtdPessoas(qtdPessoa);
	}
	
	public void setEntra(int pessoas) {
		if ((qtdPessoas + pessoas) < capacidade) {
			qtdPessoas += pessoas;
			System.out.println("Entrou " + pessoas + " pessoas no elevador e agora tem " + qtdPessoas);
		}else {
			System.out.println("Desculpe, não é possível entrar no elevador");
		}
	}
	
	public void setSai(int removePessoa) {
		if ((qtdPessoas - removePessoa) >= 1) {
			qtdPessoas -= removePessoa;
			System.out.println("Saiu " + removePessoa + " pessoas e agora tem " + qtdPessoas);
		}else {
			System.out.println("Desculpe, não tem quantidade suficiente para remover pessoas");
		}
	}
	
	public void setSobe(int sobeAndar) {
		if ((andarAtual + sobeAndar) < andares) {
			andarAtual += sobeAndar;
			System.out.println("O elevador subiu " + sobeAndar + " andares e agora esta no andar " + andarAtual);
		}else {
			System.out.println("Desculpe, impossível subir");
		}
	}
	
	public void setDesce(int desceAndar) {
		if ((andarAtual - desceAndar) >= 1) {
			andarAtual -= desceAndar;
			System.out.println("O elevador descer " + desceAndar + " andares e agora esta no andar " + andarAtual);
		}else {
			System.out.println("Desculpe, não é possível descer");
		}
	}
	
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int terreo) {
		this.andarAtual = terreo;
	}
	public int getAndares() {
		return andares;
	}
	public void setAndares(int andares) {
		this.andares = andares;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getQtdPessoas() {
		return qtdPessoas;
	}
	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	
	
}
