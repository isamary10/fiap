package cp1;

public class Contador {
	int valor = 5;
	
	public void setZerarContador(int valor) {
		this.valor = valor;
	}
	
	public void setIncrementar() {
		this.valor = this.valor + 1;
	}
	
	public int getRetornaValor() {
		return valor;
	}
	
	public static void main(String[] arg) {
		Contador valor1 = new Contador();
		valor1.setZerarContador(0);
		valor1.setIncrementar();
		int valor = valor1.getRetornaValor();
		System.out.println(valor);
		valor1.setIncrementar();
		System.out.println(valor1.getRetornaValor());
	}
}