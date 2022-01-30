package Polymorphism;

public class Toyota extends Car{
	private boolean electric;

	public Toyota(int numCylinder, String model, boolean electric) {
		super(numCylinder, model);
		this.electric = electric;
	}

	@Override
	public void Brake(int speed) {
		System.out.println("Tyota model "+model+" brake is not ABS.");
	}

	@Override
	public void Accelerate(double power) {
		System.out.println("Toyota accelerate at "+power);
	}

	@Override
	public void engineTurn(int rpm) {
		super.engineTurn(rpm);
	}
	
	

}
