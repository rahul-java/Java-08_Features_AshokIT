package Java_08_Features.Functional_Interface.Predicate;

import java.util.function.Predicate;

public class Predicate_Demo2 {

	public static void main(String[] args) {
		
		String[] names= {"Anushka","Anupama","Deepika","Kajol","Katrina","Shushmita"};
		Predicate<String> predicate=name -> name.charAt(0)=='A';
		for(String name:names)
		{
			if(predicate.test(name))
				System.out.println(name);
		}
	}
}
