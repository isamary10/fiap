package challenge_sprint2;

import java.util.Scanner;

public class Vaga extends Perfil {
	private String area;
	private boolean status;
	private String opcao;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Vaga() {
	}

	public Vaga(String recebeArea, boolean recebeStatus) {
		this.area = recebeArea;
		this.status = recebeStatus;
	}

	public void pesquisa() {
		Scanner input = new Scanner(System.in);
		System.out.println("Deseja realizar algo a mais?");
		System.out.println("(3 = Candidatar para Vagas)");
		System.out.println("(4 = Deslogar)");
		int pesquisa = input.nextInt();
		if (pesquisa == 3) {
			System.out.println("Em qual vaga você tem interesse?: ");
			String vaga = input.next();
		}
	}

	public void candidatar() {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Temos as seguintes empresas: \n1=Google \n2=Apple \n3=Tesla \nEm qual deseja se candidatar?:");
		int empresa = input.nextInt();
		if (empresa == 1) {
			System.out.println("Já puxamos seu perfil, muito obrigado pela candidatura!");
			System.out.println("\nDeseja realizar algo a mais?");
			System.out.println("(3 = Candidatar para Vagas)");
			System.out.println("(4 = Deslogar)");
		} else if (empresa == 2) {
			System.out.println("Adoramos seu currículo, te daremos retorno em breve!");
			System.out.println("\nDeseja realizar algo a mais?");
			System.out.println("(3 = Candidatar para Vagas)");
			System.out.println("(4 = Deslogar)");
		} else if (empresa == 3) {
			System.out.println("Precisamos de pessoas como você, te esperamos em breve após a sua aprovação");
			System.out.println("\nDeseja realizar algo a mais?");
			System.out.println("(3 = Candidatar para Vagas)");
			System.out.println("(4 = Deslogar)");
		} else {
			System.out.println("Empresa não cadastrada!");
			System.out.println("\nDeseja realizar algo a mais?");
			System.out.println("(3 = Candidatar para Vagas)");
			System.out.println("(4 = Deslogar)");
		}
	}

	public void cancelarCandidatura() {
	}
}
