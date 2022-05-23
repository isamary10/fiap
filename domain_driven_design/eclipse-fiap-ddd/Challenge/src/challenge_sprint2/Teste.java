package challenge_sprint2;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		System.out.println("Seja bem vindo");
		System.out.println("Digite 1 para Cadastrar \n2 para Logar");
		Scanner input = new Scanner(System.in);
		Menu usuario = new Menu();
		usuario.validacao();
		Perfil perfil = new Perfil();
		perfil.aplicarPerfil();
		perfil.logout();
		Vaga vagas = new Vaga();
		vagas.pesquisa();
		vagas.candidatar();
		vagas.logout();

	}

}
