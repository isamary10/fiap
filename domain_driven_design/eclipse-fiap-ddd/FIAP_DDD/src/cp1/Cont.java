package cp1;
// Correção em aula do check point 1 
public class Cont {
	// atributo
	int cont;
	
	public void zerarCont() {
		cont = 0;
	}
	
	public void incrementarCont() {
		cont += 1;
	}
	
	public int retornarCont() {
		return cont;
	}
	
	// principal
	public static void main(String[] args) {
		Cont c1 = new Cont();
		System.out.println("Contador :" + c1.retornarCont());
		c1.incrementarCont();
		System.out.println("Contador :" + c1.retornarCont());
		
	}
}
