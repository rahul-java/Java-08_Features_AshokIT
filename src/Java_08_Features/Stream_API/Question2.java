package Java_08_Features.Stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question2 {

	public static void main(String[] args) {
		
	//get emp name whose salary is >=50000
		
		Employee e1 = new Employee("Rahul", 30, 45000.00);
		Employee e2 = new Employee("Amit", 31, 85000.00);
		Employee e3 = new Employee("Amrit", 30, 50000.00);
		Employee e4 = new Employee("Deepa", 24, 35000.00);
		Employee e5 = new Employee("Sapna", 28, 28000.00);
		Employee e6 = new Employee("Priya", 31, 32000.00);
		
		List<Employee> empList = Arrays.asList(e1,e2,e3,e4,e5,e6);
		Stream<Employee> stream = Stream.of(e1,e2,e3,e4,e5,e6);
		
		//write program to get max , min , avg salary from given employees data using stream api.
		
		//max salary
		Optional<Employee> maxSal = empList.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
		System.out.println("MAX SALARY ::: "+maxSal.get());
		
		//min salary
		Optional<Employee> minSal = empList.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));
		System.out.println("MIN SALARY ::: "+minSal.get());
		
		//avg sal
		Double avgSal = empList.stream().collect(Collectors.averagingDouble(e->e.salary));
		System.out.println("AVG SALARY ::: "+avgSal);
	}
}


