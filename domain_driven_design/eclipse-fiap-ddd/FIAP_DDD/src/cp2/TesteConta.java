package cp2;

public class TesteConta {

	public static void main(String[] args) {
		ContaBancaria contaCorrente = new ContaBancaria();
		System.out.println("Bem vinda, Maria!");
		contaCorrente.abrirConta("cc", 0);
		contaCorrente.estadoAtual();
		contaCorrente.depositar(100);
		contaCorrente.sacar(150);
		contaCorrente.fecharConta();
		
		System.out.println("===============================");
		
		
		ContaBancaria contaPoupanca = new ContaBancaria();
		System.out.println("Bem vindo, José!");
		contaPoupanca.abrirConta("cp", 0);
		contaPoupanca.estadoAtual();
		contaPoupanca.depositar(500);
		contaPoupanca.sacar(100);
		contaPoupanca.sacar(1000);
		contaPoupanca.fecharConta();
	}

}
