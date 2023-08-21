package Java_08_Features.Functional_Interface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_Join_Demo4 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Raju", "Chennai", "DevOps");
		Employee e2 = new Employee("Ramu", "Pune", "Networking");
		Employee e3 = new Employee("Amit", "Delhi", "DB");
		Employee e4 = new Employee("Manish", "Noida", "Testing");
		Employee e5 = new Employee("Ashok", "Hyd", "DB");
		
		List<Employee> employeeList = Arrays.asList(e1,e2,e3,e4,e5);
		
		Predicate<Employee> predicate1=emp -> emp.location.equals("Delhi");
		Predicate<Employee> predicate2=emp -> emp.dept.equals("DB");
		Predicate<Employee> predicate3=emp -> emp.name.startsWith("A");
		
		//predicate joining
		
		//Predicate<Employee> predicate = predicate1.and(predicate2);
		
		//Predicate<Employee> predicate = predicate1.or(predicate2);
		
		Predicate<Employee> predicate = predicate1.and(predicate2).and(predicate3);
		
		for(Employee employee:employeeList)
		{
			if(predicate.test(employee))
				System.out.println(employee.name);
		} 
	}
}

class Employee {

	String name;
	String location;
	String dept;
	
	Employee(String name,String location,String dept)
	{
		this.name=name;
		this.location=location;
		this.dept=dept;
	}
}

