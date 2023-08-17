package Java_08_Features.Interface;

interface Vehicle {

	public void start();

	public static void cleanStatic() {
		System.out.println("Cleaning Static Process Completed...........");
	}

	public default void cleanDefault() {
		System.out.println("Cleaning Default Process Completed...........");
	}
}

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car started......");
	}

	/*
	 * //We can Override it inside class//
	 * public void cleanDefault() {
	 * System.out.println("Cleaning Default Process Completed...........");
	 *  }
	 */
	
	public static void main(String[] args) {
		Car car = new Car();
		car.cleanDefault();
		car.start();
		Vehicle.cleanStatic();
	}
}
