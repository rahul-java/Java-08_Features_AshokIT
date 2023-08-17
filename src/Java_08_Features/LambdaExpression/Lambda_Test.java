package Java_08_Features.LambdaExpression;

@FunctionalInterface
interface MyInterfaceTwo{
	public void m2();
}
public class Lambda_Test {


	public static void main(String[] args) {
		MyInterfaceTwo myInterfaceTwo=() -> System.out.println("m2() method called By using LAMBDA EXPRESSION........");
		myInterfaceTwo.m2();
	}
}
