package construtores;

import java.util.Scanner;

public class TesteUsuario {
	public static void main(String[]args) {
		
		// criando um objeto Scanner / input é um atributo local
		Scanner input = new Scanner(System.in);
		
		Usuario user1 = new Usuario();
		
		// entrada de dados pelo teclado
		System.out.println("Usuário: ");
		String login = input.next();
		System.out.println("Senha: ");
		int password = input.nextInt();
		
		// configurando o usuário e senha
		user1.alterarUsuario(login);
		user1.alterarSenha(password);
		
		// criação de atributos locais para teste e recebendo os dados do objeto user1
		String usuario = user1.obterUsuario();
		int senha = user1.obterSenha();
		String user = user1.obterUser();
		int pwd = user1.obterPdw();
		
		// status também é uma variável local - Validando o usuário
		boolean status = user1.validarUsuario(user, pwd, usuario, senha);
		
		// imprimindo o status do usuário
		user1.imprimirStatus(status);
		
//		Usuario user2 = new Usuario();
//		
//		System.out.println("User1: " + user1.obterUser());
//		System.out.println("pwd: " + user1.obterPdw());
//		System.out.println("User2: " + user2.obterUser());
//		System.out.println("pwd: " + user2.obterPdw());
//		
//		System.out.println(user1);
//		System.out.println(user2);
	}
}
