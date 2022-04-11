package cp1;

//  testa e usa os métodos e atributos da classe NovaLampada
public class TesteLampada {
	public static void main(String[] args) {
		NovaLampada lamp = new NovaLampada();
		System.out.println("Status: " + lamp.obterStatus());
		lamp.ligar();
		System.out.println("Status: " + lamp.obterStatus());
		lamp.desligar();
		System.out.println("Status: " + lamp.obterStatus());
		lamp.mostraStatus(lamp.obterStatus());
	}
}