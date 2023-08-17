package Java_08_Features.LambdaExpression;

interface MyInterfaceOne{
	public void m1();
}

public class Lambda_WithoutLambda implements MyInterfaceOne{

	
	public void m1() {
	System.out.println("m1() method called......");
		
	}
	
	public static void main(String[] args) {
		Lambda_WithoutLambda Lambda_WithoutLambda = new Lambda_WithoutLambda();
		Lambda_WithoutLambda.m1();
	}

}
