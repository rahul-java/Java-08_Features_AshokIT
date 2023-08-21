package Java_08_Features.Functional_Interface.Function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<String, Integer> function=(name)->name.length();
		
		System.out.println(function.apply("RahulKumarPandey"));
		System.out.println(function.apply("Hyd"));
		System.out.println(function.apply("SpringBoot"));
	}
}
