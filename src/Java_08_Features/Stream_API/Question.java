package Java_08_Features.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question {

	public static void main(String[] args) {
		
	//get emp name whose salary is >=50000
		
		Employee e1 = new Employee("Rahul", 30, 45000);
		Employee e2 = new Employee("Amit", 31, 85000);
		Employee e3 = new Employee("Amrit", 30, 50000);
		Employee e4 = new Employee("Deepa", 24, 35000);
		Employee e5 = new Employee("Sapna", 28, 28000);
		Employee e6 = new Employee("Priya", 30, 32000);
		
		List<Employee> empList = Arrays.asList(e1,e2,e3,e4,e5,e6);
		Stream<Employee> stream = Stream.of(e1,e2,e3,e4,e5,e6);
		
		//Approach-1
		stream.filter(e->e.salary>=50000)
		      .map(e->e.name+"-"+e.age)
		      .forEach(s->System.out.println(s));
		
		System.out.println("------------------------");
		//Approach-2
		empList.stream().filter(e->e.salary>=50000)
		                .forEach(e->System.out.println(e.name+" : "+e.age));
		
	}
}

class Employee{
	String name;
	int age;
	double salary;
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
}
