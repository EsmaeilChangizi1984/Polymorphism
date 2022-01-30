package Polymorphism;

public class Honda extends Car{
	private int airBag;

	public Honda(int numCylinder, String model, int airBag) {
		super(numCylinder, model);
		this.airBag = airBag;
	}

	@Override
	public String getModel() {
		return this.model;
	}

	@Override
	public void Brake(int speed) {
		super.Brake(speed);
		
	}

	@Override
	public void Accelerate(double power) {
		System.out.println("Honda accelerates at "+power);
	}

	@Override
	public void engineTurn(int rpm) {
		System.out.println("Honda engine turn is "+rpm+" with "+this.airBag+" air bag.");
	}

	
}
