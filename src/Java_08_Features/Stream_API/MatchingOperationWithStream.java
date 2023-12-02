package Java_08_Features.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MatchingOperationWithStream {

	public static void main(String[] args) {
		
	Person p1 = new Person("Rahul", "India");
	Person p2 = new Person("Steve", "UK");
	Person p3 = new Person("Jim", "Japan");
	Person p4 = new Person("Uan", "China");
	Person p5 = new Person("Nangchu", "Nepal");
	Person p6 = new Person("Ravi", "India");
	
	List<Person> list = Arrays.asList(p1,p2,p3,p4,p5,p6);
	
	boolean anyMatch = list.stream().anyMatch(p->p.country.equalsIgnoreCase("india"));
	System.out.println("Any Indian Available : "+anyMatch);
	
	boolean anyMatch1 = list.stream().anyMatch(p->p.country.equalsIgnoreCase("USA"));
	System.out.println("Any USA Available : "+anyMatch1);
	
	boolean anyMatch3 = list.stream().allMatch(p->p.country.equalsIgnoreCase("india"));
	System.out.println("All Persons are Indians : "+anyMatch3);
	
	boolean anyMatch4 = list.stream().noneMatch(p->p.country.equalsIgnoreCase("mexico"));
	System.out.println("None from MEXICO : "+anyMatch4);
	
	System.out.println("-------These are Terminal Operation-----------");
   
	
	
	}
}

class Person{
	String name;
	String country;
	public Person(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}
	
	
}


