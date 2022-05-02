package cp1;

public class Contador {
	int valor;
	
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
		System.out.println(valor1.getRetornaValor());
		valor1.setIncrementar();
		System.out.println(valor1.getRetornaValor());
	}
}