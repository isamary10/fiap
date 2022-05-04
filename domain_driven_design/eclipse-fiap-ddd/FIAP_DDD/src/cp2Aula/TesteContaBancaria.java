package cp2Aula;

public class TesteContaBancaria {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria();
		conta1.estadoAtual();
		conta1.setDono("José");
		conta1.abrirConta("cc");
		conta1.setNumConta(1234);
		conta1.estadoAtual();
		conta1.depositar(500);
		System.out.println("Saldo: " + conta1.getSaldo());
		conta1.sacar(500);
		System.out.println("Saldo atual: " + conta1.getSaldo());
		conta1.pagarMensalidade();
		System.out.println("Saldo atual: " + conta1.getSaldo());
		conta1.fecharConta();
		
		System.out.println("====================================");
		ContaBancaria conta2 = new ContaBancaria();
		conta2.estadoAtual();
		conta2.setDono("Maria");
		conta2.abrirConta("cp");
		conta2.setNumConta(5678);
		conta2.estadoAtual();
		conta2.depositar(1000);
		System.out.println("Saldo: " + conta1.getSaldo());
		conta2.sacar(1130);
		System.out.println("Saldo atual: " + conta2.getSaldo());
		conta2.pagarMensalidade();
		System.out.println("Saldo atual: " + conta2.getSaldo());
		conta2.fecharConta();
		
	}

}
