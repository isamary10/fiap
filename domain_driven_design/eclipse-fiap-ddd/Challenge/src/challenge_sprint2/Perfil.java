package challenge_sprint2;

import java.util.Scanner;

public class Perfil extends Menu {
	//Atributos
	private String nome;
	private String sobrenome;
	private String opcao;
	//Getters & Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
		public String getOpcao() {
			return opcao;
		}
		public void setOpcao(String opcao) {
			this.opcao = opcao;
		}

		//Método Construtor
		public Perfil() {
		}
		public Perfil(String recebeNome, String recebeSobrenome) {
			this.nome = recebeNome;
			this.sobrenome = recebeSobrenome;
		}
			//Métodos
		public void aplicarPerfil() {
			Scanner input = new Scanner(System.in);
			System.out.println("\nDeseja editar seu perfil agora? )");
			System.out.println("(1=Sim)");
			System.out.println("(2=Não)");
			int perfil = input.nextInt();
		if (perfil == 1){
			System.out.println("Ok, preencha as informações a baixo");
			System.out.println("Informe seu pais: ");
			String pais = input.next();
			System.out.println("Qual o seu CEP?: ");
			String cep = input.next();
			System.out.println("Precisamos do seu RG: ");
			String rg = input.next();
			System.out.println("Quais são seus idiomas?: ");
			String idioma = input.next();
			System.out.println("\nMuito obrigado pelas suas informações, já estão guardadas");
		}else if (perfil == 2){
			System.out.println("\nTranquilo");
			}
		}
		public void editarPerfil() {

		}
		public void apagarPerfil() {
		}
	}

