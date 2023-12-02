package Java_08_Features.Parellel_Stream;

import java.util.stream.Stream;

public class ParellelStreamDemo {

	public static void main(String[] args) {
		
		System.out.println("========== Serial Stream================");
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
		stream1.forEach(n->System.out.println(n +" ::: "+Thread.currentThread()));
	
		System.out.println("========== Parellel Stream================");
		Stream<Integer> stream2 = Stream.of(10,20,30,40,50);
		stream2.parallel().forEach(n->System.out.println(n +" ::: "+Thread.currentThread()));
	}
}