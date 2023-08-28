package Java_08_Features.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Approach-1 without LAMBDA
public class ForEachDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList();
		arrayList.add(1);
		arrayList.add(12);
		arrayList.add(101);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(7);
		arrayList.add(10);
		arrayList.add(15);
		
		for(int i=0;i<arrayList.size();i++)
		{
			System.out.println("Normal For Loop ::: "+arrayList.get(i));
		}
		
		System.out.println("===========================================================");
		
		for(int i:arrayList)
		{
			System.out.println("for each For Loop ::: "+i);
		}
		
		System.out.println("============================forEach===============================");
		
		arrayList.forEach(i->System.out.println(" ForEach with Lambda Consumer Interface ::: "+i));
		
	}
}


