package Java_08_Features.Stream_API;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream_Demo {

	public static void main(String[] args) {
		
		//declaration of Stream variable.
		
		//Approach-1
		Stream<Integer> stream1=Stream.of(1,2,3,4,5,6);
		
		ArrayList<String> name = new ArrayList<>();
		name.add("Robert");
		name.add("John");
		name.add("Orlen");
		name.add("Jonathan");
		
		//Approach-2
		Stream<String> stream2 = name.stream();
		
	}
}
