package Java_08_Features.Functional_Interface.Function.BiFunction;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		
		// here 3 integer are first two are input and 3rd is return
		BiFunction<Integer, Integer, Integer> biFunction=(a,b)->a+b;
		
		System.out.println(biFunction.apply(10, 20)); 
	}
}
