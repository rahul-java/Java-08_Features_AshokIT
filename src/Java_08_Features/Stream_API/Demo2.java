package Java_08_Features.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		
	
		//Approach-1
		
		List<Integer> list = Arrays.asList(10,25,321,15,401,19,55,66);
		
		for(Integer no:list)
		{
			if(no>50)
				System.out.println(no);
		}
		System.err.println("==============================================================");
		//Approach-1
		
		Stream<Integer> stream1=Stream.of(10,25,321,401,55,66);
		
		//OR
		
		Stream<Integer> stream = list.stream();
		Stream<Integer> filter = stream.filter(no->no>100);
		filter.forEach(i->System.out.println(i));
		
		//OR
		
		System.err.println("==============================================================");
		//Approach-2
		
		list.stream().filter(no->no>20).forEach(i->System.out.println(i));
		
	}
}
