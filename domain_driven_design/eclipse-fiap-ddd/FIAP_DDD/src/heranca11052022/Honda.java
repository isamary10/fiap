package heranca11052022;

public class Honda extends Carro{
	private String motor;
	
	public Honda(double preco, String modelo, String motor) {
		super(preco, modelo);
		this.setMotor(motor);
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
	
}
