package contrutores1;

import java.util.Scanner;

public class Caixa {
	private double largura;
	private double altura;
	private double profundidade;
	
	// Construtor
	public Caixa() {
		System.out.println("Contrução da Caixa");
		this.largura = 10;
		this.altura = 10;
		this.profundidade = 10;
	}
	
	
	// Construtor parametrizado
	public Caixa(double l, double a, double p) {
		largura = l;
		altura = a;
		profundidade = p;
	}
	
	public double volumeCaixa() {
		System.out.println("Calculando o volume da caixa");
		return largura * altura * profundidade;
	}

	public void entradaDados() {
		System.out.println("Entrada de Dados");
		Scanner input = new Scanner(System.in);
		System.out.println("Largura: ");
		double larg = input.nextDouble();
		System.out.println("Altura: ");
		double alt = input.nextDouble();
		System.out.println("Profundidade: ");
		double prof = input.nextDouble();
		// Configurando os dados do objeto
		setLargura(larg);
		setAltura(alt);
		setProfundidade(prof);
	}
	
	public double entradaDados2() {
		System.out.println("Entrada de Dados 2");
		Scanner entrada = new Scanner(System.in);
		double num = entrada.nextDouble();
		return num;
	}

	public double getLargura() {
		return largura;
	}


	public void setLargura(double largura) {
		this.largura = largura;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getProfundidade() {
		return profundidade;
	}


	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}
	
}
