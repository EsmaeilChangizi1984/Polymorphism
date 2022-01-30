package Polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car(4,"Shevy");
		car.Brake(0);
		
		Mitsubishi mitsubishi = new Mitsubishi(4,"RVR",10);
		mitsubishi.Accelerate(120);
		mitsubishi.Brake(200);
		mitsubishi.engineTurn(3800);
		
		System.out.println();
		
		Toyota toyota = new Toyota(6,"Lexus",true);
		toyota.Accelerate(100);
		toyota.Brake(120);
		toyota.engineTurn(3400);
		
		System.out.println();
		
		Honda honda = new Honda(4,"CRV",23);
		honda.Accelerate(200);
		honda.Brake(233);
		honda.engineTurn(3200);

	}

}
