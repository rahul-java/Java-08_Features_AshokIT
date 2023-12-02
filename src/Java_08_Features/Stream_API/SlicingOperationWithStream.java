package Java_08_Features.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SlicingOperationWithStream {

	public static void main(String[] args) {
		
	List<String> javaList = Arrays.asList("microservices","core java","adv java","springboot","rest api");
	
	//get only first 3 record
	Stream<String> limit = javaList.stream().limit(3);
	limit.forEach(e->System.out.println(e));
	System.out.println("------------");
	javaList.stream().limit(3).forEach(e->System.out.println(e));
	
	//skip first 3 records
	System.out.println("@@@@@@@@@@@@@@@@@");
	javaList.stream().skip(3).forEach(e->System.out.println(e));
	
	List<String> uiList = Arrays.asList("html","css","java script","bootstrap","html","css","react","angular");
	
	//get the uniqe record or distinct record
	System.out.println("***********************");
	uiList.stream().distinct().forEach(e->System.out.println(e));
	
	//All the above 3 methods are comes under intermediate Operations
	
	
	}
}


