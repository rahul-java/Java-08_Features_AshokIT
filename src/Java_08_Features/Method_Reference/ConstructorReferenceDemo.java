package Java_08_Features.Method_Reference;

import java.util.function.Supplier;

public class ConstructorReferenceDemo {

	public static void main(String[] args) {
		
		//Doctor doctor = new Doctor();
		
		Supplier<Doctor> supplier=Doctor::new;
		Doctor doctor = supplier.get();
		System.out.println(doctor.hashCode());
	}
	
}

class Doctor
{
	public Doctor()
	{
		System.out.println("Doctor Constructor Called....");
	}
	
	public Doctor(int i)
	{
		System.out.println("Doctor Parameterized Constructor Called...."+i);
	}
}