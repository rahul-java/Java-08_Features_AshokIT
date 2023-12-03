package Java_08_Features.Stream_API.Interview_Q;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Question1 {

	public static void main(String[] args) {
		
		
		ArrayList<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1, 32, "jessy", "female", "HR", 2011, 25000.0));
		empList.add(new Employee(2, 25, "Smith", "male", "Sales", 2015, 13500.0));
		empList.add(new Employee(3, 29, "David", "male", "Infrastructure", 2012, 18000.0));
		empList.add(new Employee(4, 28, "Orlen", "male", "Development", 2014, 32500.0));
		empList.add(new Employee(5, 27, "Charles", "male", "HR", 2013, 22700.0));
		empList.add(new Employee(6, 43, "Cathy", "female", "Security", 2016, 10500.0));
		empList.add(new Employee(7, 35, "Ramesh", "male", "Finance", 2010, 27000.0));
		empList.add(new Employee(8, 31, "Suresh", "male", "Development", 2015, 34500.0));
		empList.add(new Employee(9, 24, "Gita", "female", "Sales", 2016, 11000.5));
		empList.add(new Employee(10, 27, "Gauri", "female", "Infrastructure", 2014, 15700.0));
		empList.add(new Employee(11, 25, "Nitin", "male", "Development", 2016, 28200.0));
		empList.add(new Employee(12, 38, "Mahesh", "male", "Security", 2015, 11500.0));
		empList.add(new Employee(13, 27, "Swathi", "female", "Finance", 2013, 21300.0));
		empList.add(new Employee(14, 24, "Buttler", "male", "Sales", 2017, 10700.5));
		empList.add(new Employee(15, 23, "Ashok", "male", "Infrastructure", 2018, 12700.0));
		empList.add(new Employee(16, 26, "Jaanvi", "female", "Development", 2015, 28900.0));
		empList.add(new Employee(17, 31, "Rahul", "male", "Development", 2022, 44800.0));
		
		//How many male and female emplpoyee are there in the organization.
		System.out.println("1. How many male and female emplpoyee are there in the organization."); 
		Map<String, Long> map = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(map);
		
		//Print the name of all the departments.
		System.out.println("2. Print the name of all the departments.");
		empList.stream().map(e->e.getDepartment()).distinct().forEach(d->System.out.println(d));
		//empList.stream().map(Employee::getDepartment).distinct().forEach(d->System.out.println(d));
		
		//What is the Average age of male and female employees
		System.out.println("3. What is the Average age of male and female employees");
		Map<String, Double> map2 = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println(map2);
		
		
		//Get the details of highest paid employee in the organization.
		System.out.println("4. Get the details of highest paid employee in the organization.");
		Optional<Employee> optional = empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}else {
			System.out.println("None");
		}
		
		
		//Get the names of all Employees who have joined after 2015.
		System.out.println("5. Get the names of all Employees who have joined after 2015.");
		empList.stream().filter(e->e.getYearOfJoining()>2015).map(e->e.getName()).forEach(n->System.out.println(n));
		//List<Employee> collect = empList.stream().filter(e->e.getYearOfJoining()>2015).collect(Collectors.toList());
		//System.out.println(collect);
		
		
		//Count the number of employees in each department.
		System.out.println("6. Count the number of employees in each department.");
		Map<String, Long> collect1 = empList.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.counting()));
		System.out.println(collect1);
		
		//what is the average salary of each department.
		System.out.println("7. what is the average salary of each department.");
		Map<String, Double> map3 = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(map3);
		
		//Get the details of youngest male employee in the Development department.
		System.out.println("8. Get the details of youngest male employee in the Development department.");
		//Optional<Employee> optional2 = empList.stream().filter(e->e.gender.equalsIgnoreCase("male")&&e.getDepartment().equalsIgnoreCase("Development")).collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
		Optional<Employee> optional2 = empList.stream().filter(e->e.gender.equalsIgnoreCase("male")&&e.getDepartment().equalsIgnoreCase("Development")).min(Comparator.comparing(Employee::getAge));
		if(optional2.isPresent())
			System.out.println(optional2.get());
		
		
		//Who has the most working experience in the organization
		System.out.println("9. Who has the most working experience in the organization");
		//Optional<Employee> min = empList.stream().min(Comparator.comparing(Employee::getYearOfJoining));
		Optional<Employee> min = empList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		if(min.isPresent())
		{
			System.out.println(min.get());
		}
		
		//How many employees are there in sales team.
		System.out.println("10. How many employees are there in sales team.");
		Map<String, Long> map4 = empList.stream().filter(e->e.getDepartment().equalsIgnoreCase("sales")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(map4);
		
		
		//What is the Avg salary of male and female employees.
		System.out.println("11. What is the Avg salary of male and female employees.");
		Map<String, Double> map5 = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(map5);
		
		//List down the names of employees in each department.
		System.out.println("12. List down the names of employees in each department.");
		//Map<String, Long> map6 = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		//System.out.println(map6);
		
		//what is the avg salary an total salary of the whole organization.
		System.out.println("13. what is the avg salary an total salary of the whole organization.");
		Double double1 = empList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println("Avg Salary ::: "+double1);
		Double double2 = empList.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println("Total salary ::: "+double2);
		
		
		//Seperate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
		System.out.println("14. Seperate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");
		//empList.stream().collect(Collectors.filtering(Employee::getAge,Collectors.toList()));
		
		//Who is the oldest employee in the organization? what is his age and which department he belongs to?
		System.out.println("15. Who is the oldest employee in the organization? what is his age and which department he belongs to?");
		empList.stream().max(Comparator.comparing(Employee::getAge)).ifPresent(e->System.out.println(e.getName()+" :: "+e.getAge()+" :: "+e.getDepartment()));
	}
}
