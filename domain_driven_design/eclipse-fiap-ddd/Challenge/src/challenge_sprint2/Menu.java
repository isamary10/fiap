package challenge_sprint2;

import java.util.Scanner;

public class Menu {
	// Atributos
	private String nome;
	private String email;
	private String telefone;
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Menu() {
	}

	public Menu(String recebeNome, String recebeEmail, String recebeTelefone, String recebeSenha) {
		this.nome = recebeNome;
		this.email = recebeEmail;
		this.telefone = recebeTelefone;
		this.senha = recebeSenha;
	}

	public void validacao() {
		Scanner input = new Scanner(System.in);
		int usuario = input.nextInt();
		if (usuario == 1) {
			System.out.println("Digite seu Nome: ");
			String nome = input.next();
			System.out.println("Digite seu email: ");
			String email = input.next();
			System.out.println("Digite seu Telefone: ");
			String telefone = input.next();
			System.out.println("Digite sua Senha: ");
			String senha = input.next();
			System.out.println("Cadastro efetuado com sucesso!!!");

		} else if (usuario == 2) {
			System.out.println("Digite seu email: ");
			String email = input.next();
			System.out.println("Digite sua senha: ");
			String senha = input.next();
			System.out.println("Login efetuado com sucesso!!!");
		}
	}

	public void logout() {
		Scanner input = new Scanner(System.in);
		int deslogar = input.nextInt();
		if (deslogar == 4) {
			System.out.println("Obrigado pelo acesso, volte sempre!");
		}
	}
}
