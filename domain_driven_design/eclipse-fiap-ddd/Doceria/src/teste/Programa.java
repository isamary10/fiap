package teste;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
//		Doce doce;
//		doce = new Doce();
//		doce.setLeite(100);
//		doce.setAcucar(30);
//		System.out.println("A quantidade de leite é: " + doce.getLeite() + " ml" +
//				"\nA quantidade de açucar é: " + doce.getAcucar()
//		);
		
		Brigadeiro brigadeiro;
		brigadeiro = new Brigadeiro();
//		brigadeiro.setLeite(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de leite: ")));
//		brigadeiro.setAcucar(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de açucar: ")));
//		brigadeiro.setChocolate(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Chocolate: ")));
		
		/*
		brigadeiro.setLeite(100);
		brigadeiro.setAcucar(30);
		brigadeiro.setChocolate(100);
		*/
		
		System.out.println("A quantidade de leite do brigadeiro é: " + brigadeiro.getLeite() +
				"\nA quantidade de leite do brigadeiro é: " + brigadeiro.getAcucar() +
				"\nA quantidade de leite do brigadeiro é: " + brigadeiro.getChocolate()
				);
		
		Beijinho beijinho;
		beijinho = new Beijinho(100,30,70, "Beijinho Beijoca");
	
//		beijinho.setLeite(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de leite: ")));
//		beijinho.setAcucar(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de açucar: ")));
//		beijinho.setApelido(JOptionPane.showInputDialog("Digite a quantidade de Chocolate: ");
		
//		beijinho.setLeite(100);
//		beijinho.setAcucar(30);
//		beijinho.setCoco(70);
//		beijinho.setApelido("Beijinho bejocas");
 
		
		beijinho.mostrarOi();
		beijinho.mostrarAdeus();
		
		System.out.println("\nA quantidade de leite do beijinho é: " + beijinho.getLeite() +
				"\nA quantidade de açucar do beijinho é: " + beijinho.getAcucar() +
				"\nA quantidade de coco do beijinho é: " + beijinho.getCoco() +
				"\nO apelido do beijinho da Vovó é: " + beijinho.getApelido()
				);
	}

}
