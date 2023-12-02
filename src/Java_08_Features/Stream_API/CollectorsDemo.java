package Java_08_Features.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {

	public static void main(String[] args) {
		
	Person p1 = new Person("Rahul", "India");
	Person p2 = new Person("Steve", "UK");
	Person p3 = new Person("Jim", "Japan");
	Person p4 = new Person("Uan", "China");
	Person p5 = new Person("Nangchu", "Nepal");
	Person p6 = new Person("Ravi", "India");
	
	List<Person> list = Arrays.asList(p1,p2,p3,p4,p5,p6);
	
	//Find only indian person
	 
	List<Person> collect = list.stream()
			                         .filter(p->p.country.equalsIgnoreCase("India"))
			                         .collect(Collectors.toList());
	
	System.out.println(collect);
	
	//collect name of persons who belong to india and store into names collections
	
	List<String> names = list.stream()
    .filter(p->p.country.equalsIgnoreCase("India"))
    .map(p->p.name)
    .collect(Collectors.toList());
	
	System.out.println("---------------------");
	System.out.println(names);
	}
}


	
	



