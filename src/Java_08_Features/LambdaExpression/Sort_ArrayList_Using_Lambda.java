package Java_08_Features.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;

@FunctionalInterface
interface MyInterfaceThree{
	public void m3();
}
public class Sort_ArrayList_Using_Lambda {


	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(105);
		list.add(107);
		list.add(115);
		list.add(125);
		list.add(100);
		list.add(115);
		list.add(109);
		list.add(101);
		
		System.out.println(list);
		MyInterfaceThree myInterfaceThree=() -> System.out.println("m2() method called By using LAMBDA EXPRESSION........");
		
		Collections.sort(list, (n1,n2)->n1<n2?-1:0);
		System.out.println(list);
		myInterfaceThree.m3();
	}
}
