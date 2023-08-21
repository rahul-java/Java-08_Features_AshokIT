package Java_08_Features.Functional_Interface.Predicate.BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		
		//to take 2 input we use bipredicate
		//any functional interface which accept two input is bi...
		//biPredicate
		//biConsumer
		//biFunction
	
		 BiPredicate<Integer,Integer> biPredicate=(i,j) -> (i+j)>100;
		 
		 System.out.println(biPredicate.test(50,100));
		 System.out.println(biPredicate.test(5,10));
		 
		 
	}
}
