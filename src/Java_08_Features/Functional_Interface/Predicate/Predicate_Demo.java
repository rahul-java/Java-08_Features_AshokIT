package Java_08_Features.Functional_Interface.Predicate;

import java.util.function.Predicate;

public class Predicate_Demo {

	//method without lambda
	public boolean test(int i)
	{
		if(i>10)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
	 Predicate<Integer> predicate=i -> i>10;
	 System.out.println(predicate.test(50));
	 System.out.println(predicate.test(5));
	}
}
