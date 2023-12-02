package Java_08_Features.Stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question3 {

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
		
		//write program to group by age from given employees data using stream api.
		
		
		Map<Integer, List<Employee>> collect = empList.stream().collect(Collectors.groupingBy(e->e.age));
		System.out.println("Group By Age ::: "+collect); //Group By Age ::: {24=[Employee [name=Deepa, age=24, salary=35000.0]], 28=[Employee [name=Sapna, age=28, salary=28000.0]], 30=[Employee [name=Rahul, age=30, salary=45000.0], Employee [name=Amrit, age=30, salary=50000.0]], 31=[Employee [name=Amit, age=31, salary=85000.0], Employee [name=Priya, age=31, salary=32000.0]]}

	}
}


