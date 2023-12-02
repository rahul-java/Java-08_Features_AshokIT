package Java_08_Features.Method_Reference;

import java.util.function.Consumer;
import java.util.function.Supplier;

@FunctionalInterface
interface MyInterface{
	public void m1();
}

public class MethodReferenceDemo {

	public static void m2()
	{
		System.out.println("This is m2() method.....");
	}
	public static void main(String[] args) {
		
		Consumer<String> consumer=(msg)->System.out.println(msg);
		consumer.accept("Hi");
		
		MethodReferenceDemo.m2(); //before 1.8
		MethodReferenceDemo:m2(); //after 1.8
		
		MyInterface mi=MethodReferenceDemo::m2; //method reference
		mi.m1();
		
		MyInterface mi2=()->System.out.println("HHHHiiiiii"); // here we use lambda expression
		mi2.m1();
		
	}
}
