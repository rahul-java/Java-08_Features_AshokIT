package Java_08_Features.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filter_with_map_Demo {

	public static void main(String[] args) {
		
	
		
		
		List<String> list = Arrays.asList("india","usa","uk","uae","japan");
		
		//print name with its length which start with 'u'
		
		list.stream()
		    .filter(c->c.startsWith("u"))
		    .map(c->c+"-"+c.length())
		    .forEach(l->System.out.println(l));
		
	}
}
