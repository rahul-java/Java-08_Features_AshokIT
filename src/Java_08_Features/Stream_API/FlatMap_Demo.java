package Java_08_Features.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap_Demo {

	public static void main(String[] args) {
		
	List<String> javaList = Arrays.asList("microservices","core java","adv java","springboot");
	List<String> uiList = Arrays.asList("html","css","java script","bootstrap");
	
	List<List<String>> coursesList = Arrays.asList(javaList,uiList);
	
	//Approach 1
	coursesList.stream().forEach(c->System.out.println(c));
	
	System.out.println("--------------------------");
	//Approach 2
	Stream<String> stream = coursesList.stream().flatMap(c->c.stream());
	stream.forEach(c->System.out.println(c));
	}
}


