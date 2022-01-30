package Polymorphism;

public class Mitsubishi extends Car{
	
	private int Warranty;

	public Mitsubishi(int numCylinder, String model, int warranty) {
		super(numCylinder, model);
		this.Warranty = warranty;
	}

	@Override
	public void Brake(int speed) {
		System.out.println("Mitsubishi "+model+" with the speed of"
				+speed+ " brake is ABS.");
	}

	@Override
	public void Accelerate(double power) {
		System.out.println("Mitsubishi accelerate is "+power);
	}

	@Override
	public void engineTurn(int rpm) {
		System.out.println("Mitsubishi engine turns "+rpm+" in a minute and has "
				+this.Warranty+ " years of warranty.");
	}	
	

}
