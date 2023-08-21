package Java_08_Features.Functional_Interface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_Demo3 {

	public static void main(String[] args) {
		
		Person p1 = new Person("Rkp", 19);
		Person p2 = new Person("RKT", 9);
		Person p3 = new Person("Raju", 90);
		Person p4 = new Person("Rakesh", 1);
		
		List<Person> personList = Arrays.asList(p1,p2,p3,p4);
		
		Predicate<Person> predicate=p -> p.age>=18; 
		
		for(Person person:personList)
		{
			if(predicate.test(person))
				System.out.println(person.name);
		} 
	}
}

class Person {

	String name;
	Integer age;
	
	Person(String name,Integer age)
	{
		this.age=age;
		this.name=name;
	}
}

