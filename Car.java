package Polymorphism;

public class Car {
	private boolean fourWheelDrive;
	private int numCylinder;
	protected String model;
	private double engineCap;
	
	public Car(int numCylinder, String model) {

		this.fourWheelDrive = true;
		this.numCylinder = numCylinder;
		this.model = model;
		this.engineCap = 2400;
	}

	public boolean isFourWheelDrive() {
		return fourWheelDrive;
	}

	public int getNumCylinder() {
		return numCylinder;
	}

	public String getModel() {
		return model;
	}

	public double getEngineCap() {
		return engineCap;
	}
	
	public void Brake(int speed) {
		if(speed == 0) {
			System.out.println("Car brake works properly");
		}else {
			System.out.println("Brakes Not work properly");
		}
	}
	
	public void Accelerate(double power) {
		System.out.println("Accelerate of car is "+ power);
	}
	
	public void engineTurn(int rpm) {
		System.out.println("Cars Engine turn is "+rpm+" in a minute");
	}
	
	

}
