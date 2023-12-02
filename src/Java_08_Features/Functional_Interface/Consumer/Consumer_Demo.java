package Java_08_Features.Functional_Interface.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Demo {

	public static void main(String[] args) {
		
		Consumer<String> consumer=(name)-> System.out.println(name+" , Good Evening ");
		consumer.accept("Ram");
		consumer.accept("John");
		consumer.accept("Raju");
		
		List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
		
		//to iterate the list using foreach() 
		numbers.forEach(i->System.out.println(i));  // this lambda works as a consumer
		
	}
}
