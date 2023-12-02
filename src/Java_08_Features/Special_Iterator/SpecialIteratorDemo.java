package Java_08_Features.Special_Iterator;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpecialIteratorDemo {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("sachin","sehwag","rahul","dhoni","ganguly");
		Spliterator<String> spliterator = list.stream().spliterator();
		spliterator.forEachRemaining(n->System.out.println(n));
	}

}
