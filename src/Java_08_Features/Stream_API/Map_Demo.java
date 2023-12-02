package Java_08_Features.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Map_Demo {

	public static void main(String[] args) {
		
	
		
		
		List<String> list = Arrays.asList("india","usa","uk","uae","japan");
		
		//Approach-1
		for(String c:list) {
			System.out.println(c.toUpperCase());
		}
		
		System.out.println("==========");
		//Approach 2
		
		Stream<String> stream = list.stream();
		Stream<String> map = stream.map(c->c.toUpperCase());
		map.forEach(n->System.out.println(n));
		
		System.out.println("$$$$$$$$$$$$$$");
		list.stream().map(c->c.toUpperCase()).forEach(c->System.out.println(c));
		list.stream().map(c->c.length()).forEach(c->System.out.println(c));
		System.out.println("----------------");
		list.stream().mapToInt(c->c.length()).forEach(c->System.out.println(c));
		
	}
}
