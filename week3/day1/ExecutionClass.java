package week3.day1;

public class ExecutionClass {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.enableAirBag();
		int carWheelCount = b.carWheelCount;
		System.out.println("carWheelCount:" + carWheelCount);
		
		b.driveVehicle();
		b.applyBrake();
		b.applyGear();
		b.startEngine();
		
		
		Audi a = new Audi();
		a.enableAirBag();
		int audiWheelCount = a.carWheelCount;
		System.out.println("audiWheelCount: " + audiWheelCount);
		
		a.driveVehicle();
		a.startEngine();
		a.applyBrake();
		a.applyGear();
		
		
		
		
		
		
		
	}

}
