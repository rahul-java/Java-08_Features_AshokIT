package Java_08_Features.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Find {

	public static void main(String[] args) {
		
	Person p1 = new Person("Rahul", "India");
	Person p2 = new Person("Steve", "UK");
	Person p3 = new Person("Jim", "Japan");
	Person p4 = new Person("Uan", "China");
	Person p5 = new Person("Nangchu", "Nepal");
	Person p6 = new Person("Ravi", "India");
	
	List<Person> list = Arrays.asList(p1,p2,p3,p4,p5,p6);
	
	//findFirst()
	Optional<Person> findFirst = list.stream()
			                         .filter(p->p.country.equalsIgnoreCase("India"))
			                         .findFirst();
	if (findFirst.isPresent()) {
		System.out.println("findFirst() ::: "+findFirst.get());
	}else {
		System.out.println("NULL Value Found");
	}
	
	//findAny()
	Optional<Person> findAny = list.stream()
            .filter(p->p.country.equalsIgnoreCase("India"))
            .findAny();
	if (findAny.isPresent()) {
		System.out.println("findAny() ::: "+findAny.get());
	}else {
		System.out.println("NULL Value Found");
	}
	
	}
}


	
	



