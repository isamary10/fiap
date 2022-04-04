package cp1;

public class Lampada {
	boolean lampada;
	
	public void setLigar() {
		this.lampada = true;
	}
	
	public void setDesligar() {
		this.lampada = false;
	}
	
	public boolean getObservar() {
		return this.lampada;
	}
	
	public static void main(String[] arg) {
		Lampada lampada1 = new Lampada();
		System.out.println(lampada1.getObservar());
		lampada1.setLigar();
		System.out.println(lampada1.getObservar());
	}
}
